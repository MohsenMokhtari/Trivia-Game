package project;

import java.util.*;

public class HardQuestions extends Questions{
    int[] QuestionNumbers = {1, 2, 3, 4, 5, 6, 7, 8};
	Scanner input = new Scanner(System.in);

	@Override
	public void Question() {
        int[] randomPicks = GetRandomNums.pickNRandom(QuestionNumbers, 4);

		String choice = null;
		
        for (int z = 0; z < 4; z++) {
        	if(getWronganswer()==1){
				break;
			}
        	
			switch (randomPicks[z]) {
			case 1:
				System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
				System.out.println("Who has been Pope the longest in the 20th century?");
				System.out.println("A)Pope Fracis II B)Pope John Paul I C)Pope Benedict XVI D)Pope St. John Paul II ");
				choice = input.nextLine();
				if (choice.equals("D") || choice.equals("d")) {
				     setQuestionCounter(getQuestionCounter()+1); 
						if(getQuestionCounter()!=12){
			                System.out.println("Congrats! Onto the next questions!");}
                     break;
                 } else {
                	 System.out.println("Your answer was wrong.The competition is over.");
                	 setWronganswer(1);
                     setQuestionCounter(getQuestionCounter()+1); 
                     System.out.println("You reached the "+getQuestionCounter()+". question");
                     setNoMistake(0);
                     break;
                 }
						
			case 2:
				System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
				System.out.println("Which middle name did UK Prime Minister Winston Churchill share with Charlie Chaplin?");																											
				System.out.println("A) Spencer B) Chuck C) Philiph D) Edmund ");
				choice = input.nextLine();
				if (choice.equals("A") || choice.equals("a")){
					setQuestionCounter(getQuestionCounter()+1); 
					if(getQuestionCounter()!=12){
		                System.out.println("Congrats! Onto the next questions!");}

                     break;
                 } else {
                	 System.out.println("Your answer was wrong.The competition is over.");
                	 setWronganswer(1);
                     setQuestionCounter(getQuestionCounter()+1); 
                     System.out.println("You reached the "+getQuestionCounter()+". question");
                     setNoMistake(0);
                     break;
                 }
			case 3:
				System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
				System.out.println("Which capital city has the fewest cinemas in relation to its population??");
				System.out.println("A)Pyongyang  B)Tehran  C)Cairo  D)Kabul ");
				choice = input.nextLine();
				if (choice.equals("C") || choice.equals("c")){
					setQuestionCounter(getQuestionCounter()+1); 
					if(getQuestionCounter()!=12){
		                System.out.println("Congrats! Onto the next questions!");}
                     break;
                 } else {
                	 System.out.println("Your answer was wrong.The competition is over.");
                	 setWronganswer(1);
                     setQuestionCounter(getQuestionCounter()+1); 
                     System.out.println("You reached the "+getQuestionCounter()+". question");
                     setNoMistake(0);
                     break;
                 }
			case 4:
				System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
				System.out.println("According to the Aetherius Society, who is alive and living on Venus?");
				System.out.println("A)Zeus  B)Jesus Christ  C)Buddha  D)Thor ");
				choice = input.nextLine();
				if (choice.equals("B") || choice.equals("b")){
					setQuestionCounter(getQuestionCounter()+1); 
					if(getQuestionCounter()!=12){
		                System.out.println("Congrats! Onto the next questions!");}
                     break;
                 } else {
                	 System.out.println("Your answer was wrong.The competition is over.");
                	 setWronganswer(1);
                     setQuestionCounter(getQuestionCounter()+1); 
                     System.out.println("You reached the "+getQuestionCounter()+". question");
                     setNoMistake(0);
                     break;
                 }
			case 5:
				System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
				System.out.println("The name Chicago comes from a native Indian word that means what?");
				System.out.println("A)Place that have lots of gold  B)Place of gathering  C)Place of bull' horns D)Place that smells bad  ");
				choice = input.nextLine();
				if (choice.equals("D") || choice.equals("d")){
					setQuestionCounter(getQuestionCounter()+1); 
					if(getQuestionCounter()!=12){
		                System.out.println("Congrats! Onto the next questions!");}
                        break;
                 } else {
                	 System.out.println("Your answer was wrong.The competition is over.");
                	 setWronganswer(1);
                     setQuestionCounter(getQuestionCounter()+1); 
                     System.out.println("You reached the "+getQuestionCounter()+". question");
                     setNoMistake(0);
                     break;
                 }
			case 6:
				System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
				System.out.println("There are more what  in Los Angeles than in all France?");
				System.out.println("A)Directors  B)Judges  C)Brokers  D)Spacemen ");
				choice = input.nextLine();
				if (choice.equals("B") || choice.equals("b")){
					setQuestionCounter(getQuestionCounter()+1); 
					if(getQuestionCounter()!=12){
		                System.out.println("Congrats! Onto the next questions!");}
                     break;
                 } else {
                	 System.out.println("Your answer was wrong.The competition is over.");
                	 setWronganswer(1);
                     setQuestionCounter(getQuestionCounter()+1); 
                     System.out.println("You reached the "+getQuestionCounter()+". question");
                     setNoMistake(0);
                     break;
                 }
			case 7:
				System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
				System.out.println("Fifty six percent of Americans believe there is what in heaven?");
				System.out.println("A)Baseball  B)Hamburger  C)Hot Dog  D)Football ");
				choice = input.nextLine();
				if (choice.equals("A") || choice.equals("a")){
					setQuestionCounter(getQuestionCounter()+1); 
					if(getQuestionCounter()!=12){
		                System.out.println("Congrats! Onto the next questions!");}
                     break;
                 } else {
                	 System.out.println("Your answer was wrong.The competition is over.");
                	 setWronganswer(1);
                     setQuestionCounter(getQuestionCounter()+1); 
                     System.out.println("You reached the "+getQuestionCounter()+". question");
                     setNoMistake(0);
                     break;
                 }	
			case 8:
				System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
				System.out.println("What country has the most daily newspapers in the world?");
				System.out.println("A)United Kingdom  B)Japan  C)India  D)China ");
				choice = input.nextLine();
				if (choice.equals("D") || choice.equals("d")){
					setQuestionCounter(getQuestionCounter()+1); 
					if(getQuestionCounter()!=12){
		                System.out.println("Congrats! Onto the next questions!");}
                     break;
                 } else {
                	 System.out.println("Your answer was wrong.The competition is over.");
                	 setWronganswer(1);
                     setQuestionCounter(getQuestionCounter()+1); 
                     System.out.println("You reached the "+getQuestionCounter()+". question");
                     setNoMistake(0);
                     break;
                 }
			}
		}
        
	}
}