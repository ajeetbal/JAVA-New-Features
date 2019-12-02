import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
		Stream<Integer> stream2 = Stream.of(new Integer[] { 1, 2, 3 });

		Consumer<Integer> action = System.out::println;
		stream1.forEach(action);
		stream2.forEach(action);

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		Stream<Integer> listStream = list.stream();
		listStream.forEach(action);

		Stream<Date> stream = Stream.generate(() -> {
			return new Date();
		}).limit(4);
		Consumer<Date> action2 = System.out::println;
		stream.forEach(action2);

		Stream<String> stream3 = Stream.of("A$B$C".split("\\$"));
		stream3.forEach(p -> System.out.println(p));

		ArrayList<Integer> newList=new ArrayList<Integer>();
		
	}

}
