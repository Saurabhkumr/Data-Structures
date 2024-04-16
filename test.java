import java.util.Arrays;

public class test {
  public static void main(String[] args) {

    int[] arr = { 7, 4, 5, 2, 6, 1, 3 };
    sort(arr, 0, arr.length);
    System.out.println(Arrays.toString(arr));

  }

  static void sort(int[] arr, int s, int e) {

    if (e - s == 1) {
      return;
    }

    int mid = (s + e) / 2;

    sort(arr, 0, mid);
    sort(arr, mid, e);
    merge(arr, s, e, mid);

  }

  static void merge(int[] arr, int s, int e, int m) {

    int i = s;
    int j = m;
    int k = 0;
    int[] mix = new int[e - s];

    while (i < m && j < e) {
      if (arr[i] < arr[j]) {
        mix[k] = arr[i];
        i++;
      } else {
        mix[k] = arr[j];
        j++;
      }
      k++;
    }

    while (i < m) {
      mix[k] = arr[i];
      i++;
      k++;
    }
    while (j < e) {
      mix[k] = arr[j];
      j++;
      k++;
    }

    for (int l = 0; l < mix.length; l++) {
      arr[s + l] = mix[l];
    }

  }
}
