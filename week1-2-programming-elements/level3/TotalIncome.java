import java.util.Scanner;

class TotalIncome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary;
        double bonus;

        System.out.print("Enter salary: ");
        salary = input.nextDouble();

        System.out.print("Enter bonus: ");
        bonus = input.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + totalIncome);

        input.close();
    }
}