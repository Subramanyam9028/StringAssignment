
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "iNeuron";
		String ss= "";
		
		for(int i=s.length()-1; i>=0; i--){
		    ss=ss+s.charAt(i);
		}
		System.out.println(ss);
		

	}

}
