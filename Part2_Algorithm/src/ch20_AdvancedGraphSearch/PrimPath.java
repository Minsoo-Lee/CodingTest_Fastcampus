package ch20_AdvancedGraphSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class PrimPath {
    public ArrayList<EdgeP> primFunc(String startNode, ArrayList<EdgeP> edges) {
        EdgeP currentEdge, poppedEdge, adjacentEdgeNode;

        ArrayList<EdgeP> currentEdgeList, candidateEdgeList, adjacentEdgesNodes;
        PriorityQueue<EdgeP> priorityQueue;

        ArrayList<String> connectedNodes = new ArrayList<>();
        ArrayList<EdgeP> mst = new ArrayList<EdgeP>();
        HashMap<String, ArrayList<EdgeP>> adjacentEdges = new HashMap<String, ArrayList<EdgeP>>();

        for (int index = 0; index < edges.size(); index++) {
            currentEdge = edges.get(index);
            if (!adjacentEdges.containsKey(currentEdge.node1)) {
                adjacentEdges.put(currentEdge.node1, new ArrayList<EdgeP>());
            }
            if (!adjacentEdges.containsKey(currentEdge.node2)) {
                adjacentEdges.put(currentEdge.node2, new ArrayList<EdgeP>());
            }
        }

        for (int index=0; index<edges.size(); index++) {
            currentEdge = edges.get(index);
            currentEdgeList = adjacentEdges.get(currentEdge.node1);
            currentEdgeList.add(new EdgeP(currentEdge.weight, currentEdge.node1, currentEdge.node2));
            currentEdgeList = adjacentEdges.get(currentEdge.node2);
            currentEdgeList.add(new EdgeP(currentEdge.weight, currentEdge.node2, currentEdge.node1));
        }

        connectedNodes.add(startNode);
        candidateEdgeList = adjacentEdges.getOrDefault(startNode, new ArrayList<EdgeP>());
        priorityQueue = new PriorityQueue<EdgeP>();
        for (int index=0; index<candidateEdgeList.size(); index++) {
            priorityQueue.add(candidateEdgeList.get(index));
        }

        while (priorityQueue.size() > 0) {
            poppedEdge = priorityQueue.poll();
            if (!connectedNodes.contains(poppedEdge.node2)) {
                // 해당 edge를 mst에 추가
                connectedNodes.add(poppedEdge.node2);
                mst.add(new EdgeP(poppedEdge.weight, poppedEdge.node1, poppedEdge.node2));

                adjacentEdgesNodes = adjacentEdges.getOrDefault(poppedEdge.node2, new ArrayList<EdgeP>());
                for (int index = 0; index < adjacentEdgesNodes.size(); index++) {
                    adjacentEdgeNode = adjacentEdgesNodes.get(index);
                    if (!connectedNodes.contains(adjacentEdgeNode.node2)) {
                        priorityQueue.add(adjacentEdgeNode);
                    }
                }
            }
        }
        return mst;
    }
}
