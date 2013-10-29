import java.util.Random;

public class Tööline implements Runnable {
	private static int nr = 0;
	private TööJärjekord järjekord;
	static Random rand = new Random();
	
	Tööline(TööJärjekord järjekord) {
		this.järjekord = järjekord;
		new Thread(this, "Tööline-" + (++nr)).start();
	}

	public void run() {
		Töö t;
		while (true) {
			t = järjekord.võtaTöö();
			teeÄra(t);
		}
	}

	void teeÄra(Töö x) {
		System.out.println(this + " tegi töö nr " + x.annaNimi());
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