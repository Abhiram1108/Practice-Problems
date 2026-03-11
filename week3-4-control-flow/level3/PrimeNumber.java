import java.util.Scanner;

class PrimeNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        for(int i = 2; i < number; i++) {

            if(number % i == 0) {
                isPrime = false;
                break;
            }

        }

        if(number <= 1)
            isPrime = false;

        if(isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        input.close();
    }
}