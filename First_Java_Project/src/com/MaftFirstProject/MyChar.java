package com.MaftFirstProject;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {
		if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u')
			return true;
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isNumber() {
		if(ch >= 48 && ch <=57)
			return true;
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAlphabet() {
		if(ch >= 97 && ch <= 122)
			return true;
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isConsonant() {
		if( isAlphabet() &&  !isVowel())
			return true;
		// TODO Auto-generated method stub
		return false;
	}

	public static void printLowercaseAlphabets() {
		for(char ch= 'a' ; ch <= 'z' ; ch++) {
			System.out.println(ch);
		}
		
		// TODO Auto-generated method stub
		
	}

	

}
