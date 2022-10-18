package at.noel.basics;

public class array_uebung_1 {
    public static void main(String[] args) {

        int[] data = {1,2,3,4,5,6,7,8,9,10};
        int tmp;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            tmp = data[i];
            count = count + tmp;
            System.out.println(tmp);
        }
        System.out.println(count);
    }
}
