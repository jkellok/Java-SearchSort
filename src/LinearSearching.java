public class LinearSearching {

    private int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    public boolean findNumber(int input) {
        int x = input;
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                return found = true;
        }
        return found;
    }

}
