package org.test.dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;



public class InitializationDemo {

	private static Reader in;

	public static void main(String[] args)throws NumberFormatException,IOException{
		InputStreamReader(System.in);
		BufferedReader ob=new BufferedReader(in);
		
		long a,b;
		float c,d;
		double x,y;
		System.out.println("Enter value of d :");
		c=Float.parseFloat(ob.readLine());
		
		System.out.println("Enter value of d :");
		d=Float.parseFloat(ob.readLine());
		
		System.out.println(c+d);
		
		System.out.println("Enter value of x :");
		x=Double.parseDouble(ob.readLine());
		
		System.out.println("Enter value of x :");
		y=Double.parseDouble(ob.readLine());
		
		System.out.println(x+y);
		System.err.println("This is an example of error sterm..");
		

	

	
		
	}

	private static void InputStreamReader(InputStream in2) {
		// TODO Auto-generated method stub
		
	}

}
