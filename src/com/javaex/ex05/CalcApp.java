package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();

		while (true) {
			System.out.print(">> ");
			String sNum = sc.nextLine();

			String[] nArray = sNum.split(" "); // 공백으로 문자열 나누기

			// ↑ 부분은 반복될 부분
			// ↓ 부분은 입력값에 따라 달라질 부분
			// == 는 equals로도 표기가능

			if("/q".equals(sNum)) { // 종료합니다 순서를 뒤로 넘겼을때 /q를 입력하면 오류가남 --> 왜 오류가 나는지 확인
				System.out.println("종료합니다.");
				break;
				
			} else if ("+".equals(nArray[1])) { // 더하기			
				add.setValue(Integer.parseInt(nArray[0]), Integer.parseInt(nArray[2]));
				// 입력을 String으로 받기 때문에 정수로 변환해 줘야함
				System.out.println(">> " + add.calculate());
				
			} else if ("-".equals(nArray[1])) {	
				sub.setValue(Integer.parseInt(nArray[0]), Integer.parseInt(nArray[2]));
				System.out.println(">> " + sub.calculate());
				
			} else if ("*".equals(nArray[1])) {
				mul.setValue(Integer.parseInt(nArray[0]), Integer.parseInt(nArray[2]));
				System.out.println(">> " + mul.calculate());
				
			} else if ("/".equals(nArray[1])) {
				div.setValue(Integer.parseInt(nArray[0]), Integer.parseInt(nArray[2]));
				System.out.println(">> " + div.calculate());
				
			} else {
				System.out.println("알 수 없는 연산입니다.");
			}
		}

		sc.close();

	}
}
