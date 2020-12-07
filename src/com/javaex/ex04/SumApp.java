package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		//코드를 작성하세요
		
		String[] nArr = numLine.split(" "); //공백으로 구분
		
		
		for(int i=0; i<nArr.length; i++) {
			sum += Integer.parseInt(nArr[i]); 
			//nArr값이 String이기 때문에 정수로 변환해줘야함 
			//(sum으로 더하기 위해서)
		}
		
		
		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
