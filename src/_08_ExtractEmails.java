import java.util.ArrayList;
import java.util.Scanner;


public class _08_ExtractEmails {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String str = inputScanner.nextLine();
		inputScanner.close();
		String[] splited = str.split(" | @|@ ");
		ArrayList<String> emailStrings = new ArrayList<String>();
		for (String w: splited){
			if (w.toLowerCase().contains("@")){
				emailStrings.add(w);
			}
		}
		for (String e: emailStrings){
			System.out.println(e);
		}
	}

}
