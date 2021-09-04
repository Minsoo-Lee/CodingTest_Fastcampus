package ch21_BackTracking;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NQueen nObject = new NQueen();
        nObject.dfsFunc(4, 0, new ArrayList<Integer>());
    }
}
