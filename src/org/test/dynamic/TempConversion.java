package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class TempConversion {

	public static void main(String[] args) throws NumberFormatException, IOException{
	
		double f,c;
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader ob=new java.io.BufferedReader(in);
		
		System.out.println("Enter the value of fahrenheit");
		f=Double.parseDouble(ob.readLine());
	
		
		c=(5*f-160)/9;
		
		System.out.println("Celcius="+c);
		

	}

}
