package javaProgram.DSA;

import java.util.*;

public class linkedlist {
    public static void main(String[] args){
    LinkedList<String> list=new LinkedList<String>();
    list.add("is");
    list.add("a");
    list.addLast("List");
    list.addFirst("This");

    System.out.println(list);

    list.add(3,"linked");
    System.out.println(list);

    System.out.println(list.get(2));

    System.out.println(list.size());


    list.removeFirst();
    System.out.println(list);

    list.removeLast();
    System.out.println(list);
    
    list.remove(3);
    System.out.println(list);
    
    }

    
}
