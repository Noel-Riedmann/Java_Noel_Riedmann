import java.util.Scanner;

public class ProgrammingContest3bWI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sel = scanner.nextInt();

        String numberInString = Integer.toString(sel);
        char[] numbers = numberInString.toCharArray();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;
        int h = 0;
        int i = 0;
        int j = 0;

        a =   Character.getNumericValue(numbers[0]);
        b =   Character.getNumericValue(numbers[1]);
        c =   Character.getNumericValue(numbers[2]);
        d =   Character.getNumericValue(numbers[3]);
        e =   Character.getNumericValue(numbers[4]);
        f =   Character.getNumericValue(numbers[5]);
        g =   Character.getNumericValue(numbers[6]);
        h =   Character.getNumericValue(numbers[7]);
        i =   Character.getNumericValue(numbers[8]);
        j =   Character.getNumericValue(numbers[9]);

        System.out.println("(" + a + b + c + ") " + d+e+f+ " - " + g+h+i+j);




    }}

