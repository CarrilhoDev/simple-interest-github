import java.util.Scanner;

public class Program {

public static void main(String[] args) {
    
	
	     
        
	Scanner sc = new Scanner(System.in);
        System.out.println("Type the principal value: ");
        double principal = sc.nextDouble();
        System.out.println("Type the rate value(%): ");
        double rate = sc.nextDouble();
        System.out.println("What is the type of rate?");
        System.out.println("type: 1 for p.a., 2 for p.m., 3 for p.d.");
        int choice1 = sc.nextInt();
        
        
        SimpleInterest simple1 = new SimpleInterest();
        simple1.setTypeOfRate(choice1);
        simple1.setPrincipal(principal);
        simple1.setRate(rate);

        if (choice1 >= 1 && choice1 <= 3) {
            
        	System.out.println("What is the period of time: ");
            int period = sc.nextInt();
            System.out.println("What is the type of period: ");
            System.out.println("Type: 1 for years, 2 for months, 3 for days");
            int choice2 = sc.nextInt();
            simple1.setPeriod(choice2, period);
            simple1.setSimpleInterest(choice1, choice2);
            
            
            
            
            System.out.println(simple1);
        
        } else {
            System.out.println("Invalid choice. You need to choose 1, 2 or 3!");
        }
        

        sc.close();
    }

}
