package exercisesQuiz1;

public class Question19Quiz1 {

	public static void main(String[] args) {
		//What is the output?
		int m=2, total=0;//m starts with 2 then incremented; total is zero

		while(m<6) { //condition

		   total=total+m;     /*total increased on the current value of m
		   (m=2 total 2, m=3 total 5, m=4 total 9, m=5 total 14, m=6 
		   prints previous total 14*/
		   
		   m++;
	
	}
		System.out.print(total);
	}
}
