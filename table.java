import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of n");
        int n= sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+ " * "+" 1 "+" = "+n*i);
        }
    }
}
