package review.class16;

public class ReverseString {

	//public static void main(String[] args) {
		// reverse a string
		void reverseString() {
	        String str="seigolonhceT xatnyS";
	        String reverse="";
	        for(int i=str.length()-1;i>=0;i--) {
	            reverse=reverse+str.charAt(i);
	            System.out.println(reverse);
	        }
	        //System.out.println(reverse);
	        
		}
		}