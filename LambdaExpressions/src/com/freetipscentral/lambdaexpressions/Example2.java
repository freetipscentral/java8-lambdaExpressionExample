package com.freetipscentral.lambdaexpressions;

public class Example2 {

	public static void main(String[] args) {
		Runnable r1 = () -> System.out.println("Runnable Thread R1");
		r1.run();
		
		//Step 1 : Remove anonymous class declaration  and opening braces
		//Step 2 : Remove method name and replace { with -> Separator
		//Step 3 : Remove closing braces } for method and anonymous class
		//Step 4 : Remove semicolon after the statement unless it is a method block


	}

}
