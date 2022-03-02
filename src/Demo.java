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
        if(a==8){
            System.out.println("it's 8");
    } else {
            System.out.println("u r wrong");
        }

        //count
        for (int i = 0; i < 10; i++) {
            System.out.println("loops :D");
        }

        //if and else (important: pay attention to all brackets are beeing used corectly)
        if((a>0) && (a<7)){
            System.out.println("a is between 0 and 7");
        } else {
            System.out.println("it isn't");
        }
}}
