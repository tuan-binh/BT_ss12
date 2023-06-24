package bt04;

import java.util.*;

public class SortHashMap {
    public static void main(String[] args) {
        Map<Integer, String> list = new HashMap<>();

        list.put(1, "Xin chào");
        list.put(5, "hello");
        list.put(2, "Tạm biệt");
        list.put(4, "goodbye");
        list.put(3, "ngủ ngon");
        System.out.println("Trước sort: " + list);
        Map<Integer, String> treeMap = new TreeMap<>(list);
        System.out.println("Sau sort: " + treeMap);
    }
}
