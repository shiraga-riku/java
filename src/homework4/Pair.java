package homework4;

public class Pair<F, S> {
	private final F first;
	private final S second;

	public Pair(F first, S second) {
		this.first = first;
		this.second = second;
	}

	public F first() {
		return this.first;
	}

	public S second() {
		return this.second;
	}

}
