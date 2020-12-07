package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	

	//equals() 메소드를 작성하세요.
	
	public boolean equals(Object obj) {
		
		//return (this == obj); --> 원래의 equals 값
		//주소비교, 서로 다른 객체는 항상 거짓
		
		Point p = (Point)obj; //obj를 Point로 형변환
		
		if(this.x == p.x) {
			return true;
		}else {
			return false;
		}
	}
	

	
}
