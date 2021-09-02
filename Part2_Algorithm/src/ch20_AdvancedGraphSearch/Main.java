package ch20_AdvancedGraphSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Dijkstra Path
        HashMap<String, ArrayList<EdgeD>> graph = new HashMap<String, ArrayList<EdgeD>>();
        graph.put("A", new ArrayList<EdgeD>(Arrays.asList(new EdgeD(8, "B"), new EdgeD(1, "C"), new EdgeD(2, "D"))));
        graph.put("B", new ArrayList<EdgeD>());
        graph.put("C", new ArrayList<EdgeD>(Arrays.asList(new EdgeD(5, "B"), new EdgeD(2, "D"))));
        graph.put("D", new ArrayList<EdgeD>(Arrays.asList(new EdgeD(3, "E"), new EdgeD(5, "F"))));
        graph.put("E", new ArrayList<EdgeD>(Arrays.asList(new EdgeD(1, "F"))));
        graph.put("F", new ArrayList<EdgeD>(Arrays.asList(new EdgeD(5, "A"))));

        DijkstraPath dObject = new DijkstraPath();
        // System.out.println(dObject.dijkstraFunc(graph, "A"));

        // Kruskal Path
        ArrayList<String> vetices = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
        ArrayList<EdgeK> edges = new ArrayList<EdgeK>();

        edges.add(new EdgeK(7, "A", "B"));
        edges.add(new EdgeK(5, "A", "D"));
        edges.add(new EdgeK(7, "B", "A"));
        edges.add(new EdgeK(8, "B", "C"));
        edges.add(new EdgeK(9, "B", "D"));
        edges.add(new EdgeK(7, "B", "E"));
        edges.add(new EdgeK(8, "C", "B"));
        edges.add(new EdgeK(5, "C", "E"));
        edges.add(new EdgeK(5, "D", "A"));
        edges.add(new EdgeK(9, "D", "B"));
        edges.add(new EdgeK(7, "D", "E"));
        edges.add(new EdgeK(6, "D", "F"));
        edges.add(new EdgeK(7, "E", "B"));
        edges.add(new EdgeK(5, "E", "C"));
        edges.add(new EdgeK(7, "E", "D"));
        edges.add(new EdgeK(8, "E", "F"));
        edges.add(new EdgeK(9, "E", "G"));
        edges.add(new EdgeK(6, "F", "D"));
        edges.add(new EdgeK(8, "F", "E"));
        edges.add(new EdgeK(11, "F", "G"));
        edges.add(new EdgeK(9, "G", "E"));
        edges.add(new EdgeK(11, "G", "F"));

        KruskalPath kObject = new KruskalPath();
        // System.out.println(kObject.kruskalFunc(vetices, edges));

        // Prim Path
        ArrayList<EdgeP> myedges = new ArrayList<EdgeP>();
        myedges.add(new EdgeP(7, "A", "B"));
        myedges.add(new EdgeP(5, "A", "D"));
        myedges.add(new EdgeP(8, "B", "C"));
        myedges.add(new EdgeP(9, "B", "D"));
        myedges.add(new EdgeP(7, "D", "E"));
        myedges.add(new EdgeP(5, "C", "E"));
        myedges.add(new EdgeP(7, "B", "E"));
        myedges.add(new EdgeP(6, "D", "F"));
        myedges.add(new EdgeP(8, "E", "F"));
        myedges.add(new EdgeP(9, "E", "G"));
        myedges.add(new EdgeP(11, "F", "G"));

        PrimPath pObject = new PrimPath();
        // System.out.println(pObject.primFunc("A", myedges));

        // Advanced Prim Path
        HashMap<String, HashMap<String, Integer>> mygraph = new HashMap<String, HashMap<String, Integer>>();

        HashMap<String, Integer> edgesAP;
        edgesAP = new HashMap<String, Integer>();
        edgesAP.put("B", 7);
        edgesAP.put("D", 5);
        mygraph.put("A", edgesAP);

        edgesAP = new HashMap<String, Integer>();
        edgesAP.put("A", 7);
        edgesAP.put("D", 9);
        edgesAP.put("C", 8);
        edgesAP.put("E", 7);
        mygraph.put("B", edgesAP);

        edgesAP = new HashMap<String, Integer>();
        edgesAP.put("B", 8);
        edgesAP.put("E", 5);
        mygraph.put("C", edgesAP);

        edgesAP = new HashMap<String, Integer>();
        edgesAP.put("A", 5);
        edgesAP.put("B", 9);
        edgesAP.put("E", 7);
        edgesAP.put("F", 6);
        mygraph.put("D", edgesAP);

        edgesAP = new HashMap<String, Integer>();
        edgesAP.put("B", 7);
        edgesAP.put("C", 5);
        edgesAP.put("D", 7);
        edgesAP.put("F", 8);
        edgesAP.put("G", 9);
        mygraph.put("E", edgesAP);

        edgesAP = new HashMap<String, Integer>();
        edgesAP.put("D", 6);
        edgesAP.put("E", 8);
        edgesAP.put("G", 11);
        mygraph.put("F", edgesAP);

        edgesAP = new HashMap<String, Integer>();
        edgesAP.put("E", 9);
        edgesAP.put("F", 11);
        mygraph.put("G", edgesAP);

        PrimPathA apObject = new PrimPathA();
        System.out.println(apObject.improvedPrimFunc(mygraph, "A"));
    }
}
