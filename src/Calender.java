import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select starting day 1-7");
        int selectionStartingDay = scanner.nextInt();
        switch (selectionStartingDay) {
            case 1:
                System.out.println("Select length of month (28, 30, 31)");
                int monthLength = scanner.nextInt();

                switch (monthLength) {
                    case 31:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("| 01 | 02 | 03 | 04 | 05 | 06 | 07 |");
                        System.out.println("| 08 | 09 | 10 | 11 | 12 | 13 | 14 |");
                        System.out.println("| 15 | 16 | 17 | 18 | 19 | 20 | 21 |");
                        System.out.println("| 22 | 23 | 24 | 25 | 26 | 27 | 28 |");
                        System.out.println("| 29 | 30 | 31 |    |    |    |    |");
                        break;
                    case 30:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("| 01 | 02 | 03 | 04 | 05 | 06 | 07 |");
                        System.out.println("| 08 | 09 | 10 | 11 | 12 | 13 | 14 |");
                        System.out.println("| 15 | 16 | 17 | 18 | 19 | 20 | 21 |");
                        System.out.println("| 22 | 23 | 24 | 25 | 26 | 27 | 28 |");
                        System.out.println("| 29 | 30 |    |    |    |    |    |");
                        break;
                    case 28:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("| 01 | 02 | 03 | 04 | 05 | 06 | 07 |");
                        System.out.println("| 08 | 09 | 10 | 11 | 12 | 13 | 14 |");
                        System.out.println("| 15 | 16 | 17 | 18 | 19 | 20 | 21 |");
                        System.out.println("| 22 | 23 | 24 | 25 | 26 | 27 | 28 |");
                        break;
                }
            case 2:
                System.out.println("Select length of month (28, 30, 31)");
                int monthLength2 = scanner.nextInt();

                switch (monthLength2) {
                    case 31:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    | 01 | 02 | 03 | 04 | 05 | 06 |");
                        System.out.println("| 07 | 08 | 09 | 10 | 11 | 12 | 13 |");
                        System.out.println("| 14 | 15 | 16 | 17 | 18 | 19 | 20 |");
                        System.out.println("| 21 | 22 | 23 | 24 | 25 | 26 | 27 |");
                        System.out.println("| 28 | 29 | 30 | 31 |    |    |    |");
                        break;
                    case 30:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    | 01 | 02 | 03 | 04 | 05 | 06 |");
                        System.out.println("| 07 | 08 | 09 | 10 | 11 | 12 | 13 |");
                        System.out.println("| 14 | 15 | 16 | 17 | 18 | 19 | 20 |");
                        System.out.println("| 21 | 22 | 23 | 24 | 25 | 26 | 27 |");
                        System.out.println("| 28 | 29 | 30 |    |    |    |    |");
                        break;
                    case 28:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    | 01 | 02 | 03 | 04 | 05 | 06 |");
                        System.out.println("| 07 | 08 | 09 | 10 | 11 | 12 | 13 |");
                        System.out.println("| 14 | 15 | 16 | 17 | 18 | 19 | 20 |");
                        System.out.println("| 21 | 22 | 23 | 24 | 25 | 26 | 27 |");
                        System.out.println("| 28 |    |    |    |    |    |    |");
                        break;
                }
            case 3:
                System.out.println("Select length of month (28, 30, 31)");
                int monthLength3 = scanner.nextInt();

                switch (monthLength3) {
                    case 31:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    | 01 | 02 | 03 | 04 | 05 |");
                        System.out.println("| 06 | 07 | 08 | 09 | 10 | 11 | 12 |");
                        System.out.println("| 13 | 14 | 15 | 16 | 17 | 18 | 19 |");
                        System.out.println("| 20 | 21 | 22 | 23 | 24 | 25 | 26 |");
                        System.out.println("| 27 | 28 | 29 | 30 | 31 |    |    |");
                        break;
                    case 30:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    | 01 | 02 | 03 | 04 | 05 |");
                        System.out.println("| 06 | 07 | 08 | 09 | 10 | 11 | 12 |");
                        System.out.println("| 13 | 14 | 15 | 16 | 17 | 18 | 19 |");
                        System.out.println("| 20 | 21 | 22 | 23 | 24 | 25 | 26 |");
                        System.out.println("| 27 | 28 | 29 | 30 |    |    |    |");
                        break;
                    case 28:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    | 01 | 02 | 03 | 04 | 05 |");
                        System.out.println("| 06 | 07 | 08 | 09 | 10 | 11 | 12 |");
                        System.out.println("| 13 | 14 | 15 | 16 | 17 | 18 | 19 |");
                        System.out.println("| 20 | 21 | 22 | 23 | 24 | 25 | 26 |");
                        System.out.println("| 27 | 28 |    |    |    |    |    |");
                        break;
                }
            case 4:
                System.out.println("Select length of month (28, 30, 31)");
                int monthLength4 = scanner.nextInt();

                switch (monthLength4) {
                    case 31:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    | 01 | 02 | 03 | 04 |");
                        System.out.println("| 05 | 06 | 07 | 08 | 09 | 10 | 11 |");
                        System.out.println("| 12 | 13 | 14 | 15 | 16 | 17 | 18 |");
                        System.out.println("| 19 | 20 | 21 | 22 | 23 | 24 | 25 |");
                        System.out.println("| 26 | 27 | 28 | 29 | 30 | 31 |    |");
                        break;
                    case 30:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    | 01 | 02 | 03 | 04 |");
                        System.out.println("| 05 | 06 | 07 | 08 | 09 | 10 | 11 |");
                        System.out.println("| 12 | 13 | 14 | 15 | 16 | 17 | 18 |");
                        System.out.println("| 19 | 20 | 21 | 22 | 23 | 24 | 25 |");
                        System.out.println("| 26 | 27 | 28 | 29 | 30 |    |    |");
                        break;
                    case 28:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    | 01 | 02 | 03 | 04 |");
                        System.out.println("| 05 | 06 | 07 | 08 | 09 | 10 | 11 |");
                        System.out.println("| 12 | 13 | 14 | 15 | 16 | 17 | 18 |");
                        System.out.println("| 19 | 20 | 21 | 22 | 23 | 24 | 25 |");
                        System.out.println("| 26 | 27 | 28 |    |    |    |    |");
                        break;
                }
            case 5:
                System.out.println("Select length of month (28, 30, 31)");
                int monthLength5 = scanner.nextInt();

                switch (monthLength5) {
                    case 31:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    |    | 01 | 02 | 03 |");
                        System.out.println("| 04 | 05 | 06 | 07 | 08 | 09 | 10 |");
                        System.out.println("| 11 | 12 | 13 | 14 | 15 | 16 | 17 |");
                        System.out.println("| 18 | 19 | 20 | 21 | 22 | 23 | 24 |");
                        System.out.println("| 25 | 26 | 27 | 28 | 29 | 30 | 31 |");
                        break;
                    case 30:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    |    | 01 | 02 | 03 |");
                        System.out.println("| 04 | 05 | 06 | 07 | 08 | 09 | 10 |");
                        System.out.println("| 11 | 12 | 13 | 14 | 15 | 16 | 17 |");
                        System.out.println("| 18 | 19 | 20 | 21 | 22 | 23 | 24 |");
                        System.out.println("| 25 | 26 | 27 | 28 | 29 | 30 |    |");
                        break;
                    case 29:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    |    | 01 | 02 | 03 |");
                        System.out.println("| 04 | 05 | 06 | 07 | 08 | 09 | 10 |");
                        System.out.println("| 11 | 12 | 13 | 14 | 15 | 16 | 17 |");
                        System.out.println("| 18 | 19 | 20 | 21 | 22 | 23 | 24 |");
                        System.out.println("| 25 | 26 | 27 | 28 |    |    |    |");
                        break;
                }
            case 6:
                System.out.println("Select length of month (28, 30, 31)");
                int monthLength6 = scanner.nextInt();

                switch (monthLength6) {
                    case 31:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    |    |    | 01 | 02 |");
                        System.out.println("| 03 | 04 | 05 | 06 | 07 | 08 | 09 |");
                        System.out.println("| 10 | 11 | 12 | 13 | 14 | 15 | 16 |");
                        System.out.println("| 17 | 18 | 19 | 20 | 21 | 22 | 23 |");
                        System.out.println("| 24 | 25 | 26 | 27 | 28 | 29 | 30 |");
                        System.out.println("| 31 |    |    |    |    |    |    |");
                        break;
                    case 30:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    |    |    | 01 | 02 |");
                        System.out.println("| 03 | 04 | 05 | 06 | 07 | 08 | 09 |");
                        System.out.println("| 10 | 11 | 12 | 13 | 14 | 15 | 16 |");
                        System.out.println("| 17 | 18 | 19 | 20 | 21 | 22 | 23 |");
                        System.out.println("| 24 | 25 | 26 | 27 | 28 | 29 | 30 |");
                        break;
                    case 28:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    |    |    | 01 | 02 |");
                        System.out.println("| 03 | 04 | 05 | 06 | 07 | 08 | 09 |");
                        System.out.println("| 10 | 11 | 12 | 13 | 14 | 15 | 16 |");
                        System.out.println("| 17 | 18 | 19 | 20 | 21 | 22 | 23 |");
                        System.out.println("| 24 | 25 | 26 | 27 | 28 |    |    |");
                        break;
                }
            case 7:
                System.out.println("Select length of month (28, 30, 31)");
                int monthLength7 = scanner.nextInt();

                switch (monthLength7) {
                    case 31:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    |    |    |    | 01 |");
                        System.out.println("| 02 | 03 | 04 | 05 | 06 | 07 | 08 |");
                        System.out.println("| 09 | 10 | 11 | 12 | 13 | 14 | 15 |");
                        System.out.println("| 16 | 17 | 18 | 19 | 20 | 21 | 22 |");
                        System.out.println("| 23 | 24 | 25 | 26 | 27 | 28 | 29 |");
                        System.out.println("| 30 | 31 |    |    |    |    |    |");
                        break;
                    case 30:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    |    |    |    | 01 |");
                        System.out.println("| 02 | 03 | 04 | 05 | 06 | 07 | 08 |");
                        System.out.println("| 09 | 10 | 11 | 12 | 13 | 14 | 15 |");
                        System.out.println("| 16 | 17 | 18 | 19 | 20 | 21 | 22 |");
                        System.out.println("| 23 | 24 | 25 | 26 | 27 | 28 | 29 |");
                        System.out.println("| 30 |    |    |    |    |    |    |");
                        break;
                    case 28:
                        System.out.println("| MO | DI | MI | DO | FR | SA | SO |");
                        System.out.println("|    |    |    |    |    |    | 01 |");
                        System.out.println("| 02 | 03 | 04 | 05 | 06 | 07 | 08 |");
                        System.out.println("| 09 | 10 | 11 | 12 | 13 | 14 | 15 |");
                        System.out.println("| 16 | 17 | 18 | 19 | 20 | 21 | 22 |");
                        System.out.println("| 23 | 24 | 25 | 26 | 27 | 28 |    |");
                        break;
                }
        }
    }
}
