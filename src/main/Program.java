package main;

import java.util.Iterator;

public class Program {
	public static void main(String[] args) {
//		Integer[] arr = {1, 2, 3, 4, 1, 5, 6, 7, 8, 5, 9, 10};
//		printEvenPairs(arr);
		
		int a = 0, b = 1;
		
	}
	
	public static void printEvenPairs(Integer[] arr) {
		Set<Integer> set = new Set<Integer>(arr);
		for (int i = 0; i < set.length(); i++) {
			for (int j = i; j < set.length(); j++) {
				Integer first = set.get(i);
				Integer second = set.get(j);
				if ((first % 2 == 0)
						|| (second % 2 == 0)) {
					System.out.printf("(%d, %d) : %d\n", first, second, (first * second));
				}
			}
		}
	}
}
