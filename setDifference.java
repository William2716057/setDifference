import java.util.HashSet;
import java.util.Set;

public class setDifference {
	public static <T> Set<T> difference(Set<T> setA, Set<T> setB) {
		Set<T> result = new HashSet<>(setA);
		result.removeAll(setB);
		return result;
	}

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>();
		setA.add(1);
		setA.add(2);
		setA.add(3);

		Set<Integer> setB = new HashSet<>();
		setB.add(3);
		setB.add(4);
		setB.add(5);

		Set<Integer> differenceSet = difference(setA, setB);
		System.out.println("Difference between set A and set B: " + differenceSet);
	}
}
