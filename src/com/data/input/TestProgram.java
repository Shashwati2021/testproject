package com.data.input;

import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
        long a,b;
        float c,d;
        String name;
        
        System.out.println("enter value of a :");
        a=ob.nextLong();
        
        System.out.println("enter value of b :");
        b=ob.nextLong();  //for long input
        
        System.out.println("enter value of c :");
        c=ob.nextFloat();
        
        System.out.println("enter value of d :");
        d=ob.nextFloat();  //for float input
        
        System.out.println("enter your name :");
        name=ob.next();  // for string input

        
        System.out.println("Addition="+(a+b));
        System.out.println("Addition="+(c+d));
        System.out.println(name);
        ob.close();   //Closing the resource
	}
}