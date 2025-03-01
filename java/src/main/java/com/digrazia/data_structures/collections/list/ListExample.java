package com.digrazia.data_structures.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {
    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        System.out.println("ArrayList: " + arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Cat");
        linkedList.add("Dog");
        System.out.println("LinkedList: " + linkedList);

        // Vector
        List<String> vector = new Vector<>();
        vector.add("One");
        vector.add("Two");
        System.out.println("Vector: " + vector);

        // Stack
        Stack<String> stack = new Stack<>();
        stack.push("First");
        stack.push("Second");
        System.out.println("Stack: " + stack);
    }
}
