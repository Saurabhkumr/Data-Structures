public class kadane {

  public static int maxFrontFaceSum(int[] cards) {
    int maxSum = Integer.MIN_VALUE;
    int currentSum = 0;
    int totalSum = 0;

    // Kadane's algorithm to find maximum sum of non-flipped subarray
    for (int card : cards) {
      currentSum = Math.max(card, currentSum + card);
      maxSum = Math.max(maxSum, currentSum);
      totalSum += card;
    }

    int maxFlippedSum = Integer.MIN_VALUE;
    currentSum = 0;

    // Forward pass to find maximum flipped sum
    for (int card : cards) {
      currentSum += card;
      maxFlippedSum = Math.max(maxFlippedSum, currentSum);
      if (currentSum < 0) {
        currentSum = 0;
      }
    }

    currentSum = 0;

    // Backward pass to find maximum flipped sum
    for (int i = cards.length - 1; i >= 0; i--) {
      currentSum += cards[i];
      maxFlippedSum = Math.max(maxFlippedSum, currentSum);
      if (currentSum < 0) {
        currentSum = 0;
      }
    }

    return Math.max(maxSum, totalSum + maxFlippedSum);
  }

  public static void main(String[] args) {
    int[] cards = { -2, 3, -1, -4, -2 };
    System.out.println(maxFrontFaceSum(cards)); // Output: 8
  }

}
