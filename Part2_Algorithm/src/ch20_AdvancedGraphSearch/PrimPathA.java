package ch20_AdvancedGraphSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class PrimPathA {
    public ArrayList<Path> improvedPrimFunc(HashMap<String, HashMap<String, Integer>> graph, String startNode) {
        ArrayList<Path> mst = new ArrayList<Path>();
        PriorityQueue<EdgeAP> keys = new PriorityQueue<EdgeAP>();
        HashMap<String, EdgeAP> keysObjects = new HashMap<String, EdgeAP>();
        HashMap<String, String> pi = new HashMap<String, String>();
        Integer totalWeight = 0;
        HashMap<String, Integer> linkedEdges;
        EdgeAP edgeObject, poppedEdge, linkedEdge;

        for(String key : graph.keySet()) {
            if (key == startNode) {
                edgeObject = new EdgeAP(key, 0);
                pi.put(key, key);
            } else {
                edgeObject = new EdgeAP(key, Integer.MAX_VALUE);
                pi.put(key, null);
            }
            keys.add(edgeObject);
            keysObjects.put(key, edgeObject);
        }

        while(keys.size() > 0) {
            poppedEdge = keys.poll();
            keysObjects.remove(poppedEdge.node);

            mst.add(new Path(pi.get(poppedEdge.node), poppedEdge.node, poppedEdge.weight));
            totalWeight += poppedEdge.weight;

            linkedEdges = graph.get(poppedEdge.node);
            for (String adjacent : linkedEdges.keySet()) {
                if (keysObjects.containsKey(adjacent)) {
                    linkedEdge = keysObjects.get(adjacent);

                    if (linkedEdges.get(adjacent) < linkedEdge.weight) {
                        linkedEdge.weight = linkedEdges.get(adjacent);
                        pi.put(adjacent, poppedEdge.node);

                        // 우선순위 큐에 있는 데이터를 수정할 경우, 우선순위큐를 재조정해야 하므로, 간단히 삭제 후, 추가
                        keys.remove(linkedEdge);
                        keys.add(linkedEdge);
                    }
                }
            }
        }

        System.out.println(totalWeight);
        return mst;
    }
}
