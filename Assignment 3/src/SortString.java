import java.util.Arrays;
public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sachin was very good player";
		char []ch=s.toCharArray();
		Arrays.sort(ch);
		String ans = new String(ch);
		for(int i=0; i<ans.length(); i++){
		    if(ans.charAt(i)!=' ')
	    System.out.print(ans.charAt(i));
		    
		}

	}

}
