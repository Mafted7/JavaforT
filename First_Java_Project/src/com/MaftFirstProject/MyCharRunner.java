package com.MaftFirstProject;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyChar myChar = new MyChar('c');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isConsonant());
		MyChar.printLowercaseAlphabets();


	}

}
