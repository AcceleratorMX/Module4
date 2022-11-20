package h10;

public class ArlanHelper {

    public String drawQuad(int n) {

        int i = 0;
        while (i < n) {
            int k = 0;
            while (k < n) {
                System.out.print("*");
                k++;
            }
            System.out.println();
            i++;
        }
        return "";
    }
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(2));
    }
}
