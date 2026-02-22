package arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
	int [] marks = {99, 90, 100};
	Student student = new Student("Timi" , marks);
	
	int number = student.getNumberOfMarks();
	System.out.println("Number of marks is: " + number);
	int sum = student.getTotalSumOfMarks();
	System.out.println("Total sum of Marks is: " +sum);
	int minimumMark = student.getMinimumMark();
	System.out.println("Minimum of Marks is: " + minimumMark);
	int maximumMark = student.getMaximumMark();
	System.out.println("Maximum of Marks is: " + maximumMark);
	BigDecimal average = student.averageBigDecimal();
	System.out.println("Average of Marks is: " + average);

	}

}
