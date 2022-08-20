
public class RepeatingChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sachin was very good player";
		for(int i=0; i<s.length()-1; i++){
		    for(int j=i+1; j<s.length(); j++){
		        
		        if(s.charAt(i)==s.charAt(j)&&s.charAt(i)!=' '){
		            System.out.print(s.charAt(i)+" ");
		            i++;
		            break;
		        }
		    }
		}

	}

}
