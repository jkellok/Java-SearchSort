public class BinarySearching {

    private int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private boolean found = false;

    public boolean findNumber(int input) {
        int x = input;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left)/2; // or int middle = (low + high)/2
            // if x is at middle
            if (array[middle] == x)
                return found = true;
            // if x is greater than middle, ignore left half
            if (array[middle] < x)
                left = middle + 1;
            // if x is less than middle, ignore right half
            else
                right = middle - 1;
        }
        return found;
    }

}
