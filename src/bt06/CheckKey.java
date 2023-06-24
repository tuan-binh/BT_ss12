package bt06;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckKey {
    public static void main(String[] args) {
        Map<Integer, Integer> list = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            list.put(i + 1, (int) Math.ceil(Math.random() * 10));
        }

        System.out.print("Nhập vào key bạn muốn tìm: ");
        int key = new Scanner(System.in).nextInt();
        boolean check = list.containsKey(key);
        if (check) {
            System.out.println("Có tồn tại");
        } else {
            System.out.println("Không tồn tại");
        }
    }
}
