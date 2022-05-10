import java.util.*;
import javax.lang.model.util.ElementScanner14;  
public class Test {
   static String is_divisible (int number) {
        int num= number;
        int sum=0;  
        int dividant= number;
        while (num > 0) {
            num = num / 10;
            sum= sum+num%10;    
        }
        if ( dividant % sum == 0) {            
          return "True";                     
        } 
          return "False";
    }    
    public static void main(String args[]) {
    System.out.println("Enter the number");
    Scanner scan= new Scanner(System.in); 
    int input=scan.nextInt();
    System.out.println(is_divisible(input));

}
}