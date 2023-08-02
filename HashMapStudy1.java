import java.util.HashMap;

public class HashMapStudy1 {

    public static void main(String[] args) {

        HashMap<String, Integer> stringLengthMap = new HashMap<>();

        stringLengthMap.put("apple", 5);
        stringLengthMap.put("banana", 6);
        stringLengthMap.put("orange", 6);
        stringLengthMap.put("grape", 5);

        int lengthOfApple = stringLengthMap.get("apple");
        System.out.println("Length of apple : " + lengthOfApple);

        boolean containsBanana = stringLengthMap.containsKey("banana");
        System.out.println("contains banana : " + containsBanana);

        stringLengthMap.put("banana", 7);
        int lengthOfBanana = stringLengthMap.get("banana");
        System.out.println("length of banana : " + lengthOfBanana);

        for (String key : stringLengthMap.keySet()) {
            int value = stringLengthMap.get(key);
            System.out.println("key : " + key + " ,value : " + value);
        }

        stringLengthMap.remove("orange");
        System.out.println("After removing orange : " + stringLengthMap);
    }

}
