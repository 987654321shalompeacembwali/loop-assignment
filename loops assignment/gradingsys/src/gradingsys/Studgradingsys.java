package gradingsys;
//import java.util.Scanner;
public class Studgradingsys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//    Scanner input=new Scanner(System.in);
//    String name;
//    System.out.println("Please Enter Your Name:");
//    name=input.nextLine();
//    System.out.println("you are welcome");
//		 //for loop
//
//	for(int i=0;i<5;i++) {
//		System.out.println(i);
//	}
////
//	for(int pass=80;pass>=75;pass--) {
//		System.out.println(pass);
//		if(pass >=75) {
//			System.out.println("pass");
//		}else {
//			System.out.println("fail");
			
//		}
			
//}
		//Array of students Scores
		String[]names= {"Jolly","Jaisy","Jessy","Jane","Josy"};
		int[]studentScores= {90,80,60,55,50};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]+":Scores="+studentScores[i]);
			if(studentScores[i]>70) {
				System.out.println(" you pass");	
			}else {
				
				System.out.println( "you fail:" );
			}
			
			
	
			
		}
		
		
	
	 

	
			
   	
		
		
	}

}
