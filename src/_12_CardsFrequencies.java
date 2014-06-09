import java.util.HashMap;
import java.util.Scanner;

public class _12_CardsFrequencies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		input.close();
		String[] splited = inputString.split(" ");
		
		//add cards and count to dict
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (String w: splited){
			int endIndex = w.length()-1;
			String key = w.substring(0, endIndex);
			if (!map.keySet().contains(key)){
				map.put(key, 1);
			}else{
				Integer value = map.get(key);
				map.put(key, value+1);
			}
		}		
		
		//print the frequency of cards
		for (String w: map.keySet()){
			Integer value = map.get(w);
			Double freq = 100*(double)value/(double)splited.length;
			System.out.printf("%s -> %.2f%%\n", w, freq);
		}
	}
}
