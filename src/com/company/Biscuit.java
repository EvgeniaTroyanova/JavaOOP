package com.company;

public class Biscuit extends  Sweetness
{
    private int amountInTheBox;

    public int getAmountInTheBox() {
        return amountInTheBox;
    }

    public Biscuit(){
        super();
        amountInTheBox=0;
    }
    public Biscuit(String name,double weight, int amountInTheBox){
        super(name,weight);
        this.amountInTheBox=amountInTheBox;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString()+"  "+amountInTheBox;
    }
}
