import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String l = inputScanner.nextLine();
		inputScanner.close();
		String[] splited = l.split(" ");
		inputScanner.close();

		//add strings to dict
		HashMap<Integer, ArrayList<String>> map = new HashMap<Integer, ArrayList<String>>();
		int k=0;
		map.put(0, new ArrayList<String>());
		map.get(0).add(splited[0]);
		for (int i=0; i<splited.length-1; i++){
			if (Integer.parseInt(splited[i]) < Integer.parseInt(splited[i+1])){
				map.get(k).add(splited[i+1]);
			}else{
				k++;
				map.put(k, new ArrayList<String>());
				map.get(k).add(splited[i+1]);
			}
		}
		
		//find the longest sequences' size
		int max = map.get(0).size();
		for (ArrayList<String> sequence: map.values()){
			if (max < sequence.size()){
				max = sequence.size();
			}
		}
		
		//print ALL sequences
				for (Integer i: map.keySet()){
					for (String s: map.get(i)){
						System.out.print(" "+s);
					}
					System.out.println();
				}
		
		//print the longest sequences
		for (Integer i: map.keySet()){
			if (map.get(i).size() == max){
				System.out.print("Longest:");
				for (String s: map.get(i)){
					System.out.print(" "+s);
				}
				break;
			}
		}
	}

}
