package project;

public class Player{

	public static double prize(double a) {
		
		double[] amount=new double[13];
		
		amount[0]=100;
		amount[1]=500;
		amount[2]=1000;
		amount[3]=2000;
		amount[4]=3000;
		amount[5]=5000;
		amount[6]=7500;		
		amount[7]=15000;
		amount[8]=30000;
		amount[9]=60000;
		amount[10]=125000;
		amount[11]=250000;
		amount[12]=1000000;
		
		return amount[(int) (a-1)];
	}
		

	
	

}
