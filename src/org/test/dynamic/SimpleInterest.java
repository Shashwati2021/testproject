package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {

public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		double p,t = 0,r,i;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new java.io.BufferedReader(in);
		
		System.out.print("Enter the principle amount :");
		p=Double.parseDouble(ob.readLine());
		System.out.print("Enter the Rate of interest :");
		r=Double.parseDouble(ob.readLine());
		System.out.print("Enter the time :");
		p=Double.parseDouble(ob.readLine());
		
		i=(p*r*t)/100;
		
		System.out.print("Interest="+i);
	}

}
