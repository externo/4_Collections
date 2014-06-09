import java.util.Scanner;


public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String str = inputScanner.nextLine();
		inputScanner.close();
		String[] splited = str.split(" |'|-");
		inputScanner.close();
		System.out.print(splited.length);
	}

}
