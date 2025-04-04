/**
 * Creating a triangular array
 */

 public class LotteryArray {
     public static void main(String[] args) {
         final int NMAX = 10;
         
         // allocate array
         int[][] odds = new int[NMAX + 1][];
         for (int n = 0; n <= NMAX; n++)
            odds[n] = new int[n + 1];

        // fill array
        for (int n = 0; n < odds.length; n++)
            for (int k = 0; k < odds[n].length; k++) {
                // compute binominial coeficient
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++)
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                odds[n][k] = lotteryOdds;
            }
        // print array
        for (int[] row : odds) {
            for (int odd : row)
                System.out.printf("%4d", odd);
            System.out.println();
        }
     }
 }