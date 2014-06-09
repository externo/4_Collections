import java.util.HashSet;
import java.util.Scanner;

public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String str = inputScanner.nextLine();
		inputScanner.close();
		String[] splited = str.split("[^a-zA-Z0-9']+");
		inputScanner.close();

		HashSet<String> unique = new HashSet<String>();
		for (String word: splited){
			unique.add(word);
		}
		for (String w: unique){
			System.out.print(w.toLowerCase()+" ");
		}
	}

}
