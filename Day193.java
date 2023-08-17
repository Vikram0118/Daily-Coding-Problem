class Day193 {
    public static void main(String[] args) {
        // Given a array of numbers representing the stock prices of a company in chronological order, write a function that calculates the maximum profit you could have made from buying and selling that stock. You're also given a number fee that represents a transaction fee for each buy and sell transaction.

        // You must buy before you can sell the stock, but you can make as many transactions as you like.

        // For example, given [1, 3, 2, 8, 4, 10] and fee = 2, you should return 9, since you could buy the stock at 1 dollar, and sell at 8 dollars, and then buy it at 4 dollars and sell it at 10 dollars. Since we did two transactions, there is a 4 dollar fee, so we have 7 + 6 = 13 profit minus 4 dollars of fees.

        int[] arr = {1, 3, 2, 8, 4, 10};

        System.out.println(MySolution(arr, 2));
        System.out.println(calcMaxProfit(arr, 0, 2));

    }


    public static int MySolution(int[] arr, int fee) {
        int ans =0, hold = arr[0];

        for(int i=0; i<arr.length; i++) {
            ans = Math.max(ans, arr[i] - hold - fee);
            hold = Math.min(hold, arr[i] - ans);
        }

        System.out.println(hold);
        return ans;
    }

    // using recursion.
    private static int calcMaxProfit(int[] prices, int lo, int fee) {
        if (lo >= prices.length - 1)
            return 0;

        int i = lo + 1;
        int maxProfit = 0;

        for (; i < prices.length; i++) {    // syntax
            int curProfit = prices[i] - prices[lo] - fee;

            if (curProfit > 0) {
                int curMaxProfit = calcMaxProfit(prices, i + 1, fee);
                maxProfit = Math.max(maxProfit, curProfit + curMaxProfit);
            }
        }

        return maxProfit;
    }
}