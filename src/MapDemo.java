import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("titan", "Nico");
        map.put("main babe", "Jenny");
        map.put("2nd babe", "Miriam");

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(map.get(key));
        }
    }
}
