import java.util.LinkedList;


public class �lemus {
	LinkedList<T��> j�rjekord = new LinkedList<T��>();

	void T��J�rjekord() {
	}

	synchronized void lisaT��2(T�� t) {
		j�rjekord.addLast(t);
		notify();
	}
}
