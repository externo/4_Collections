import java.util.HashMap;
import java.util.Scanner;


public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String l = inputScanner.nextLine();
		inputScanner.close();
		String[] splited = l.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (String word: splited){
			if (!map.containsKey(word)){
				map.put(word, 1);
			}else{
				map.put(word, map.get(word) + 1);
			}
		}
		for (String word: map.keySet()){
			for (int i=0; i<map.get(word); i++){
				System.out.print(word+" ");
			}
			System.out.println();
		}
	}

}
