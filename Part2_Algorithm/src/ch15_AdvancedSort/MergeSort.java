package ch15_AdvancedSort;

import java.util.ArrayList;

public class MergeSort {

    public ArrayList<Integer> mergeFunc(ArrayList<Integer> leftList, ArrayList<Integer> rightList) {
        ArrayList<Integer> mergedList = new ArrayList<Integer>();
        int leftPoint = 0;
        int rightPoint = 0;

        // CASE1: left/right 둘 다 있을 때
        while (leftList.size() > leftPoint && rightList.size() > rightPoint) {
            if (leftList.get(leftPoint) > rightList.get(rightPoint)) {
                mergedList.add(rightList.get(rightPoint));
                rightPoint++;
            } else {
                mergedList.add(leftList.get(leftPoint));
                leftPoint++;
            }
        }

        // CASE2: right 데이터가 없을 때
        while (leftList.size() > leftPoint) {
            mergedList.add(leftList.get(leftPoint));
            leftPoint++;
        }

        // CASE3: left 데이터가 없을 때
        while(rightList.size() > rightPoint) {
            mergedList.add(rightList.get(rightPoint));
            rightPoint++;
        }
        return mergedList;
    }

    public ArrayList<Integer> mergeSplitFune(ArrayList<Integer> dataList) {
        if (dataList.size() <= 1) return dataList;

        int medium = dataList.size()/2;

        ArrayList<Integer> leftArr = new ArrayList<Integer>();
        ArrayList<Integer> rightArr = new ArrayList<Integer>();

        leftArr = this.mergeSplitFune(new ArrayList<Integer>(dataList.subList(0, medium))); // 0부터 medium-1 까지 추출
        rightArr = this.mergeSplitFune(new ArrayList<Integer>(dataList.subList(medium, dataList.size())));

        return mergeFunc(leftArr, rightArr);
    }
}
