package ch20_AdvancedGraphSearch;

public class EdgeD implements Comparable<EdgeD> {

    public int distance;
    public String vertex;

    public EdgeD(int distance, String vertex) {
        this.distance = distance;
        this.vertex = vertex;
    }

    // System.out.println()으로 객체 자체 출력시
    public String toString() {
        return "vertex: " + this.vertex + ", distance: " + this.distance;
    }

    @Override
    public int compareTo(EdgeD o) {
        return this.distance - o.distance;
    }
}
