public class TestT�� {
	public static void main(String[] args) {
		T��J�rjekord j�rjekord = new T��J�rjekord();
		T��line[] t��tajad = new T��line[4];
		for (int i = 0; i < t��tajad.length; i++) {
			t��tajad[i] = new T��line(j�rjekord);
		}
		for (int i = 0; i < 100; i++) {
			j�rjekord.lisaT��(new T��(String.valueOf(i)));
		}

	}
}
