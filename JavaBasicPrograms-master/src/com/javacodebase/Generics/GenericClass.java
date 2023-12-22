package com.javacodebase.Generics;

public class GenericClass<T> {

    T name;

    public void setName(T name){
        this.name=name;
    }
    public T getName(){
        return name;
    }
}
