public class prob1672 {
    public int maximumWealth(int[][] accounts) {
        int  maxAccounts= 0;
        for(int i = 0; i < accounts.length; i++)
        {
            int s = 0;
            for(int j = 0; j < accounts.length; j++){
                s += accounts[i][j];
            }
            maxAccounts = Math.max(s, maxAccounts);
        }
        return maxAccounts;

    }
}
