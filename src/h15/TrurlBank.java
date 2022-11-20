package h15;

public class TrurlBank {

    public int sumQuads(int n){
        int a = 1;
        int sum = 0;
        while (a < n) {
            sum = n * (n + 1) * (2 * n + 1) / 6;
            a++;
        }
        return sum;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));
    }
}
