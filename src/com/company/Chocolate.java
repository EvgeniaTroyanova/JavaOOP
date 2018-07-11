package com.company;

public class Chocolate extends  Sweetness
{
    private int x;

    public int getX() {
        return x;
    }

    public Chocolate(){
        super();
        x=0;
    }
    public Chocolate(String name,double weight, int x){
        super(name,weight);
        this.x=x;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString()+"  "+x;
    }
}
