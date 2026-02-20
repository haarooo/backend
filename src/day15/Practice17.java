package day15;

import java.util.*;

public class Practice17 {
    static void main() {

        //문제1
        Box<String> box1 = new Box<>();
        box1.content = "안녕하세요";
        System.out.println(box1.content);

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
        System.out.println(box2.content);

        //문제2
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("강호동");
        list.add("서장훈");
        list.add("신동엽");
        list.add("유재석");
        System.out.println(list.contains("서장훈"));
        System.out.println(list.indexOf("서장훈"));
        list.remove("서장훈");
        System.out.println(list);

        //문제3
        Set<Integer> lottoSet = new HashSet<>();
        int[] draw = {1, 3, 3, 7, 9, 9, 2, 10, 10, 8, 4, 4, 6, 6, 5};
        for (int draw2 : draw) {
            lottoSet.add(draw2);
        }
        System.out.println(lottoSet);
        System.out.println(lottoSet.size());
        System.out.println(lottoSet.contains(7));

        //문제4
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int draw3 : draw) {
            treeSet.add(draw3);
        }//treeSet.addAll(lottoSet); .addAll로 다른 집합의 요소들을 집어넣을 수 있음
        System.out.println(treeSet.descendingSet());

        //문제5
        Map<String, Integer> map = new HashMap<>();
        map.put("유재석", 95);
        map.put("강호동", 100);
        map.put("신동엽", 78);
        map.put("유재석", 67);
        map.put("서장훈", 100);
        System.out.println(map.get("유재석"));
        System.out.println(map.size());
        map.remove("유재석");
        System.out.println(map);

        //문제6
        System.out.println(map.containsKey("강호동"));
        System.out.println(map.containsValue(65));
        map.keySet().forEach((key) -> System.out.println(key + ":" + map.get(key)));

        //문제7
        String json = "{\"name\":\"유재석\",\"age\":45,\"city\":\"서울\"}";
        json = json.replace("{", "");
        json = json.replace("}", "");
        Map<String, String> map2 = new HashMap<>();
        String[] jsons = json.split(",");
        for (int index = 0; index <= jsons.length - 1; index++) {
            String[] jsons2 = jsons[index].split(":");
            for (int index2 = 0; index2 <= jsons2.length - 1; index2++) {
                if (index2 == 0) {
                    map2.put(jsons2[0].replace("\"", ""), jsons2[1].replace("\"", ""));

                }
            }
        }map2.keySet().forEach((key) -> System.out.println(key+":"+map2.get(key)));

        //문제8
        ArrayList<Map<String,Object>> stockList = new ArrayList<>();

        Map< String , Object> map1 = new HashMap<>();
        map1.put( "name" , "삼성전자");     map1.put( "price" , "72000");   map1.put( "volume" , "1500000");
        stockList.add( map1 );
        Map< String , Object > map3 = new HashMap<>();
        map3.put( "name" , "카카오");     map2.put( "price" , "52000");   map2.put( "volume" , "800000");
        stockList.add( map3 );
        Map< String , Object > map4 = new HashMap<>();
        map4.put( "name" , "네이버");     map3.put( "price" , "210000");   map3.put( "volume" , "300000");
        stockList.add( map4 );
        System.out.println("stockList = " + stockList);
        stockList.forEach( ( stock ) -> {
            System.out.printf( "종목명 : %s / 가격 : %s / 거래량 : %s \n" ,
                    stock.get("name") , stock.get("price") , stock.get("volume"));
        } );





    }
}
class Box<T>{public T content;}