package arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student {

	private int[] marks;
	private String name;

	public Student(String name, int[] marks) {
		this.name = name;
		this.marks = marks;
	}

	public int getNumberOfMarks() {
		// TODO Auto-generated method stub
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int i = 0; i < marks.length; i++ ) {
			sum = sum + marks[i];
		}
		return sum;
	}

	public int getMinimumMark() {
		int minimum = Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark < minimum) {
				minimum = mark;
			}
		}
		return minimum ;
	}

	public int getMaximumMark() {
		int maximum = Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark > maximum) {
				maximum = mark;
			}
		}
		return maximum ;
		
	}

	public BigDecimal averageBigDecimal() {
		int sum = getTotalSumOfMarks() ;
		int number = getNumberOfMarks();
		return new BigDecimal (sum).divide(new BigDecimal (number),3,RoundingMode.UP);
	}

}
