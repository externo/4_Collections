import java.util.Scanner;


public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String l1 = inputScanner.nextLine();
		String l2 = inputScanner.nextLine();
		inputScanner.close();
		String[] l1Array = l1.split(" ");
		String combined = "";
		for (String l: l1Array){
			combined+=" "+l;
		}
		String[] l2Array = l2.split(" ");		
		for (String s: l2Array){
			if (!l1.contains(s)){
				combined += " "+s;
			}
		}
		System.out.println(combined);
	}

}
