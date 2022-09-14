public class CrossSum3 {
    public static void main(String[] args) {
        for (int i = 0; i < 1001; i++) {
            String numberInString = Integer.toString(i);
            char[] numbers = numberInString.toCharArray();
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum = sum + Character.getNumericValue(numbers[j]);

            }



        }
    }
}
