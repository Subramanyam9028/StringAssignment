
public class CountVowCons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sachin was very good player";
		int vow=0, con=0;
		for(int i=0; i<s.length(); i++){
		    if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
	        vow++;
	        
	        else if(s.charAt(i)!=' ')
	        con++;
		    
		}
		
		System.out.println("Vowels: "+vow);
		System.out.println("Consonants: "+con);

	}

}
