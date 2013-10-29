import java.util.LinkedList;

public class TööJärjekord {
	LinkedList<Töö> järjekord = new LinkedList<Töö>();

	TööJärjekord() {
	}

	synchronized void lisaTöö(Töö t) {
		järjekord.addLast(t);
		notify();
	}

	synchronized Töö võtaTöö() {
		while (järjekord.isEmpty()) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		return (Töö) järjekord.removeFirst();
	}
}