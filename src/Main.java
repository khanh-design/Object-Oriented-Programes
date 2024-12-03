import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "HaiTT");
        map.put(0, "Nguyen");
        map.put(2, "Minh");
        map.put(4, "Tai");
        map.put(1, "Hai");
//        Set<Integer> set = map.keySet();
//        for (Integer i: set) {
//            System.out.println(map.get(i));
//        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}