import java.util.Random;

public class SelectionSort {

    // selection sort
    // find smallest value in the list
    // switch with value in first position
    // find next smallest value
    // switch with value in second position
    // repeat until all in proper place

    Random r = new Random();

    public SelectionSort() {
        // create array
        int[] array = new int[10];
        System.out.println("Data set before selection sorting:");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 101);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        sortArray(array);
    }

    public void sortArray(int[] arr) {
        int min;
        int[] sortedArray = arr;

        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int scan = i+1; scan < arr.length; scan++)
                if (arr[scan] < (arr[min]))
                    min = scan;

            swap(arr, min, i);
        }

        System.out.println("Data set after selection sorting:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }

    void swap(int[] arr, int i1, int i2) {
        // swap elements in array
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
