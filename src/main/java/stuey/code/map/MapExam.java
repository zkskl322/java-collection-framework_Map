package stuey.code.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        // 입력
        map.put("one", 1);
        map.put("two", 2);
        map.put("two", 22);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        System.out.println("map의 사이즈 : " + map.size());

        map.remove("five");
        System.out.println("map의 사이즈 : " + map.size());

        System.out.println("map has value 1 : " + map.containsValue(1));
        System.out.println("map has value 2 : " + map.containsValue(2));

        // 출력형태
        // key를 이용한 출력
        Set<String> keySet = map.keySet();

        for(String key : keySet) {
            System.out.println("Key : " + key + ", value : " + map.get(key));
        }

        System.out.println("============================");
        // Etnry를 이용한 출력
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for(Map.Entry<String, Integer> en : entrySet) {
            System.out.println("Key : " + en.getKey() + ", value : " + en.getValue());
        }
    }
}