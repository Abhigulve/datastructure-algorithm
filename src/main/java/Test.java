
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		List<String> list = letterCombinations("23");
		System.out.println(list);
	}
	
	static TreeSet<String> generatePermutations(int[] telephoneNumber) {
		TreeSet<String> allPermutations=new TreeSet<String>(); // I want unique sorted permutations
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < telephoneNumber.length; i++) {
			sb.append(telephoneNumber[i]);
		}
		allPermutations = new TreeSet<String>(letterCombinations(sb.toString()));
      // your code goes here 
      
      
      	return  allPermutations;
    }
	
	public static void helper(List<String> result, StringBuilder sb, String digits, int index, HashMap<Character, char[]> map){
	    if(index>=digits.length()){
	        result.add(sb.toString());
	        return;
	    }
	 
	    char c = digits.charAt(index);
	    char[] arr = map.get(c);
	 
	    for(int i=0; i<arr.length; i++){
	        sb.append(arr[i]);
	        helper(result, sb, digits, index+1, map);
	        sb.deleteCharAt(sb.length()-1);
	    }
	}
	
	public static List<String> letterCombinations(String digits) {
	    HashMap<Character, char[]> map = new HashMap<Character, char[]>();
	    map.put('2', new char[]{'A','B','C'});
	    map.put('3', new char[]{'D','E','F'});
	    map.put('4', new char[]{'G','H','I'});
	    map.put('5', new char[]{'J','K','L'});
	    map.put('6', new char[]{'M','N','O'});
	    map.put('7', new char[]{'P','Q','R','S'});
	    map.put('8', new char[]{'T','U','V'});
	    map.put('9', new char[]{'W','X','Y','Z'});
	 
	    List<String> result = new ArrayList<String>();
	    if(digits.equals(""))
	        return result;
	 
	    helper(result, new StringBuilder(), digits, 0, map);
	 
	    return result;
	 
	}

}