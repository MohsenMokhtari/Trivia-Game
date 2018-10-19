package project;
import java.util.*;
public class Driver
{		
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Questions firsttoforth = new EasyQuestions();
		Questions fifthtoeight = new NormalQuestions();
		Questions ninthtotwelfth = new HardQuestions();
		int ContinueOrQuit;
		
		for( ; ; )
		{
			firsttoforth.setWronganswer(0);
			fifthtoeight.setWronganswer(0);
			ninthtotwelfth.setWronganswer(0);
			firsttoforth.setQuestionCounter(0);
			fifthtoeight.setQuestionCounter(0);
			ninthtotwelfth.setQuestionCounter(0);
			firsttoforth.setNoMistake(1);
			fifthtoeight.setNoMistake(1);
			ninthtotwelfth.setNoMistake(1);
			
			
		GameMenu.Menu();
		ContinueOrQuit=input.nextInt();
		
		if(ContinueOrQuit==0)
		{
			System.out.println("Quitting...");
			System.exit(0);
		}
		
		if(ContinueOrQuit==1)
		{
			firsttoforth.Question();
			if(firsttoforth.getNoMistake()==1)
			{
				fifthtoeight.setQuestionCounter(4);
				fifthtoeight.Question();
				if(fifthtoeight.getNoMistake()==1)
				{
					ninthtotwelfth.setQuestionCounter(8);
					ninthtotwelfth.Question();
					if(ninthtotwelfth.getNoMistake()==1)
					{
						System.out.println("Congrats! You are the new Millionaire!");
			        	System.out.println("You won the ultimate prize of "+Player.prize(ninthtotwelfth.getQuestionCounter())+" TL");
					}
					
					else
					{
						System.out.println("Your final prize is: "+Player.prize(ninthtotwelfth.getQuestionCounter())+" TL");
					}

				}
				
				else
				{
					System.out.println("Your final prize is: "+Player.prize(fifthtoeight.getQuestionCounter())+" TL");
				}

			}
			
			else
			{
				System.out.println("Your final prize is: "+Player.prize(firsttoforth.getQuestionCounter())+" TL");
			}
						
		}
		
		else
		{
			System.out.println("You entered an invalid value");
		}
		System.out.println("\n Game finished, restarting...");
		}

	}		


}
