import java.util.LinkedList;

public class T��J�rjekord {
	LinkedList<T��> j�rjekord = new LinkedList<T��>();

	T��J�rjekord() {
	}

	synchronized void lisaT��(T�� t) {
		j�rjekord.addLast(t);
		notify();
	}

	synchronized T�� v�taT��() {
		while (j�rjekord.isEmpty()) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		return (T��) j�rjekord.removeFirst();
	}
}