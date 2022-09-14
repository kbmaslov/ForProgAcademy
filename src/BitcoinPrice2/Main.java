package BitcoinPrice2;

public class Main {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator(21000);
        double bitcoin = calculator1.bitcoin;
        System.out.println("What is bitcoin price today ?" + "\n" + bitcoin);
        System.out.println("How much dollar do you have ? ");
        Calculator calculator2 = new Calculator(21000);
        calculator2.culculation();
    }
}
