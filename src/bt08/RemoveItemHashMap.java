package bt08;

import java.util.HashMap;
import java.util.Map;

public class RemoveItemHashMap {
   public static void main(String[] args) {
      Map<String, String> Dictionary = new HashMap<>();
      Dictionary.put("John", "0987654321");
      Dictionary.put("Lili", "0123289012");
      Dictionary.put("nanaBeo", "0981347123");
      Dictionary.put("Spring", "0837129312");
      
      System.out.println("Trước khi xóa" + Dictionary);
      Dictionary.remove("Lili");
      System.out.println("Sau khi xóa: " + Dictionary);
   }
}
