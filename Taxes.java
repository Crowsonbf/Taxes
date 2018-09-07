import java.util.Scanner;
public class Taxes
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int payrate;
        int age;
        int dependent;
        int childdiscount;
        double t1;
        double t2;
        double t3;
        double t4;
        double t5;

        System.out.println("How much do you make a year? (round to nearest 100)");
        payrate = s.nextInt();
        System.out.println("What age are you?");
        age = s.nextInt();
        System.out.println("How many child dependents do you have?");
        dependent = s.nextInt();
        System.out.println("Calculating");

        
        if ( payrate <= 10000 ){
            System.out.println("No Taxes");
        
        }
        else if ( payrate <= 25000 && payrate > 10000 ){
           t2 = payrate * 0.10 ;
           System.out.println("Taxes before discounts: " + t2);
           if (child = 1){
             childdiscount = t2 - 1000
            }
            else if ( child > 2 ){
                childdiscount = (t2 - ((child - 1) * 500)) - 1000;
            }
        
        }
        else if ( payrate <= 75000 && payrate > 25000 ){
            t3 = ((payrate - 25000) * 0.20) + (25000 * 0.1);
            System.out.println("Taxes before discounts: " + t3);
            if (child = 1){
             childdiscount = t3 - 1000
        }
            
        }
        else if ( payrate <= 250000 && payrate > 75000 ){
            t4 = ((payrate - 75000) * 0.30) + (50000 * 0.20) + (25000 * 0.1);
            System.out.println("Taxes before discounts: " + t4);
            if (child = 1){
             childdiscount = t4 - 1000
        }
        
        }
        else if ( payrate > 250000 ){
            t5 = ((payrate - 250000) * 0.50) + (175000 * 0.30) + (50000 * 0.20) + (25000 * 0.1);
            System.out.println("Taxes before discounts: " + t5);
                if (child = 1){
             childdiscount = t5 - 1000
        }
        ]
    
    }
}
