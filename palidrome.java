  import java.util.*;
  public class palidrome {
    public static void main(String[] args) {
        int rev = 0;
       
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
         int original = n;
        
        while(n>0){
            int d = n%10;
             rev = rev *10 + d;
             n = n/10;
        }
        if(original==rev){
            System.out.print("number is palidrome");
          } else {
            System.out.println("number is not palidrome");
          }
       
    }
    
}
