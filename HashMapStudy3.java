import java.util.HashMap;
import java.util.Map;

public class HashMapStudy3 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();

        // 학생 성적 추가
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 78);
        studentScores.put("David", 92);
        studentScores.put("Eve", 88);

        // 성적 업데이트
        studentScores.replace("Bob", 90);

        System.out.println("=================================================");

        // 검색 및 출력
        System.out.println("Alice's score : " + studentScores.get("Alice"));
        System.out.println("David's score : " + studentScores.get("David"));

        System.out.println("=================================================");

        // 특정 성적 범위에 해당하는 학생 검색
        System.out.println("students with scores between 85 and 90 : ");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            if (entry.getValue() >= 85 && entry.getValue() <= 90) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }

        System.out.println("=================================================");

        // 학생 삭제
        studentScores.remove("Charlie");

        // 모든 학생과 성적 출력
        // entry -> 키값을 도출해 내기 위한 도구
        System.out.println("All students and their scores : ");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("=================================================");

    }

}
