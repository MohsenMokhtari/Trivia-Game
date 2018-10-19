package project;

import java.util.*;

public class EasyQuestions extends Questions implements Transition{
	
	@Override
	public void ToTheNextDifficulty(){
		if(getNoMistake()==1){
    	System.out.println("Now to the Normal Questions! \n");
    }}

    Scanner input = new Scanner(System.in);
    int[] QuestionNumbers = {1, 2, 3, 4, 5, 6, 7, 8};
    
    @Override
    public void Question(){
        int[] randomPicks = GetRandomNums.pickNRandom(QuestionNumbers, 4);
    	String choice = null;

		System.out.println("What's the category do you want to choose for the first four questions?");
		System.out.
		println("1-History 2-General Knowledge 3-Fundamentals of Computer 4-Geography");
		setCategory(input.nextInt());
		input.nextLine();
		System.out.println("");
		
		if(getCategory()==1){
        for (int z = 0; z < 4; z++) 
        {
        	if(getWronganswer()==1){
				break;
			}

                switch (randomPicks[z]) {
                    case 1:
                    		System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    		System.out.println("In which year did the Titanic sink?");
                            System.out.println("A) 1908 B) 1910 C)1899 D)1912 ");
                            choice = input.nextLine();
                          if (choice.equals("d") || choice.equals("D")) {
                        	  setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         }
                          else {
                             System.out.println("Your answer was wrong.The competition is over.");
                             setWronganswer(1);
                             setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("You reached the "+getQuestionCounter()+" question");
                             setNoMistake(0);
                             break;
                         }
				case 2:
						System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
						System.out.println("In which year did the demolition of the Berlin Wall begin?");
                        System.out.println("A) 1986 B) 1989 C)1991 D)1993 ");
                        choice = input.nextLine();
                        if (choice.equals("b") || choice.equals("B")) {
                        	setQuestionCounter(getQuestionCounter()+1); 
       					 System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                             System.out.println("Your answer was wrong.The competition is over.");
                             setWronganswer(1);
                             setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("You reached the "+getQuestionCounter()+" question");
                             setNoMistake(0);
                             break;
                         }
                    case 3:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println(" Who saw his crew dine on wormy biscuits and rats on his fourth voyage to the New World?");
                        System.out.println("A) Christopher Columbus B)Vasco de Gama C)Marco Polo D)Americo Vespucci ");
                        choice = input.nextLine();
                        if (choice.equals("a") || choice.equals("A")) {
                        	setQuestionCounter(getQuestionCounter()+1); 
       					 	 System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                             System.out.println("Your answer was wrong.The competition is over.");
                             setWronganswer(1);
                             setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("You reached the "+getQuestionCounter()+" question");  
                             setNoMistake(0);
                             break;
                         }                
                    case 4:
                        System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                        System.out.println("Which Empire declared war on Russia in October 1853, suffering a defeat that gave Russia control of the Black Sea?");
                        System.out.println("A) Great Britain B)Austria-Hungary Empire C)Ottoman Empire D)Holy Roman Empire ");
                        choice = input.nextLine();
                        if (choice.equals("c") || choice.equals("C")) {
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
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +" question");
                    	System.out.println("What nationality was Karl Marx?");
                        System.out.println("A) French B)Dannish C)Swiss D)German ");
                        choice = input.nextLine();
                        if (choice.equals("d") || choice.equals("D")) {
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
                    	System.out.println("Which treaty finished the Turkish Independence War? ");
                        System.out.println("A)Loussane Peace Treaty B)Sevres Peace Treaty C)Mudanya Truce D)Mondros Truce ");
                        choice = input.nextLine();
                        if (choice.equals("c") || choice.equals("C")) {
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
                    	System.out.println("In which year was the Wall Street Crash?");
                        System.out.println("A)1923 B)1929 C)1931 D)1939");
                        choice = input.nextLine();
                        if (choice.equals("b") || choice.equals("B")) {
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
                    	System.out.println("Who invented the telescope ?");
                        System.out.println("A)Leonardo Da Vinci B)Nicolaus Copernecus C)Johannes Kepler D)Galileo Galilei");
                        choice = input.nextLine();
                        if (choice.equals("d") || choice.equals("D")) {
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
		}  

        if(getCategory()==2){           
            
            for (int z = 0; z < 4; z++) {
            	if(getWronganswer()==1)
            	{
            		break;
            	}
                              
                switch (randomPicks[z]) {
                    case 1:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("For which of the following disciplines is Nobel Prize awarded?");
                        System.out.println("A) Physics and Chemistry B) Physiology or Medicine C)Literature, Peace and Economics D)All of the above ");
                        choice = input.nextLine();
                        if (choice.equals("d") || choice.equals("D")) {
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
                    	System.out.println("In Roman mythology, Neptune is the equivalent to which Greek god?");
                        System.out.println("A)Zeus B)Poseidon C)Hades D)Apollon");
                        choice = input.nextLine();
                        if (choice.equals("b") || choice.equals("B")) {
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
                    	System.out.println("Which American state is nearest to the Russian Federation?");
                        System.out.println("A)Nebraska B)Wyoming C)Delaware D)Alaska");
                        choice = input.nextLine();
                        if (choice.equals("d") || choice.equals("D")) {
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
                    	System.out.println("In which year, terrorists crash two planes into New York's World Trade Centre on September 11 in a sequence of destruction? ");
                        System.out.println("A)1999 B)2000 C)2001 D)2002 ");
                        choice = input.nextLine();
                        if (choice.equals("c") || choice.equals("C")) {
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
                    	System.out.println(" What is the official language of Andorra?");
                        System.out.println("A)Spanish B)Catalan C)French D)Basque ");
                        choice = input.nextLine();
                        if (choice.equals("b") || choice.equals("B")) {
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
                    	System.out.println("What is the capital city of Saudi Arabia?");
                        System.out.println("A)Riyadh B)Mecca C)Medina D)Jeddah ");
                        choice = input.nextLine();
                        if (choice.equals("a") || choice.equals("A")) {
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
                    	System.out.println("How many times has Brazil won the World Cup Football Championship? ");
                        System.out.println("A)3  B)4  C)5  D)6 ");
                        choice = input.nextLine();
                        if (choice.equals("c") || choice.equals("C")) {
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
                    	System.out.println(" In terms of area, which island is the largest in the Mediterranean Sea?");
                        System.out.println("A)Sicily  B)Cyprus  C)Malta  D)Crete ");
                        choice = input.nextLine();
                        if (choice.equals("a") || choice.equals("A"))  {
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
        }

        if(getCategory()==3){

            for (int z = 0; z < 4; z++) {
            	if(getWronganswer()==1)
            	{
            		break;
            	}
            	
                switch (randomPicks[z]) {
                    case 1:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Where does a computer add and compare data ?");
                        System.out.println("A) Hard disk B) Floppy disk C) CPU chip D) Memory chip ");
                        choice = input.nextLine();
                        if (choice.equals("c") || choice.equals("C")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 2:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("The word \"Computer\" usually refers to the Central processing unit plus?");
                        System.out.println("A) External memory B) Internal memory C) Input devices D) Output devices ");
                        choice = input.nextLine();
                        if (choice.equals("b") || choice.equals("B")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 3:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Which device can produce the final product of machine processing into a form usable by humans?");
                        System.out.println("A) Storage B) Input devices C) Output devices D) Control");
                        choice = input.nextLine();
                        if (choice.equals("c") || choice.equals("C")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 4:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("A person who used his or expertise to gain access to other peoples computers to get information illegally or do damage is");
                        System.out.println("A) Hacker B) Analyst C) Instant messenger D) Programmer ");
                        choice = input.nextLine();
                        if (choice.equals("a") || choice.equals("A")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 5:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("High level language is also called: ");
                        System.out.println("A) Problem oriented language B) Business oriented language C) Mathematically oriented language D) All of the above ");
                        choice = input.nextLine();
                        if (choice.equals("d") || choice.equals("D")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 6:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Which language is directly understood by the computer without translation program?\n");
                        System.out.println("A) Machine language B) High level language C) Assembly language D) all of the above");
                        choice = input.nextLine();
                        if (choice.equals("a") || choice.equals("A")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 7:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Which transmission media is fastest?");
                        System.out.println("A) coaxial cable B) infrared rays C) Bluetooth D) fiber optics");
                        choice = input.nextLine();
                        if (choice.equals("d") || choice.equals("D")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 8:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Process is:");
                        System.out.println("A) contents of main memory B) a job in secondary memory C) a program in execution D) program in High level language kept on disk");
                        choice = input.nextLine();
                        if (choice.equals("c") || choice.equals("C")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }


                }
            }
        }

        if(getCategory()==4){

            for (int z = 0; z < 4; z++) {
            	if(getWronganswer()==1)
            	{
            		break;
            	}
            
                switch (randomPicks[z]) {
                    case 1:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Instrument used to measure earthquake is known as:");
                        System.out.println("A) seismograph B) quake meter C) barometer D) none of the above ");
                        choice = input.nextLine();
                        if (choice.equals("a") || choice.equals("A")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 2:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Which one of the following zones of the atmosphere is rich in Ozone gas?");
                        System.out.println("A) Mesosphere B) Stratosphere C) Troposphere D) Ionosphere ");
                        choice = input.nextLine();
                        if (choice.equals("b") || choice.equals("B")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 3:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("What is the name of the capital city of Australia");
                        System.out.println("A) Sydney B) Melbourne C) Canberra D) Adelaide");
                        choice = input.nextLine();
                        if (choice.equals("c") || choice.equals("C")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 4:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Troposphere is the hottest part of the atmosphere because?");
                        System.out.println("A) It is closest to the sun B) It is heated by the Earth's surface C) Heat is generated in it  D) There are charged particles in it");
                        choice = input.nextLine();                        
                        if (choice.equals("b") || choice.equals("B")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 5:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Which of the following do not belong to solar system?");
                        System.out.println("A) Asteroids B) Comets C) Planets D) Nebulae");
                        choice = input.nextLine();
                        if (choice.equals("d") || choice.equals("D")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 6:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("We always see the same face of the Moon, because?");
                        System.out.println("A) It is smaller than earth B) It revolves on its axis in the direction opposite to that of the earth \nC) It takes equal time for revolution around the earth and rotation on its own axis\n D) It rotates at the same speed as the earth around the sun");
                        choice = input.nextLine();                        
                        if (choice.equals("c") || choice.equals("C")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 7:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("Which imaginary line, located at zero degrees latitude,divides the earth into Northern and Southern hemispheres?");
                        System.out.println("A) Equator B) Horizontal C) vertical D) None of These");
                        choice = input.nextLine();
                        if (choice.equals("a") || choice.equals("A")){
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                             break;
                         } else {
                        	 System.out.println("Your answer was wrong.The competition is over.");
                        	 setWronganswer(1);
                             System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                             setNoMistake(0);
                             break;
                         }
                    case 8:
                    	System.out.println("You are at the "+ (getQuestionCounter()+1) +". question");
                    	System.out.println("When a body is taken from the earth to the moon:\n");
                        System.out.println("A) Its weight increases B) Its weight remains unchanged C) It becomes completely weightless D) Its weight decreases");
                        choice = input.nextLine();                        
                        if (choice.equals("d") || choice.equals("D")) {
                        	 setQuestionCounter(getQuestionCounter()+1); 
                             System.out.println("Congrats! Onto the next questions!");
                            break;
                        } else {
                        	System.out.println("Your answer was wrong.The competition is over.");
                        	setWronganswer(1);
                            System.out.println("You reached the "+(getQuestionCounter()+1)+". question");
                            setNoMistake(0);
                            break;
                        }

                }
            }
        }ToTheNextDifficulty();

	  }
    }
 
