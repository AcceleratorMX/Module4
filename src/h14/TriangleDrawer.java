package h14;

public class TriangleDrawer {
    public String drawTriangle(int side) {
        String result = "*";
        while (side > 0){
            System.out.println(result.repeat(side));
            side--;
        }
        return "";
    }
}

