class SleepSort {
  public static void main(String[] args) {
    int[] arr = { 34, 23, 122, 9, 99, 10000, 32, 1 };

    sleepSort(arr);
  }

  public static void sleepSort(int[] arr) {
    Thread[] threads = new Thread[arr.length];

    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];
      threads[i] = new Thread(() -> {
        try {
          Thread.sleep(num);
          System.out.println(num);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      });

      threads[i].start();
    }

    for (Thread thread : threads) {
      try {
        thread.join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
