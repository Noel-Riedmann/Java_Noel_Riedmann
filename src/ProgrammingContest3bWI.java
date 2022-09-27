import java.util.Scanner;

public class ProgrammingContest3bWI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        a = a * 120;
        if (b<(a-c)){
           String string = new String("false");
            System.out.println(string);
        }
        else {
            String stri = new String("true");
            System.out.println(stri);
        }
        }
    }

