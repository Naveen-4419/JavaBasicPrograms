package com.javacodebase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class EmployeeComparator implements Comparable<EmployeeComparator>{

    private String name;
    private int id;

    public EmployeeComparator(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    @Override
    public int compareTo(EmployeeComparator o) {
        return Integer.compare(this.id, o.id);
    }
}

 class ComparatorClass{
    public static void main(String[] args) {
        List<EmployeeComparator> ec= new ArrayList<>();
        ec.add(new EmployeeComparator("Megh", 2));
        ec.add(new EmployeeComparator("Ram", 40));

        Collections.sort(ec);
        for(EmployeeComparator e: ec){
            System.out.println(e.getId() +" " + e.getName());
        }
    }
}