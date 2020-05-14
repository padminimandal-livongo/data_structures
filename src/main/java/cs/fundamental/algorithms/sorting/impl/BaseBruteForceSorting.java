package cs.fundamental.algorithms.sorting.impl;

import cs.fundamental.algorithms.sorting.Sort;

import java.util.Arrays;

public class BaseBruteForceSorting implements Sort {

    public int[] elements;

    @Override
    public int[] sort() {
        // Sorting using Arrays - Dual Pivot Quick Sort
        Arrays.sort(elements);
        return elements;
    }

    @Override
    public void display() {
        System.out.print("[ ");
        for(int data: elements) {
            System.out.print(data+ " ");
        }
        System.out.println("]");
    }
}
