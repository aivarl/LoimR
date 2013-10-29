import java.util.LinkedList;


public class Ülemus {
	LinkedList<Töö> järjekord = new LinkedList<Töö>();

	void TööJärjekord() {
	}

	synchronized void lisaTöö2(Töö t) {
		järjekord.addLast(t);
		notify();
	}
}
