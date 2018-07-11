package com.company;


import java.util.function.ToIntBiFunction;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Present present=new Present();
        present.CreatePresent(1000);
        System.out.println(present);
        ToIntBiFunction<Sweetness,Sweetness> m;
        m=(s1,s2)->s1.getName().compareTo(s2.getName());
        present.sortBy(m);
        System.out.println(present);
        m=(s1,s2)->s1.getWeight()-s2.getWeight()>0?1:s1.getWeight()-s2.getWeight()==0?0:-1;
        present.sortBy(m);
        System.out.println(present);
        Sweetness s=present.searchCandy(200,500);
        if (s!=null)
            System.out.println(s);
        else System.out.println(s);
    }
}
