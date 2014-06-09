import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class _03_LargestSequenceOfEqualStrings {

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
		int max = Collections.max(map.values());
		for (String word: map.keySet()){
			if (map.get(word) == max){
				for (int i=0; i<max; i++){
					System.out.print(word+" ");				
				}
			}
		}
	}

}
