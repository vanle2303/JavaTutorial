package tutorials.tutorials16_map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BankBalance {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();

        //put new elements into the hashmap
        hashMap.put("Van", 123.0);
        hashMap.put("Long", 456.12);
        hashMap.put("Le", 678.90);

        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        for (Map.Entry<String, Double> element : set) {
            System.out.print(element.getKey() + "  ");
            System.out.println(element.getValue());
        }

        //Deposit 1000 into Van's account
        double balance = hashMap.get("Van");
        hashMap.put("Van", balance+1000);
        System.out.println("Van's new balance: " + hashMap.get("Van"));
    }
}
