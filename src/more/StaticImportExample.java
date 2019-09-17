package src.more;

import static java.lang.Math.PI;
import static java.lang.Math.min;
import static java.lang.System.out;
import static src.more.Config.*;

public class StaticImportExample {

    public static void main(String[] args) {
        
    int min = min(5, 7);
    out.println("min="+min);
    out.println(Math.PI);

    printConfig();
    }
}

