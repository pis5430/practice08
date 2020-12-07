package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2); //--> f 
		System.out.println(p2 == p3); // --> f
		System.out.println(p3 == p4); // --> f
		System.out.println(p4 == p1); // --> t		
		System.out.println(p1.equals(p2)); // --> f
		System.out.println(p4.equals(p1)); // --> t
		
		
		//equals --> 주소 비교 , 주소가 같아야 true, 값이 같아도 같은거 x
		//object 클래스가 가지고 있는 equals 메소드가 실행됨
		//object 클래스는 최상위 클래스 이기 때문에 extends를 생략해도된다.
	}

}


