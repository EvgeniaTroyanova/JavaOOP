package com.company;

public class Sweetness implements Weightable
{
    protected   double weight;
    protected  String name;
    public  String getName() {
        return name;
    }
    public Sweetness(){
        this.weight=0;
        this.name="Sweetness";
    }
    public Sweetness(String name,double weight ){
        this.weight=weight;
        this.name=name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name+"  "+weight;
    }
}
