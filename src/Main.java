import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean programIsRunning=true;
        while(programIsRunning) {

            try {

            System.out.println("***** Welcome to the program! *****");
            System.out.println("Please choose what you want");
            System.out.println("Press '1' to pay salaries to employees");
            System.out.println("Press '2' to create new bill");
            System.out.println("Press '3' to pay one or more bills");
            System.out.println("Press '4' to exit ");


            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    myMethods.paySalaries();
                    break;
                case 2:
                    myMethods.creatNewBill();
                    break;
                case 3:
                    myMethods.payBill();
                    break;

                case 4:
                    myMethods.endProgram();
                    break;

                default:
                    System.out.println("Invalid number. Please choose a number between 1-4 ! ");

            }

                }
                catch (InputMismatchException e) {
                System.out.println("Invalid character. Please enter only numbers");
                scanner.nextLine(); // yanlis girisi temizlemek icin
            }


            }


    }
}