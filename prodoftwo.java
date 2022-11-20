import java.util.Scanner;

public class ProdofTwo{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter num1: ");
        int num1 = in.nextInt();
        System.out.println("Enter num2: ");
        int num2 = in.nextInt();
        
        int Prod = Total(num1,num2);
        System.out.println("The product of two number is : " + Prod);
        
    }
    
    public static int Total(int num1, int num2){
        return num1 * num2;
    }
}