public class TestTöö {
	public static void main(String[] args) {
		TööJärjekord järjekord = new TööJärjekord();
		Tööline[] töötajad = new Tööline[4];
		for (int i = 0; i < töötajad.length; i++) {
			töötajad[i] = new Tööline(järjekord);
		}
		for (int i = 0; i < 100; i++) {
			järjekord.lisaTöö(new Töö(String.valueOf(i)));
		}

	}
}
