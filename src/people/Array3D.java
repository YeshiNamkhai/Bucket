package src.people;

class Array3D {

    public static void main(String[] args) {
        int[][][] unitsSold=new int[][][]{ //new
        { //New York
            {0,0,0,0},  // Jan
            {0,0,0,0},  // Feb
            {0,0,0,0},  // Mar
            {0,850,0,0} // Apr
        },
        { //San Francisco
            {0,0,0,0},  // Jan
            {0,0,0,0},  // Feb
            {0,0,0,0},  // Mar
            {0,0,0,0}   // Apr
        },
        { //Chicago
            {0,0,0,0},  // Jan
            {0,0,0,0},  // Feb
            {0,0,0,0},  // Mar
            {0,0,0,0}   // Apr
        },
        { //Atlanta
            {0,0,0,0},  // Jan
            {0,0,0,0},  // Feb
            {0,0,0,0},  // Mar
            {0,0,0,0}   // Apr
        }
        };
        System.out.println("unitsSold[0][3][1]: "+unitsSold[0][3][1]);
    }

}