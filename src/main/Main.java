package src.main;

class Main{
    /**
     * This is main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("args-size="+args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]="+args[i]);
        }

        
    }

    /**
     * This is a method to make a sum
     * @param a first number
     * @param b second number
     * @return
     */
    public static int sum(int a,int b) {
        return a+b;
    }
}