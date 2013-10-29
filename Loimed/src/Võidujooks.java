public class Võidujooks implements Runnable {
	static Loendur loendur = new Loendur();

	public void run() {
		System.out.println(Thread.currentThread().getName() + " alustas");

		for (int i = 0; i < 10000000; i++) {
			loendur.suurenda();
		}

		System.out.println(Thread.currentThread().getName() + " lõpetas");
	}

	public static void main(String[] args) {
		Võidujooks lõim1 = new Võidujooks();
		Thread t = new Thread(lõim1, "Lõim-1");
		t.start();
		Võidujooks lõim2 = new Võidujooks();
		Thread s = new Thread(lõim2, "Lõim-2");
		s.start();
	}
}

class Loendur {
	public int n = 0;

	public void suurenda() {
		int algneN = n;
		n = n + 1;
		if (n > algneN + 1) {
			System.out.println("algneN = " + algneN + ", n = " + n);
		}
	}
}