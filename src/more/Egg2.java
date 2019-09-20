package src.more;

    public class Egg2{

        public static void upper() {
            System.out.println("  _______");
            System.out.println(" /       \\");
            System.out.println("/         \\");
        }

        public static void lower() {
            System.out.println("\\         /");
            System.out.println(" \\_______/");
        }

    public static void main(String[] args) {
        upper();
        lower();
        System.out.println("-\"-'-\"-'-\"-");
        upper();
        lower();
        System.out.println("-\"-'-\"-'-\"-");
        lower();
        upper();
        System.out.println("-\"-'-\"-'-\"-");
        lower();
    }
}