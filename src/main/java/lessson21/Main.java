package lessson21;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("NY221SA", "Део ланос");
        hashMap.put("NY221SA", "Део ланос");

        hashMap.put("NY241SA", "Део матіс");
        hashMap.put("NY231SA", "Део гавнео");

        System.out.println(hashMap);

        System.out.println(hashMap.get("NY241SA"));
        System.out.println(hashMap.containsKey("NY231SA"));

        HashMap<String, Integer> debtMap = new HashMap<>();
        debtMap.put("Микита", 1);
        debtMap.put("Віталік", 100);
        debtMap.put("Віталіна", 10);
        debtMap.put("Віта", 10);

        String newDobt = "Генадій";
        if (debtMap.containsKey(newDobt)) {
            debtMap.put(newDobt, debtMap.get(newDobt) + 10);
        } else {
            debtMap.put(newDobt, 10);
        }

        System.out.println(debtMap);
//        HashSet <String> hashSet = new HashSet<>();
//        hashSet.add("ass");
//        hashSet.add("ass");
//        System.out.println(hashSet);
    }
}
