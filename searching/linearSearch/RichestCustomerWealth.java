package searching.linearSearch;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,211},{3,2,1},{12,2,134}};
        System.out.println(richestCustWealth(accounts));
    }

    private static int richestCustWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for(int[] account :accounts){
            int wealth = 0;
            for(int amount : account){
                wealth += amount;
            }
            if (maxWealth<wealth)
                maxWealth = wealth;
        }
        return maxWealth;
    }
}
