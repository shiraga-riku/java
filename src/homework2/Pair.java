package homework2;

public class Pair<F, S> {

	private final F first;

	private final S second;

	public Pair(F first, S second) {

		this.first = first;

		this.second = second;

	}

	public F getFirst() {

		return this.first;

	}

	public S getSecond() {

		return this.second;

	}

	@Override

	public String toString() {

		return "(" + this.getFirst() + "," + this.getSecond() + ")";

	}

}