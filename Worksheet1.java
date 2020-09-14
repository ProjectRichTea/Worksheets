public class Worksheet1 {
    public static void main(String[] args) {

        int[] integerArray1 = {1,3,5,7,9,11,13,15,17,19};
        int[] integerArray2 = {20,30,40,50,60};

        outputArrayValues(integerArray1);
        outputArrayValues(integerArray2);
    }

    public static void outputArrayValues(int[] arrayParameter) {

        int counter = 0;

        do {
            System.out.print(arrayParameter[counter] + ", ");
            counter++;
        }
        while (counter < arrayParameter.length);
    }
}
