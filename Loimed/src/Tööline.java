import java.util.Random;

public class T��line implements Runnable {
	private static int nr = 0;
	private T��J�rjekord j�rjekord;
	static Random rand = new Random();
	
	T��line(T��J�rjekord j�rjekord) {
		this.j�rjekord = j�rjekord;
		new Thread(this, "T��line-" + (++nr)).start();
	}

	public void run() {
		T�� t;
		while (true) {
			t = j�rjekord.v�taT��();
			tee�ra(t);
		}
	}

	void tee�ra(T�� x) {
		System.out.println(this + " tegi t�� nr " + x.annaNimi());
		try {
			Thread.sleep(rand.nextInt(8000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String toString() {
		return Thread.currentThread().getName();
	}
}