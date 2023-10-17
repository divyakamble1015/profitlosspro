import java.util.*;

public class profitloss {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float cp, sp, loss, profit;
        System.out.println("Enter cost price:");
        cp = sc.nextInt();
        System.out.println("Enter selling price:");
        sp = sc.nextInt();

        if (cp < sp) {
            loss = sp - cp;
            System.out.println("loss" + loss);
            float perloss = (loss / cp) * 100;
            System.out.println("Profit percentage:" + perloss);
        } else {
            profit = sp - cp;
            System.out.println("profit" + profit);
            float peeprofit = (profit / cp) * 100;
            System.out.println("Profit percentage:" + peeprofit);
        }

    }

}
