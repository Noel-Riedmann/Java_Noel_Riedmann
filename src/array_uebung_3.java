import java.lang.reflect.Array;
import java.util.Arrays;

public class array_uebung_3 {
    public static void main(String[] args) {

        int[] data = {8, 3, 2, 22, 8, 1};

        Arrays.sort(data);

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
