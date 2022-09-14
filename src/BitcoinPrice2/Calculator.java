package BitcoinPrice2;

import java.util.Scanner;

public class Calculator {

    double bitcoin;
    Calculator(double b){
        bitcoin = b;
    }
    Scanner scanner = new Scanner(System.in);
        double result;
        boolean condition = true;

        void culculation(){
            while (condition){
                double dollar = scanner.nextDouble();
                result = dollar/bitcoin;
                System.out.println("You can buy " + result + " BTC");
                System.out.println();
                System.out.println("How much dollar do you have ? ");

            }
    }
}
