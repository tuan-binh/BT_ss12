package bt05;

import java.util.HashMap;
import java.util.Map;

public class CopyHashMap {
    public static void main(String[] args) {
        Map<Integer, String> oldList = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            oldList.put(i + 1, "index: " + i);
        }
        System.out.println("Mảng cũ: " + oldList);

        Map<Integer, String> newList = new HashMap<>();
        newList.putAll(oldList);
        System.out.println("Mảng sao chép: " + newList);

    }
}
