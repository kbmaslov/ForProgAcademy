package BitcoinPrice1;

import java.util.Scanner;

public class Calculator {
        Scanner scanner = new Scanner(System.in);
        static final double BITCOINTODAY = 21000;
        double result;
        boolean condition = true;

        void calculation(){
            while (condition){
                double dollar = scanner.nextDouble();
                result = dollar/BITCOINTODAY;
                System.out.println("You can buy " + result + " BTC");
                System.out.println();
                System.out.println("How much dollar do you have ? ");
            }
        }
}

