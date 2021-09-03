import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /*
        gefaellt ist leer -> niemandem gefällt das
gefaellt[„Anton“] -> Anton gefaellt das
gefaellt[„Anton“, Alex] => Anton und Alex gefaellt das.
gefaellt["Anton", "Alex", "Lilo", "Peter", "Josef"] => Anton, Alex und 3 anderen gefällt das
         */

        String[] namen = {"alex","flo", "jasmin"};
        gefaellt(namen);
            }

    public static void gefaellt(String[] namen) {
        if (namen.length == 0) {
            System.out.println("Es gefällt niemanden");
        } else if (namen.length == 1) {
            System.out.println(namen[0] + " gefällt das");
            } else if(namen.length == 2){
                System.out.println(namen[0] + " und " + namen[1] + " gefällt das");
                } else{
                  System.out.println(namen[0] + ", " + namen[1] + " und " + (namen.length-2) +" andere(n) gefällt das");
                    }
        }
}

