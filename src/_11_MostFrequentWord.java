import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class _11_MostFrequentWord {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String l = inputScanner.nextLine();
		inputScanner.close();
		String[] splited = l.split("[^a-zA-Z0-9']+");
		inputScanner.close();

		//add words and count to dict
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String w: splited){
			String key = w.toLowerCase();
			if (!map.keySet().contains(key)){
				map.put(key, 1);
			}else{
				Integer value = map.get(key);
				map.put(key, value+1);
			}
		}
		
		//find the longest sequences' size
		int max = 1;
		for (String w: map.keySet()){
			if (max < map.get(w)){
				max = map.get(w);
			}
		}
		
		//add keyset of dict to another list to sort
		ArrayList<String> sorted = new ArrayList<String>();
		for (String w: map.keySet()){
			sorted.add(w);
		}
		java.util.Collections.sort(sorted);
		
		//print the most frequent word
		for (String w: sorted){
			Integer value = map.get(w);
			if (value == max){
				System.out.printf("%s -> %d times\n", w, value);
			}
		}
	}
}
