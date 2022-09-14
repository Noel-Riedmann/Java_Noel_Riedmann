public class frequencyInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3};

        int[] b = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }}}