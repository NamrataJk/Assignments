import java.util.*;
class Project10 {
    public static void main(String[] args) {
        int n,r,p,fact1,fact2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r");
        n = sc.nextInt();
        r = sc.nextInt();
        fact1 = n;
        for(int i= n-1; i>=1;i--){
            fact1 = fact1*i;
        }
        int number;
        number = n-r;
        fact2 = number;
        for(int i = number -1;i>=1;i--){
            fact2 = fact2*i;
        }
        p = fact1/fact2;
        System.out.println("permutation" +p);
        
    }
}