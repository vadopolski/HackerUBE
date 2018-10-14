package day2.homework;

public class GetDoublicateChar {
    public static String getStringWithDoublicateChar2(StringBuilder inputString, int quantity) {
        int i = inputString.length() - 1;
        while (i > 0) {
            int j = 0;

            String result = String.valueOf(inputString.charAt(i - 1 - j));

            while (j <= quantity && (i - 1 - j) >= 0) {
                if (inputString.charAt(i - 1 - j) == inputString.charAt(i - j)) {
                    result += String.valueOf(inputString.charAt(i - 1 - j));
                    if (result.length() == quantity) {
                        return result;
                    }
                } else {
                    break;
                }
                j++;
            }

            i--;
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(getStringWithDoublicateChar2(new StringBuilder("tegppatta"), 2));
    }
}