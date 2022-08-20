
public class RevWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Think Twice";
		String []ss= s.split(" ");
		String ans="";
		for(int i=0; i<ss.length; i++){
		    String word = ss[i];
		    String revWord="";
		   for(int j=word.length()-1; j>=0; j--){
		       
		       revWord=revWord+word.charAt(j);
		   }
		   
		   
		   ans=ans+revWord+" ";
		}

        
		System.out.println(ans);
		

	}

}
