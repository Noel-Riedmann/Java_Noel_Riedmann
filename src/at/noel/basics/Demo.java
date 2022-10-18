package at.noel.basics;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //variable
        int a = 7;
        double b = 3.14;
        boolean isHuman = true;

        //string and sout
        String name = "noel";
        System.out.println(name);

        //if and else
        if (a == 8) {
            System.out.println("it's 8");
        } else {
            System.out.println("u r wrong");
        }


        //if and else (important: pay attention to all brackets are beeing used corectly)
        if ((a > 0) && (a < 7)) {
            System.out.println("a is between 0 and 7");
        } else {
            System.out.println("it isn't");
        }

        //switch  default = every other value which we didn't state with "case"
        int u = 45;

        switch (u) {
            case 0:
                System.out.println("is 0");
                break;

            case 1:
                System.out.println("is 1");
                break;
            default:
                System.out.println("unknown value");
        }

        //for loop    (Don't repeat yourself)
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " loop");
        }

        for (int y = 0; y < 10; y = y +2) {
            System.out.println(y + " skip");

        }


        //while loop and random number

        Random random = new Random();
        boolean isFinished = false;

        while (! isFinished){
            int randomValue = random.nextInt(  100);
            System.out.println("while loop");
        }



    }
}
