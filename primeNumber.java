import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me a number: ");

        int number = scanner.nextInt();

        boolean prime = true;

        if(number == 1 || number ==0 ){
            prime = false;
        }

        for (int i = 2; i < number ; i++) {
            if (number % i == 0){
                prime = false;
                break;
            }
        }

        if (prime){
            System.out.println( number + " is a prime number");
        }
        else
            System.out.println(number + " is not a prime number");

    }
}

