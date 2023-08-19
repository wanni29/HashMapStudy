# HashMap 개념

- 키와 값으로 이루어짐
- 빠른 검색 및 조회가 가능
- 유연한 크기 조정
- 순서 보장 안함!
- 중복 허용 안됨!

# 활용 메소드 모음

- put(key, value) : 주어진 키와 값을 맵에 추가

- get(key) : 주어진 키에 해당하는 값을 가져옴

- containsKey(key) : 특정 키가 맵에 있는지 확인

- containValue(value) : 특정 값이 맵에 있는지 확인

- remove(key) : 주어진 키에 해당하는 항목을 맵에서 제거

- keySet() : 맵에 있는 모든 키를 세트 형태로 변환

- entrySet() : 맵에 있는 모든 키 값을 쌍으롤 엔트리 형태로 변환

- size() : 크기를 의미

- replace(key, newValue) : 주어진 키에 해당하는 값의 값을 새로운 값으로 대체

- replaceAll(function) : 모든 키 - 값 쌍에 대해 특정 함수를 적용하여 값을 갱신

- compute(key, remappingFunction) : 주어진 키에 대해 특정함수를 적용하여 갱신하거나 새로 계산