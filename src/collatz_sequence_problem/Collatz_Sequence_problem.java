package collatz_sequence_problem;

import java.util.Scanner;

public class Collatz_Sequence_problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		while(true)
		{
			System.out.print(number+" ");
			if(number==1)
			{
				break;
			}
			if(number%2!=0)
			{
				number=(number*3)+1;
			}
			else
			{
				number=number/2;
			}
		}
	}

}