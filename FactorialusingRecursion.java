import java.util.Scanner;

public class FactorialusingRecursion {
    public int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*(fact(n-1));
        }
    }

    public static void main(String[] args) {
        FactorialusingRecursion f=new FactorialusingRecursion();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        System.out.println(f.fact(sc.nextInt()));
    }
}
