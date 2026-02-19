package day15;

import java.util.*;

public class Exam04 {
    static void main() {

        //3 Map 인터페이스 , 저장된 순서(인덱스) 없이 key와 value로 entry(한쌍) 저장하는 구조 
        //Map<KeyType , ValueType>
        Map<String,Integer> map1= new HashMap<>();
        //주요 메소드 .put(key , value) : 엔트리(key : value) 추가
        map1.put("유재석" , 95 ); map1.put("유재석" , 100); // Key는 중복불가능
        map1.put("강호동" , 95);//value 중복 가능
        System.out.println("map1 = " + map1);

        //2) .get(Key) : 특정한 key의 value를 반환
        System.out.println(map1.get("강호동"));

        //3) .size() : 총 엔트리 개수 반환
        System.out.println(map1.size());
        //4) .containsKey();
        boolean result1 = map1.containsKey("유재석");
        boolean result2 = map1.containsValue(95);
        System.out.println(result1);
        System.out.println(result2);
        //5) .remove();
        map1.remove("강호동");
        System.out.println(map1);
        //6) .claer() : 전체 엔트리 삭제
        //7) .isEmpty(); 엔트리가 하나도 없으면 true 있으면 false
        map1.isEmpty();
        //8) .entrySet(); 모든 엔트리를 집합(Set)으로 반환 , .keySet(); 모든 키를 집합으로 반환 .values(); 모든 값들을 컬렉션으로 반환
        Set<Map.Entry<String ,Integer>> set = map1.entrySet();
        Set<String> keys = map1.keySet();
        Collection<Integer> values = map1.values();

        //Map타입과 반복문 관계
        //1. 일반 for문
        //2, 향상된 for문
        for(String key : map1.keySet()){
            System.out.println(map1.get(key));
        }
        //3. forEach
        map1.keySet().forEach((key)-> {
            System.out.println(map1.get(key));
        });
        map1.values().forEach((value) -> {
            System.out.println(map1.get(value));
        });

        //활용처 : JSON/XML 호환용 , 비정형 데이터

        //MAP구현체
        Map<String , Object> map;
        map = new HashMap<>(); //싱글스레드
        map = new Hashtable<>(); // 멀티스레드
        map = new TreeMap<>(); // 이진트리 (정렬)
        Properties properties = new Properties(); //map구현체는 아니지만 MAP 구조 + 프로젝트 설정값 파일

    }
}//class e
