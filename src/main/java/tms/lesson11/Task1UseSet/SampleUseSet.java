package tms.lesson11.Task1UseSet;

import java.util.HashSet;
import java.util.Set;

public class SampleUseSet {
    public static void main(String[] args) {
        Set<String> collection = new HashSet<String>();
        collection.add("Vanya");
        collection.add("Vanya");
        collection.add("Petya");

        for ( String element  : collection){
            System.out.println(element);
        }

    }
}
