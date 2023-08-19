import java.util.HashMap;
import java.util.Map;

public class HashMapStudy4 {

    public static void main(String[] args) {
        
         HashMap<String, Double> cart = new HashMap<>();

        cart.put("Apple", 1.0);
        cart.put("Banana", 0.5);
        cart.put("Orange", 0.8);
        cart.put("Apple", 1.2);
        cart.put("orange", 0.9);

        cart.compute("Apple", (product, oldPrice) -> oldPrice * 3);

        cart.replaceAll((product, oldPrice) -> oldPrice * 0.9);

        double total = 0.0;

        for(Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            total += entry.getValue();
        }

        System.out.println("Total price : " + total);
    }
    
}
