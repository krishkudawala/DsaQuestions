package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {

    PriorityQueue<Integer> maxheap; // smaller half
    PriorityQueue<Integer> minheap; // larger half

    public MedianFinder() {
        maxheap = new PriorityQueue<>(Collections.reverseOrder());
        minheap = new PriorityQueue<>();
    }

    public void addNum(int num) {

        if (maxheap.isEmpty() || num <= maxheap.peek()) {
            maxheap.add(num);
        } else {
            minheap.add(num);
        }

        // Balance heaps
        if (maxheap.size() > minheap.size() + 1) {
            minheap.add(maxheap.remove());
        }

        if (minheap.size() > maxheap.size() + 1) {
            maxheap.add(minheap.remove());
        }
    }

    public double findMedian() {

        if (maxheap.size() == minheap.size()) {
            return (maxheap.peek() + minheap.peek()) / 2.0;
        }

        if (maxheap.size() > minheap.size()) {
            return maxheap.peek();
        }

        return minheap.peek();
    }
}

public class LeetCode295 {

    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        System.out.println("Median: " + mf.findMedian());

        mf.addNum(2);
        System.out.println("Median: " + mf.findMedian());

        mf.addNum(3);
        System.out.println("Median: " + mf.findMedian());

        mf.addNum(4);
        System.out.println("Median: " + mf.findMedian());
    }
}