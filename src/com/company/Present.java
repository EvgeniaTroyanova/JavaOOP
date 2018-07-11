package com.company;

import java.util.*;
import java.util.function.ToIntBiFunction;

public class Present implements  Weightable{
    List<Sweetness> sweetList;

    public Present(){
        sweetList=new ArrayList<Sweetness>();

    }

    @Override
    public double getWeight() {
        double totalWeight=0;
        for(Sweetness sweet : sweetList)
            totalWeight+=sweet.getWeight();
        return totalWeight;
    }
    public void CreatePresent(double maxWeight){
        Scanner scr=new Scanner(System.in);
        int flag=0;
        while (getWeight()<maxWeight&&flag<3){
            flag=0;
            {
                System.out.println("Add biscuit");
                String name=scr.next();
                double weight=scr.nextDouble();
                int amount=scr.nextInt();
                if(getWeight()+weight<=maxWeight){
                    Biscuit biscuit=new Biscuit(name,weight,amount);
                    sweetList.add(biscuit);
                }
                else {
                    System.out.println("not enough place");
                    flag++;
                }
                System.out.println("Осталось "+(maxWeight-getWeight()));

            }
            {
                System.out.println("Add Candy");
                String name = scr.next();
                double weight = scr.nextDouble();
                String type = scr.next();
                if (getWeight() + weight <= maxWeight) {
                    Candy candy = new Candy(name, weight, type);
                    sweetList.add(candy);
                }
                else {
                    System.out.println("not enough place");
                    flag++;
                }
                System.out.println("Осталось "+(maxWeight-getWeight()));

            }
            {
                System.out.println("Add Choco");
                String name = scr.next();
                double weight = scr.nextDouble();
                int x=scr.nextInt();
                if (getWeight() + weight <= maxWeight) {
                    Chocolate chocolate = new Chocolate(name, weight, x);
                    sweetList.add(chocolate);
                }
                else {
                    System.out.println("not enough place");
                    flag++;
                }
                System.out.println("Осталось "+(maxWeight-getWeight()));
            }
        }
    }

    @Override
    public String toString() {
        String resultString;
        resultString="Present has total weight "+getWeight();
        for(Sweetness sweet : sweetList)
            resultString+="\n"+sweet;
        return resultString;
    }
    public String toShortString(){
     return "Present has total weight "+getWeight();
    }

    public void sortBy(ToIntBiFunction<Sweetness,Sweetness> compar)
    {
       for (int i = 0; i < sweetList.size(); i++)
            for (int j = 0; j < sweetList.size(); j++)
            {

                if (compar.applyAsInt(sweetList.get(i), sweetList.get(j)) < 0) {
                    Sweetness temp = sweetList.get(i);
                    sweetList.set(i,sweetList.get(j));
                    sweetList.set(j,temp);
                }

            }
    }
    public Sweetness searchCandy(double startWeight, double endWeight){
        boolean f=true;
        for(Sweetness sweet : sweetList) {
            if ((sweet instanceof Candy) &&
                    startWeight < sweet.getWeight() &&
                    sweet.getWeight() < endWeight)
                return sweet;
            else f = false;
        }
        return  null;
    }


}
