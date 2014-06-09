import java.util.Scanner;


public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String str = inputScanner.nextLine();
		String word = inputScanner.nextLine();
		inputScanner.close();
		String[] splited = str.split("[^a-zA-Z0-9']+");
		int n = 0;
		for (String w: splited){
			if (w.toLowerCase().contains(word)){
				n++;
			}
		}
		System.out.println(n);
	}

}
