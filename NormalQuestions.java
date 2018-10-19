package project;

import java.util.*;

public class NormalQuestions extends Questions implements Transition{
	
	@Override
	public void ToTheNextDifficulty(){
		if(getNoMistake()==1){
			System.out.println("Now to the hard questions! \n");
		}}

	Scanner input = new Scanner(System.in);
    int[] QuestionNumbers = {1, 2, 3, 4, 5, 6, 7, 8};
    
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
				System.out.println("What so-called war spawned the dueling slogans Better Dead Than RED and Better Red Than Dead in the 1950's?");
				System.out.println("A) World War II B) Korean War C)Vietnam War D)Cold War ");
				choice = input.nextLine();
				
				if (choice.equals("D") || choice.equals("d")){
					setQuestionCounter(getQuestionCounter()+1); 
                    System.out.println("Congrats! Onto the next questions!");
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
				System.out.println("Where is the world's largest soccer stadium?");
				System.out.println("A) Spain B) Germany C)Brazil D)China ");
				choice = input.nextLine();
				if (choice.equals("C") || choice.equals("c")){
					 setQuestionCounter(getQuestionCounter()+1); 
                     System.out.println("Congrats! Onto the next questions!");
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
				System.out.println("Who said, ''I think, therefore I am?'' ");
				System.out.println("A) Descartes B) Aristotle C) Plato D) Archimedes ");
				choice = input.nextLine();
				if (choice.equals("A") || choice.equals("a")){ 
					setQuestionCounter(getQuestionCounter()+1); 
                    System.out.println("Congrats! Onto the next questions!");
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
				System.out.println("In what country the world's first water clock was invented?");
				System.out.println("A) Rome B) China C) Egypt D) Persia ");
				choice = input.nextLine();
				if (choice.equals("B") || choice.equals("b")){
					setQuestionCounter(getQuestionCounter()+1); 
                    System.out.println("Congrats! Onto the next questions!");
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
				System.out.println("What was the first James Bond book?");
				System.out.println("A)Goldfinger  B)Casino Royale  C)Diamonds are forever  D)Live and Let Die ");
				choice = input.nextLine();
				if (choice.equals("B") || choice.equals("b")){ 
					setQuestionCounter(getQuestionCounter()+1); 
                    System.out.println("Congrats! Onto the next questions!");
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
				System.out.println("What was Al Capone's father's occupation?");
				System.out.println("A)Butcher  B)Salesman  C)Doctor  D)Barber ");
				choice = input.nextLine();
				if (choice.equals("D") || choice.equals("d")){
					setQuestionCounter(getQuestionCounter()+1); 
                    System.out.println("Congrats! Onto the next questions!");
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
				System.out.println("Most popes have been Italian. Which country has the 2nd highest number of Popes?");
				System.out.println("A)England  B)Greece  C)France  D)Spain ");
				choice = input.nextLine();
				if (choice.equals("C") || choice.equals("c")) {
					setQuestionCounter(getQuestionCounter()+1); 
                    System.out.println("Congrats! Onto the next questions!");
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
				System.out.println("Which classic novel sold only fifty copies during the authors lifetime?");
				System.out.println("A)Moby Dick  B)Robin Hood  C)Animal Farm  D)Oliver Twist ");
				choice = input.nextLine();
				if (choice.equals("A") || choice.equals("a")){
					setQuestionCounter(getQuestionCounter()+1);
                    System.out.println("Congrats! Onto the next questions!");
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
        ToTheNextDifficulty();
	}

}