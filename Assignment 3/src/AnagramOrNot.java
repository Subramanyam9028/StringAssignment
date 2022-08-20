import java.util.Scanner;
public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		String ss= sc.nextLine();
		int []arr=new int[26];
		
		for(int i=0; i<s.length(); i++){
		    if(s.charAt(i)>='a'&&s.charAt(i)<='z'){
		        arr[s.charAt(i)-97]+=1;
		    }
		    else
		        arr[s.charAt(i)-65]+=1;
		    
		}
		
		for(int i=0; i<ss.length(); i++){
		    
		    if(ss.charAt(i)>='a'&&ss.charAt(i)<='z'){
		        arr[ss.charAt(i)-97]-=1;
		    }
		    else
		        arr[ss.charAt(i)-65]-=1;
		}
		
		for(int i=0; i<arr.length; i++){
		    if(arr[i]!=0){
		        System.out.println("not anagram");
		        System.exit(0);
		    }
		}
		
		        System.out.println("anagram");
		
		
		

	}

}
