package BitcoinPrice1;

class Main {
    public static void main(String[] args) {
        System.out.println("What is bitcoin price today ?" + "\n" + Calculator.BITCOINTODAY);
        System.out.println("How much dollar do you have ? ");
        Calculator calculator = new Calculator();
        calculator.calculation();
    }
}