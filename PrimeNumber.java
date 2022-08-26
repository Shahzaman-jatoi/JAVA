import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        int num, temp = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find if it is prime or not: ");
        num = input.nextInt();

        for(int i = 2; i <= num - 1; i++){
            if(num % i == 0){
                temp = temp + 1;
            }
        }
        if(temp > 0){
            System.out.println("Number is not prime");
        }
        else
        {
            System.out.println("Number is prime");
        }
    }
}