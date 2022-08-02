/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class ava{
    int n;
    public ava(){
        super();
        n=0;
    }
    public void book(int seat){
        if(n<=50){
            n = n+seat;
            System.out.println("Booking successful " + seat + "seat");
        }else{
            System.out.println("You are in waiting list please wait for confirmation");
            n = n + seat;
        }
    }
    public void cancel(int seat){
        n = n-seat;
    }
}


public class Main
{
	public static void main(String[] args) {
		ava a = new ava();
		Scanner sc = new Scanner(System.in);
		boolean i = true;
		while(i){
		    System.out.println("Press 0 to book " + " 1 to cancel");
		    int nxt = sc.nextInt();
		    switch(nxt){
		        case 0:
		            {
		                System.out.println("No. of seats to book");
		                int b = sc.nextInt();
		                a.book(b);
		                break;
		            }
		            case 1:{
		                System.out.println("No of seats to cancel");
		                int b = sc.nextInt();
		                a.cancel(b);
		                break;
		            }
		            case 2:{
		                i = false;
		                break;
		            }
		            default:
		                System.out.println("Thank you");
		    }
		}
	}
}
