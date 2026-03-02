package generics;

import java.util.ArrayList;
import java.util.List;


public class GenericsRunner {
	
	static <X> X doubleValue(X value) {
		return value;
	}
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	static double sumOfNumberList(List<? extends Number> numberList) {
		double sum =0.0;
		for(Number number:numberList) {
			sum+= number.doubleValue();
		}
		return sum;
	}
	static void addCoupleofNumbers(List<? super Number> numberList) {
	numberList.add(1);
	numberList.add(1.0);
	numberList.add(1.0f);
	numberList.add(1l);
	}
	

	public static void main(String[] args) {
		
		List emptyList = new ArrayList<Number>();
		addCoupleofNumbers(emptyList);
		System.out.println(emptyList);
		
		System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
		System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1,5.1)));
		System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l,5l)));
		
		String value1 = doubleValue(new String());
		Integer number1= doubleValue(Integer.valueOf(5));
		ArrayList list1 = doubleValue(new ArrayList());
		
		ArrayList<Integer> numberList = new ArrayList<>(List.of(1,2,3));
		duplicate(numberList);
		System.out.println(numberList);
		
		MyCustomList<Long> list = new MyCustomList<>();
		list.addElement(5l);
		list.addElement(2l);
		Long value = list.get(0);
		System.out.println(value);
		
		MyCustomList<Integer> list2 = new MyCustomList<>();
		list2.addElement(Integer.valueOf(5));
		list2.addElement(Integer.valueOf(2));
		Integer number = list2.get(1);
		System.out.println(number);

	}
	
}
