import java.util.Arrays;

class test {

  public static void main(String[] args) {
    System.out.println(nextGreaterElement(12));
  }

  static int nextGreaterElement(int n) {
    String str = Integer.toString(n);
    if (str.length() <= 1)
      return -1;
    int arr[] = new int[str.length()];
    for (int i = 0; i < str.length(); i++) {
      arr[i] = str.charAt(i) - '0';
    }
    swap(arr, str.length() - 1, str.length() - 2);
    int num = 0;
    int a = 1;
    for (int i = 0; i < arr.length; i++) {
      num += arr[i] * a;
      a *= 10;
    }

    if (num > n)
      return num;
    return -1;

  }

  static void swap(int arr[], int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

  }
}