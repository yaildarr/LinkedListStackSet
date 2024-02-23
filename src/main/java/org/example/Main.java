package org.example;

public class Main {
    public static void main(String[] args) throws EmptyElementException {
//        Stack stack = new Stack();
//        stack.push(5);
//        stack.push(7);
//        stack.push(7);
//        stack.push(9);
//        stack.print();
//        stack.pop();
//        stack.pop();
//        stack.print();
        Set<Integer> set = new Set<>();
        set.add(4);
        set.add(2);
        set.add(4);
        set.add(9);
        set.add(10);
        set.add(15);
        set.print();
        set.delete(10);
        set.print();
        System.out.println(set.contains(4));
        System.out.println(set.contains(80));
    }
}