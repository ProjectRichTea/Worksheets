public class Worksheet2 {
    public static void main(final String[] args) {

        final int[] integerSort = {8,4,9,6,7,5,1,3,10,2};
        int counter = 0;
        int sortCounterAsc = 0;
        int sortCounterDec = 0;

        System.out.print("UNSORTED = ");
        do {
            System.out.print(integerSort[counter] + ", ");
            counter++;
        }
        while (counter < integerSort.length);

        bubbleSortAsc(integerSort);
        System.out.print("Asc SORTED = ");
        do {
            System.out.print(integerSort[sortCounterAsc] + ", ");
            sortCounterAsc++;
        }
        while (sortCounterAsc < integerSort.length);

        bubbleSortDec(integerSort);
        System.out.print("Dec SORTED = ");
        do {
            System.out.print(integerSort[sortCounterDec] + ", ");
            sortCounterDec++;
        }
        while (sortCounterDec < integerSort.length);
    }

    public static void bubbleSortAsc(final int[] arrayParameter) {

        boolean finished = false;
        int storage;
        
        while (!finished) {
            finished = true;
            for (int sortNum = 0; sortNum < arrayParameter.length - 1; sortNum++) {
                if (arrayParameter[sortNum] > arrayParameter[sortNum + 1]) {
                    storage = arrayParameter[sortNum];
                    arrayParameter[sortNum] = arrayParameter[sortNum + 1];
                    arrayParameter[sortNum + 1] = storage;
                    finished = false;
                }
            }
        }
    }

    public static void bubbleSortDec(final int[] arrayParameter) {

        boolean finished = false;
        int storage;
        
        while (!finished) {
            finished = true;
            for (int sortNum = 0; sortNum < arrayParameter.length - 1; sortNum++) {
                if (arrayParameter[sortNum] < arrayParameter[sortNum + 1]) {
                    storage = arrayParameter[sortNum];
                    arrayParameter[sortNum] = arrayParameter[sortNum + 1];
                    arrayParameter[sortNum + 1] = storage;
                    finished = false;
                }
            }
        }
    }
}