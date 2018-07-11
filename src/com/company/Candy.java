package com.company;

public class Candy extends  Sweetness
{
    private CaneType type;

    public CaneType getType() {
        return type;
    }

    public void setType(String stringType) {
        switch (stringType){
            case "ICE":this.type =CaneType.ICE; break;
            case "CHOKO":this.type =CaneType.CHOKO; break;
            case "JELLY":this.type =CaneType.JELLY; break;
            default: this.type =CaneType.ICE;
        }

    }
    public CaneType defineType(String stringType) {
        switch (stringType){
            case "ICE":return CaneType.ICE;
            case "CHOKO":return CaneType.CHOKO;
            case "JELLY":return CaneType.JELLY;
            default: return CaneType.ICE;
        }

    }

    public Candy(){
        super();
        type=CaneType.ICE;
    }
    public Candy(String name,double weight, String type){
        super(name,weight);
        this.type=defineType(type);
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return super.toString()+"  "+type.toString();
    }
}