package streams_lambdas;
import java.util.*;
import java.util.stream.Collectors;
public class ListOfStringWithA {
	 static void   search(List<String> l){
         
         List<String> result=l.stream() 
                       .filter(s->s.startsWith("a"))
                       .filter(s->s.length()==3)
                       .collect(Collectors.toList());
        System.out.print("List of Strings having exactly 3 letters and starting with a: "+result);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> strlist=new ArrayList<String>();
	 		strlist.add("any");
	 		strlist.add("hi");
	 		strlist.add("amplitude");
	 		strlist.add("ant");
	 		strlist.add("an");
	 		strlist.add("amp");
	 		System.out.println("Original list: "+strlist);
	        search(strlist);

	}

}
