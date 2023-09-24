import java.util.Scanner;

public class myMethods {

    public static void paySalaries() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of employees whose salaries you want to pay:");

        int numberEmployees= scanner.nextInt(); // kullanicidan isci sayisini aldim

        double[] salaries= new double[numberEmployees];
        for (int i=0 ; i <numberEmployees; i++){
            // diziler 0 dan basladigi icin i+1 numarali iscinin maasini girmesini istedim.
            System.out.println("Please enter the salary of number " + (i+1) + ". employee" );
            salaries[i]= scanner.nextDouble();

        }

        System.out.println("***** The salaries given to employees: *****");
        for (int i=0; i < numberEmployees; i++)
        {
            System.out.println((i+1 + ". number employee " + salaries[i]+ " kronor"));
        }

        for (int i=0; i<numberEmployees; i++)
        {
            double afterTax= salaries[i]*0.7;
            System.out.println("Salary after tax deduction  for "+ (i+1) + ". worker " + afterTax +"kronor" );
        }
        System.out.println("Thank you for using this program");

    }



    public static void creatNewBill(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please write your total of the new bills");

        int totalBills=scanner.nextInt();
        double moms= totalBills*0.25;

        double netTotal=totalBills- moms;

        System.out.println("Your total of the new bills: " + totalBills);
        System.out.println("Total of the moms: "+ moms);
        System.out.println("Net total: " + netTotal);

        System.out.println("Thank you for using this program");
    }


    public static void payBill(){
        Scanner scanner= new Scanner(System.in);

        int kontoSaldo= (int) 900000000;

        System.out.println("Please write the number of bills that you will pay: ");

        int numberofBills=scanner.nextInt();

        int[] bills= new int[numberofBills];

        for (int i=0; i <numberofBills; i++) {
            System.out.println(" Please write the" + (i+1) + ". bill's amount :");
            bills[i]=scanner.nextInt();
        }

         double totalBills=0;

        for (double total: bills) {
            totalBills+= total;

        }

        System.out.println("The bills that will be paid");
        for (int i=0; i< numberofBills; i++){
            System.out.println("For the "+ (i+1) + ". bill" + bills[i] + " kronor will be paid");

        }
        System.out.println(" All of the bills total is " + totalBills);

        if (kontoSaldo>=totalBills)
        {
            kontoSaldo-=totalBills;

            System.out.println("Your payment is succesfull and your remaining balance : " + kontoSaldo);
        }
        else if (kontoSaldo<totalBills){
            System.out.println("Insufficient funds. Payment is failed");
        }
        else {
            System.out.println("Please write an invalid amount!");
        }
        System.out.println("Thank you for using this program");

    }

    public static void endProgram (){
        System.out.println("***** The program has ended *****");
        System.exit(0);
    }

}

