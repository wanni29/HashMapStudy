import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapStudy5 {
    public static void main(String[] args) {
        String text = "Java is a versatile and popular programming language" +
                "It is widely used for various applications.";

        // 단어 빈도 계산
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase().replaceAll("[.,]","");
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // 비녿에 따른 정렬
        List<Map.Entry<String, Integer>> sotedEntries = new ArrayList<>(wordFrequency.entrySet());
        Collections.sort(sotedEntries, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // 결과 출력
        System.out.println("단어 빈도 : ");
        for (Map.Entry<String,Integer> entry : sotedEntries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
