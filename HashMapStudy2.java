import java.util.ArrayList;
import java.util.HashMap;

public class HashMapStudy2 {

    public static void main(String[] args) {

        String text = "apple orange apple banana apple orange";
        String[] words = text.split(" ");

        HashMap<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("단어 빈도수 : ");
        for (String word : wordFrequencyMap.keySet()) {
            System.out.println(word + " : " + wordFrequencyMap.get(word));
        }

        System.out.println("=============================================================");

        HashMap<String, String> userDataMap = new HashMap<>();

        // 사용자 데이터 추가
        userDataMap.put("wanni30", "wanni30@wakanda.com");
        userDataMap.put("wanno29", "wanno29@wakanda.com");

        // 특정 사용자 정보 조회
        String username = "wanni30";
        String userinfo = userDataMap.get(username);
        System.out.println("사용자 정보 : " + userinfo);

        System.out.println("=============================================================");

        HashMap<Integer, ArrayList<String>> postCommentsMap = new HashMap<>();

        // 게시물에 댓글 추가
        int postId = 1;
        ArrayList<String> comments = new ArrayList<>();
        comments.add("Great post!");
        comments.add("Thanks for sharing");
        postCommentsMap.put(postId, comments);

        // 특정 게시물의 댓글 조회
        int targetPostId = 1;
        ArrayList<String> commentsForPost = postCommentsMap.get(targetPostId);
        System.out.println("게시물" + targetPostId + " 에 달린 댓글 : " + commentsForPost);

    }

}
