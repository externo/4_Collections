import java.util.Arrays;
import java.util.Scanner;


public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int n = inputScanner.nextInt();
		int[] numbers = new int[n];
		for (int i=0; i<n; i++){
			numbers[i] = inputScanner.nextInt();
		}
		inputScanner.close();
		Arrays.sort(numbers);
		for (int i=0; i<n; i++){
			System.out.println(numbers[i]);
		}
	}

}
