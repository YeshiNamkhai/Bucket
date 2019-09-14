package mix;

public class CurrencyConverter {

    static int rupee = 63;
    static int dirham = 3; // UAE
    static int real = 3;  // brazilian     
    static int chilean_peso = 595;
    static int mexican_peso = 18;       
    static int _yen = 107;
    static int $australian = 2;  // australian dollar
    static int dollar = 1;
    static int Rupee = 63;

    public static void printCurrencies() {
        System.out.println("rupee: " + rupee); 
        System.out.println("dirham: " + dirham); 
        System.out.println("real: " + real); 
        System.out.println("chilean_peso: " + chilean_peso); 
        System.out.println("mexican_peso: " + mexican_peso); 
        System.out.println("_yen: " + _yen); 
        System.out.println("$australian: " + $australian);
}

    public static void main(String[] args) {
        CurrencyConverter cc = new CurrencyConverter();
        cc.printCurrencies();
                
    }
}