package tutorials.tutorials05_functions;

/**
 * this class demos the use of func
 * specifically, we called a func repeatedly until a certain condition is met
 */

public class Investment {
    public static void main(String[] args) {
        System.out.println(invest(81,5));
    }

    public static int invest(int fund, int limitOfTimesStockInvestment) {
        int remaning = investInStockContinuously(fund, limitOfTimesStockInvestment);
        remaning = gambling(remaning);
        remaning = grocery(remaning);
        remaning = gift(remaning);
        return remaning;
    }

    /**
     * here in this func, we try to call the "stock" method/ method "stock" repeatedly until we lose money
     * that is, we keep calling it repeatedly as long as we gain money. we stop calling it as soon as we lose money
     * @param fund
     * @param limit
     * @return
     */
    public static int investInStockContinuously(int fund, int limit) {
        int beforeInvesting = fund;
        int afterInvesting = stock(fund);
        int count = 0;
        //we use while loop to check if we gain or lose money
        while (afterInvesting > beforeInvesting && count < limit){
            beforeInvesting = afterInvesting;
            afterInvesting = stock(beforeInvesting);
            count++;
        }
        return afterInvesting;
    }
    /**
     * If x is even then return double the initial value. Else lose it all.
     */
    public static int stock(int fund) {
        if (fund%3 == 0) {
            return fund+3;
        } else {
            return (int)(fund/3);
        }

    }


    /**
     * Gambling and then losing half of the initial value.
     */
    public static int gambling(int x) {
        return x/2;
    }

    /**
     * If the initial value is greater than $10 then spend $10 on grocery shopping. Else don't spend any.
     */

    public static int grocery(int x) {
        if (x>=10) {
            return x-10;
        } else {
            return x;
        }
    }

    /**
     * Giving a gift with $2.
     */
    public static int gift(int x) {
        if (x<2){
            return x;
        } else {
            return x-2;
        }
    }

}
