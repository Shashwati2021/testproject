package com.data.input;

public class OperatorTest {

	private static Object Strings;

	public static void main(String[] args) {
		 
		int a=56,b=35,c=76,y=10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);  //modulos operator
		
		System.out.println(a>b && b>c); //and operator
		System.out.println(a>b || b>c); //or operator
		System.out.println(a!=b);       //not operator
		System.out.println(a==b);  //equality operator
		
		a+=5; //a=a+5;
		System.out.println(a);
		a-=5; //a=a-5;
		System.out.println(a);
		a*=2; //a=a*2;
		System.out.println(a);
		a/=4; //a=a/4;
		System.out.println(a);
		
		System.out.println(a & b);//bitwise and operator
		System.out.println(a | b);//bitwise or operator
		System.out.println(a >> b);//right shift operator
		System.out.println(a << b);//left and operator
		
		System.out.println(y++);//10
		System.out.println(y);
		
		System.out.println(++y - ++y - ++y);
		String s=(20<30)?"java":"c++"; //ternary operator
		System.out.println(s);
		
		a=10;
		b=17;
		System.out.println(++a + --b - b-- + ++a*b--);
		
		

	}

}
