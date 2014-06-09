import java.util.Scanner;


public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String str = inputScanner.nextLine();
		String word = inputScanner.nextLine();
		inputScanner.close();
		String[] splited = str.split("[^a-zA-Z0-9']+");
		int n = 0;
		int idx = 0;
		for (String w: splited){
		      while ((idx = w.toLowerCase().indexOf(word, idx)) != -1) {
		          n++;
		          idx += word.length();
		      }
		}
		System.out.println(n);
	}

}
