import java.util.Random;

public class array_uebung_2 {
    public static void main(String[] args) {

        int[] randomNum = new int[50];
        Random random = new Random();
        int genNum = 0;
        int count = 0;

        for (int i = 0; i < randomNum.length; i++) {
            genNum = random.nextInt(101);
            randomNum[i] = genNum;
            count =  count + genNum;
            System.out.println(genNum);
        }

        System.out.println(count);


    }
}
