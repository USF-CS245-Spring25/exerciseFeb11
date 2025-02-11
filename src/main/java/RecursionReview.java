public class RecursionReview {

    /** Compute the factorial of n recursively
     *
     * @param n integer
     * @return factorial of
     */
    public static int factorial(int n) {
        // FILL IN CODE:
        return 1; // change
    }

    /**
     * Recursively compute the sum of elements in the array from the given startIndex
     * @param arr array of integers
     * @param startIndex the index in the array
     * @return sum of elements at indices from startIndex to arr.length - 1
     */
    public static int sum(int[] arr, int startIndex) {
        if (startIndex == arr.length) {
            return 0;
        }
        else {
            // FILL IN CODE
            return 0; // change
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // 120
        int[] a = {3, 5, 10, 2};
        System.out.println(sum(a, 0)); // 20
    }
}
