import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEach {
	public static void main(String[] args) {

		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 13, 442));
		Consumer<Integer> action1 = System.out::println;
		numberList.forEach(action1);

		ArrayList<String> stringList = new ArrayList<>(Arrays.asList("A", "B", "C"));
		Consumer<String> action2 = System.out::println;
		stringList.forEach(action2);

		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		Consumer<Map.Entry<String, Integer>> action3 = System.out::println;
		map.entrySet().forEach(action3);
		map.keySet().forEach(action2);
		map.values().forEach(action1);

		Consumer<Map.Entry<String, Integer>> action4 = entry ->{
			System.out.println("Number "+ entry.getKey());
			System.out.println("Number "+ entry.getValue());
		};
		map.entrySet().forEach(action4);

	}
}
