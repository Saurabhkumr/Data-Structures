package nagarro;

public class q2 {
  public static void main(String[] args) {

    int arr[] = { -1, 2, 3, 4, -5 };

    System.out.println(maxSum(arr));
  }

  static int maxSum(int arr[]) {
    int sum = 0;
    for (int i : arr) {
      sum += i;
    }
    int min = arr[0];
    int s = 0;
    for (int i = 0; i < arr.length; i++) {
      s += arr[i];
      min = Math.min(s, min);
      if (s > 0)
        s = 0;
    }

    return sum + (min * (-2));
  }
}
