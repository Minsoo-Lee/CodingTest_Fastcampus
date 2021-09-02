package ch20_AdvancedGraphSearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DijkstraPath {
    public HashMap<String, Integer> dijkstraFunc(HashMap<String, ArrayList<EdgeD>> graph, String start) {
        ArrayList<EdgeD> nodeList = new ArrayList<EdgeD>();
        EdgeD edgeDNode, adjacentNode;
        int currentDistance, weight, distance;
        String currentNode, adjacent;
        HashMap<String, Integer> distances = new HashMap<String, Integer>();

        for (String key: graph.keySet()) {
            distances.put(key, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        PriorityQueue<EdgeD> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new EdgeD(distances.get(start), start));

        while (priorityQueue.size() > 0) {
            edgeDNode = priorityQueue.poll();
            currentDistance = edgeDNode.distance;
            currentNode = edgeDNode.vertex;

            if (distances.get(currentNode) < currentDistance) {
                continue;
            }

            nodeList = graph.get(currentNode);
            for (int index=0; index<nodeList.size(); index++) {
                adjacentNode = nodeList.get(index);
                adjacent = adjacentNode.vertex;
                weight = adjacentNode.distance;
                distance = currentDistance + weight;

                if (distance < distances.get(adjacent)) {
                    distances.put(adjacent, distance);
                    priorityQueue.add(new EdgeD(distance, adjacent));
                }
            }
        }

        // 알고리즘 작성
        return distances;
    }

}
