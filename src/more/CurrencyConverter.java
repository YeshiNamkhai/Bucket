package src.more;

class CurrencyConverter {

    static double[] exchangeRates = new double[]{63.0,3.0,3.0,595.0,18.0,107.0,2.0};
    static String[] currencyNames = new String[]{"rupee","dirham","real","chilean_peso","mexican_peso","_yen","$australian"};
    /*
    static int rupee = 63;
    static int dirham = 3; // UAE
    static int real = 3;  // brazilian     
    static int chilean_peso = 595;
    static int mexican_peso = 18;       
    static int _yen = 107;
    static int $australian = 2;  // australian dollar
    static int dollar = 1;
    static int Rupee = 63;
    */

    private void printCurrencies() {
        /*
        System.out.println("rupee: " + rupee); 
        System.out.println("dirham: " + dirham); 
        System.out.println("real: " + real); 
        System.out.println("chilean_peso: " + chilean_peso); 
        System.out.println("mexican_peso: " + mexican_peso); 
        System.out.println("_yen: " + _yen); 
        System.out.println("$australian: " + $australian);
        */
        for (int i = 0; i < exchangeRates.length; i++) {
            System.out.println(currencyNames[i]+": " + exchangeRates[i]);
        }
    }

    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
                
    }

}