package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> list, Map<String, String> map) {
        List<Map<String, String>> newList = new ArrayList<>();
        for (var row : list) {
            boolean isExist = true;
            for (Map.Entry<String, String> oneMap : map.entrySet()) {
                var key = oneMap.getKey();
                var value = oneMap.getValue();
                if (!row.get(key).equals(value)) {
                    isExist = false;
                }
            }
            if (isExist) {
                System.out.println(row);
                newList.add(row);
            }
        }

        return newList;
    }
}
//END
