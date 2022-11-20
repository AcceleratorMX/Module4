package h9;

public class CheapStocks{
    public String getCheapStocks(String[] stocks){
        int count = 0;
        for (int i=0; i<stocks.length; i++){
            String[] parts = stocks[i].split(" ");
            if (Integer.parseInt(parts[1])<200)
                count++;
        }
        if (count==0){
            return "";
        }
        else{
            String str = "";
            for (int i=0; i<stocks.length; i++){
                String[] parts = stocks[i].split(" ");
                if (Integer.parseInt(parts[1])<200)
                    str+= parts[0]+" ";
            }
            return str;
        }
    }
}