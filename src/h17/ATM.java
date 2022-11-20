package h17;

class ATM {
    public int countBanknotes(int sum) {
        int[] money = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        int banknotes = 0;
        while (i<9) {
            banknotes = banknotes + sum/money[i];
            sum %= money[i];
            i++;
        }
        return banknotes;
    }
}