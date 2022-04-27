import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {


        System.out.println("  1. Einzahlen");
        System.out.println("  2. Abheben");
        System.out.println("  3. Kontostand");
        System.out.println("  4. Ende");
        Scanner scanner = new Scanner(System.in);

        boolean isFinished = false;
        int balance = 0;
        while (!isFinished) {

            int selection = scanner.nextInt();


            switch (selection) {
                case 1:
                    System.out.println("Wie viel möchten Sie einzahlen?");
                    selection = scanner.nextInt();
                    balance += selection;
                    System.out.println("Sie haben " + selection + "€ eingezahlt");
                    break;
                case 2:
                    System.out.println("Wie viel möchten Sie abheben");
                    selection = scanner.nextInt();
                    if (selection < balance) {
                        balance = balance - selection;
                        System.out.println("Sie haben " + selection + "€ abgehoben");
                    } else {
                        System.out.println("Sie haben zu wenig Geld! Möchten Sie vortfahren (Y/N)?");
                        String str = scanner.next();
                        if (str.equalsIgnoreCase("y")) {

                            balance = balance - selection;
                            System.out.println("Ihr kontostand beträgt: " + balance);
                        } else {
                            System.out.println("Vorgang abgebrochen");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Ihr aktueller Kontostand: " + balance);
                    break;
                case 4:
                    isFinished = true;
                    break;
            }
        }
    }
}

