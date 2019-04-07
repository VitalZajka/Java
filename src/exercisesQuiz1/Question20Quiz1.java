package exercisesQuiz1;

public class Question20Quiz1 {

	public static void main(String[] args) {
		int z=2, sum=0;
		
		while(z<9) {
			
			z++;
			sum=sum+z;
			
		   //when z++ is after sum=sum+z; //result 35
		}

		System.out.print(sum);
	}}