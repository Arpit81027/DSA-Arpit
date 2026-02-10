import java.util.*;
      class Basic{
        public static void main(String[] args) {
            int rev =0;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number:");
             int n = sc.nextInt();
             while(n>0){
                int d = n%10;
                rev = d + rev*10;
                 n = n/10;

             }
             System.out.println("revrse number is:"+rev);

        }

}