public class Binary {
    public static void main(String[] args) {
        // int[] arr = { -22, -12, -2, 0, 4, 6, 12, 32, 35, 44, 52, 62, 70 };
        int[] arr = { 123, 56, 50, 44, 32, 22, 12, 11, 10, 4, 3, 2 };
        int target = 44;
        int ans = binarySearch(arr, target);
        System.out.println(ans);


    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;

    }

}
