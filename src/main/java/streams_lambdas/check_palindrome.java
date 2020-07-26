package streams_lambdas;
import java.util.*;
import java.util.stream.IntStream;
interface Hello{
	void is(List<String> l);
}
public class check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str=new ArrayList<String>();
		str.add("mom");
		str.add("dad");
		str.add("book");
		str.add("pen");
		str.add("madam");
		str.add("noon");
		str.add("chair");
		System.out.println("Original list:"+str);
		Hello h=check_palindrome::isPalin;
		h.is(str);
	}
	public static void isPalin(List<String> l) {
		boolean isPalindrome;
		List<String> finallist=new ArrayList<String>();
		for(int k=0;k<l.size();k++) {
			String g=l.get(k);
			isPalindrome=IntStream
					.range(0,g.length()/2)
					.noneMatch(i->g.charAt(i)!=g
					.charAt(g.length()-i-1));
			if(isPalindrome) {
				finallist.add(g);
			}
		}
		System.out.println("Palindromes from the given list are:"+finallist);
		
	}
}
