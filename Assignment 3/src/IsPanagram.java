
public class IsPanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "The quick brown fox jumps over the lazy dog";
		boolean []b = new boolean[26];
		int index=0;
		
		for(int i=0; i<s.length(); i++){
		    if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
		        index= s.charAt(i)-'A';
		    }
		    
		    else if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
		        index= s.charAt(i)-'a';
		    }
		    
		    b[index]=true;
		}
		
	    for (int i = 0; i <= 25; i++) {
            if (b[i] == false){
		        System.out.println("Not Panagram");
                
                System.exit(0);
            }
        }
		System.out.println("Panagram");

	}

}
