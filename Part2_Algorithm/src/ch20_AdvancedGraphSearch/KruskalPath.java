package ch20_AdvancedGraphSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Arrays;

public class KruskalPath {
    HashMap<String, String> parent = new HashMap<String, String>();
    HashMap<String, Integer> rank = new HashMap<String, Integer>();

    public ArrayList<EdgeK> kruskalFunc(ArrayList<String> vertices, ArrayList<EdgeK> edges) {
        ArrayList<EdgeK> mst = new ArrayList<EdgeK>();
        EdgeK currentEdge;

        // 1. 초기화
        for (int index = 0; index<vertices.size(); index++) {
            this.makeSet(vertices.get(index));
        }

        // 2. 간선 weight 기반 sorting
        Collections.sort(edges);

        for (int index=0; index<edges.size(); index++) {
            currentEdge = edges.get(index);
            if (this.find(currentEdge.nodeV) != this.find(currentEdge.nodeU)) {
                this.union(currentEdge.nodeV, currentEdge.nodeU);
                mst.add(currentEdge);
            }
        }

        return mst;
    }

    public String find(String node) {
        // path compression 기법
        if (this.parent.get(node) != node) {
            this.parent.put(node, this.find(this.parent.get(node)));
        }
        return this.parent.get(node);
    }

    public void union(String nodeV, String nodeU) {
        String root1 = this.find(nodeV);
        String root2 = this.find(nodeU);

        // union-by-rank 기법
        if (this.rank.get(root1) > this.rank.get(root2)) {
            this.parent.put(root2, root1);
        } else {
            this.parent.put(root1, root2);
            if (this.rank.get(root1) == this.rank.get(root2)) {
                this.rank.put(root2, this.rank.get(root2) + 1);
            }
        }
    }

    public void makeSet(String node) {
        this.parent.put(node, node);
        this.rank.put(node, 0);
    }
}
