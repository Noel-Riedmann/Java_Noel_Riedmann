package at.noel.basics;

public class CrossSum3 {
    public static void main(String[] args) {
        for (int y = 0; y < 1001; y++) {
            String numberInString = Integer.toString(y);
            char[] numbers = numberInString.toCharArray();
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum = sum + Character.getNumericValue(numbers[j]);


            int [] fr = new int [numbers.length];
            int visited = -1;
            for(int i = 0; i < numbers.length; i++){
                int count = 1;
                for(int x = i+1; x < numbers.length; x++){
                    if(numbers[i] == numbers[x]){
                        count++;
                        fr[x] = visited;
                    }
                }
                if(fr[i] != visited)
                    fr[i] = count;
            }
            for(int i = 0; i < fr.length; i++){
                if(fr[i] != visited)
                    System.out.println("num " + numbers[i] + " " + "frq " + fr[i]);


        }}
    }
}}
