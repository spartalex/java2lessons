package lesson3.hw2;

public class ArrayUtils {
    public static int arraySum(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        if (strings.length != 4) {
            throw new MyArraySizeException(strings.length);
        }

        for (String[] arr : strings) {
            if (arr.length != 4) {
                throw new MyArraySizeException(arr.length);
            }
        }

        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        //String[][] strings = {
        //        {"1", "2", "5", "7"},
        //        {"1", "2", "5", "7", "7"},
        //        {"1", "2", "5", "7"},
        //        {"1", "2", "5", "7", "7", "7"}
        //};
//
        //System.out.println(arraySum(strings));

        //String[][] strings2 = {
        //        {"1", "2", "5", "7"},
        //        {"1", "2", "5", "7"},
        //        {"1", "2", "t", "7"},
        //        {"1", "2", "5", "7"}
        //};
//
        //System.out.println(arraySum(strings2));

        String[][] strings2 = {
                {"1", "2", "5", "7"},
                {"1", "2", "5", "7"},
                {"1", "2", "3", "7"},
                {"1", "2", "5", "7"}
        };

        System.out.println(arraySum(strings2));
    }
}
