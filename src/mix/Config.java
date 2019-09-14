package src.mix;
/**
 * Configuration Class
 */

public class Config {
    public static final String NAME = "John";
    public static final int MAX_COLUMN_COUNT = 25;

    /**
     * method to print configuration
     */
    public static void printConfig() {
        System.out.println("name="+NAME+" columnCount="+MAX_COLUMN_COUNT);
    }
}