package ch20_AdvancedGraphSearch;

public class EdgeAP implements Comparable<EdgeAP> {
    public String node;
    public int weight;

    public EdgeAP(String node, int weight) {
        this.weight = weight;
        this.node = node;
    }

    public String toString() {
        return "(" + this.weight + ", " + this.node + ")";
    }

    @Override
    public int compareTo(EdgeAP o) {
        return this.weight - o.weight;
    }
}