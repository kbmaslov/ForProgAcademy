package BitcoinPrice3;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);
    double bitcoin;
    double dollar;
    double result;
    boolean condition = true;
    //Set
    public void setBitcoin(double bitcoin) {
        this.bitcoin = bitcoin;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    //Get
    public double getBitcoin() {
        return bitcoin;
    }

    public double getDollar() {
        return dollar;
    }

    void culculation(){
        while (condition) {
            System.out.println("Enter number,that equals Bitcoin for today : ");
            bitcoin = scanner.nextDouble();
            setBitcoin(bitcoin);
            System.out.println("Enter sum in dollar,that you have : ");
            dollar = scanner.nextDouble();
            setDollar(dollar);
            result = getDollar()/getBitcoin();
            System.out.println("You can buy " + result + " BTC");
            System.out.println();
        }
    }
}
