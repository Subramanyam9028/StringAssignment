
public class SpecialChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="sachin& is*very# good %player$";
		int speChars=0;
		for(int i=0; i<s.length(); i++){
		    if (!Character.isDigit(s.charAt(i))
                && !Character.isLetter(s.charAt(i))
                && !Character.isWhitespace(s.charAt(i))) {
            
            
                speChars++;
            }
		    
		}
		
		System.out.println("Total special characters: "+speChars);
	

	}

}
