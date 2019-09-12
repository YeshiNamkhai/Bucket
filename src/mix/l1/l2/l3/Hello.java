package src.mix.l1.l2.l3;

class Hello {
    /**
     * Main class
     * @param args command line arguments
     */
    public static void main(String[] args){
        src.mix.l1.Hello l1 = new src.mix.l1.Hello();
        l1.run();

        src.mix.l1.l2.Hello l2 = new src.mix.l1.l2.Hello();
        l2.run();

        System.out.println("Hello from level 3!");
    }
}
