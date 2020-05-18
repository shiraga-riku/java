package homework2;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {
	public static void main(String[] args) {
		//evensofメソッド
		var intList = List.of(1, 2, 3, 4, 5, 6, 7);

		List<Integer> evenList = ListUtil.evensof(intList);

		for (Integer e : evenList) {

			System.out.println(e);

		}
		//replicateメソッド
		System.out.println(replicate(5, "riku"));
		//zipメソッド
		System.out.println(ListUtil.zip(List.of(1, 5, 4), List.of(9, 7)));
		//factorsメソッド
		System.out.println(ListUtil.factors(15));
		//perfectsメソッド
		System.out.println(ListUtil.perfects(500));
		//pairsメソッド
		System.out.println(ListUtil.pairs(List.of("a", "b", "c")));
		//sortedメソッド
		System.out.println(ListUtil.sorted(List.of(1, 2, 3, 4, 5, 4)));
		//positionsメソッド
		System.out.println(ListUtil.positions(10, List.of(10, 15, 20, 10, 10, 33)));

	}

	public static List<Integer> evensof(List<Integer> intList) {

		List<Integer> evensList = new ArrayList<>();

		for (Integer e : intList) {

			if (e % 2 == 0) {

				evensList.add(e);

			}

		}

		return evensList;

	}

	public static List<String> replicate(int length, String value) {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			list.add(value);
		}
		return list;
	}

	public static List<Pair<Integer, Integer>> zip(List<Integer> first, List<Integer> second) {
		var min = Math.min(first.size(), second.size());
		List<Pair<Integer, Integer>> pairs = new ArrayList<>();
		for (int i = 0; i < min; i++) {
			pairs.add(new Pair<>(first.get(i), second.get(i)));
		}
		return pairs;
	}

	public static List<Integer> factors(int value) {
		List<Integer> factors = new ArrayList<>();
		for (int i = 1; i <= value; i++) {
			if (value % i == 0) {
				factors.add(i);
			}
		}
		return factors;
	}

	public static List<Integer> perfects(int value) {
		List<Integer> perfects = new ArrayList<>();
		for (int i = 1; i <= value; i++) {
			int sum = 0;
			List<Integer> factors = ListUtil.factors(i);
			for (Integer factor : factors) {
				sum += factor;
			}
			if (sum - i == i) {
				perfects.add(i);
			}
		}
		return perfects;
	}

	public static <T> List<Pair<T, T>> pairs(List<T> list) {
		List<Pair<T, T>> pairs = new ArrayList<>();
		for (int i = 0; i < list.size() - 1; i++) {
			Pair<T, T> pair = new Pair<>(list.get(i), list.get(i + 1));
			pairs.add(pair);
		}
		return pairs;
	}

	public static boolean sorted(List<Integer> list) {
		var pairs = ListUtil.pairs(list);
		for (var pair : pairs) {
			if (pair.getFirst() > pair.getSecond()) {
				return false;
			}
		}
		return true;
	}

	public static List<Integer> positions(int index, List<Integer> list) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {

			indexes.add(i);

		}

		var positions = new ArrayList<Integer>();

		var pairs = zip(indexes, list);

		for (var pair : pairs) {

			if (pair.getSecond() == index) {

				positions.add(pair.getFirst());

			}

		}

		return positions;
	}
}
