package project;
import java.util.*;
public class GetRandomNums {	
	public static int[] pickNRandom(int[] array, int n) {

	    List<Integer> list = new ArrayList<Integer>(array.length);
	    for (int i : array)
	        list.add(i);
	    Collections.shuffle(list);

	    int[] answer = new int[n];
	    for (int i = 0; i < n; i++)
	        answer[i] = list.get(i);
	    Arrays.sort(answer);

	    return answer;

	}

}
