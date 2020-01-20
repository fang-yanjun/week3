
package testworker;

/**
 * @author Yanjun Fang
 */
import java.util.Scanner;
public class TestWorker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("what kind of worker are you?(hourly/salaried): ");
       // String type = input.nextLine();
       // if(type.equals("hourly")){
//            HourlyWorker h1 = new HourlyWorker("yan", 30, 2);
//            h1.weeklyPay();
//            System.out.println(h1);
//            
//       // }
//       SalariedWorker s1 = new SalariedWorker("Edward", 10);
//       s1.weeklyPay();
//       System.out.println(s1);
    m(new HourlyWorker("yan", 30, 2));
    
    m(new SalariedWorker("Edward", 10));
             
    }
    public static void m(Worker w){
           System.out.println("The Salary is: "+ w.weeklyPay());
       }
}
