# HashMap 기본 개념 :)

- 기본 구조
- String, Integer 쪽에는 클래스도 들어갈수있다.
```java
 HashMap<String, Integer> stringLengthMap = new HashMap<>();
```

- 기본 기능
```java

        // 키값을 이용해서 불러오기
        int lengthOfApple = stringLengthMap.get("apple");
        System.out.println("Length of apple : " + lengthOfApple);

        // 값이 포함되어있는지 확인해보기 (키값)
        boolean containsBanana = stringLengthMap.containsKey("banana");
        System.out.println("contains banana : " + containsBanana);


        stringLengthMap.put("banana", 7);
        int lengthOfBanana = stringLengthMap.get("banana");
        System.out.println("length of banana : " + lengthOfBanana);

        // 키값출력 + 밸류값 출력
        for (String key : stringLengthMap.keySet()) {
            int value = stringLengthMap.get(key);
            System.out.println("key : " + key + " ,value : " + value);
        }

        // 값 제거
        stringLengthMap.remove("orange");
        System.out.println("After removing orange : " + stringLengthMap);
```
