import java.util.Random;

public class QuickSort {

    // quick sort
    // partitioning list around one element, then sorting each partition
    // choose one element to be partition element
    // organize elements so all elements less than partition element are to left
    // and all greater are to the right
    // apply algorithm recursively to both partitions

    Random r = new Random();

    public QuickSort() {
        // create array
        int[] array = new int[10];
        System.out.println("Data set before quick sorting:");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(-100, 101);
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
        quickSort(array);
    }

    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length -1);
        System.out.println("Data set after quick sorting:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void quickSort(int[] arr, int min, int max) {
        if (min < max) {
            // create partition
            int indexOfPartition = partition(arr, min, max);
            // sort left one
            quickSort(arr, min, indexOfPartition -1);
            // sort right one
            quickSort(arr, indexOfPartition + 1, max);
        }
    }

    private int partition(int[] arr, int min, int max) {
        int partitionElement;
        int left, right;
        int middle = (min + max) / 2;

        // middle value as partition element
        partitionElement = arr[middle];
        // move it out of the way
        swap(arr, middle, min);

        left = min;
        right = max;

        while (left < right) {
            // search for element that is greater than partition element
            while (left < right && arr[left] <= partitionElement)
                left++;
            // search for element that is less than partition element
            while (arr[right] > partitionElement)
                right--;
            // swap elements
            if (left < right)
                swap(arr, left, right);
        }

        // move partition element back
        swap(arr, min, right);

        return right;
    }

    void swap(int[] arr, int i1, int i2) {
        // swap elements in array
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
