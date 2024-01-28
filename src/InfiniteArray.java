public class InfiniteArray {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 7, 9, 11, 13, 15, 16, 19, 20, 24, 26, 31, 50 };
        int target = 26;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newstar = end + 1;
            end = end + (end - start + 1) * 2;
            start = newstar;
        }

        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;

    }

}
