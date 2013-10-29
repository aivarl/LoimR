public class V�idujooks implements Runnable {
	static Loendur loendur = new Loendur();

	public void run() {
		System.out.println(Thread.currentThread().getName() + " alustas");

		for (int i = 0; i < 10000000; i++) {
			loendur.suurenda();
		}

		System.out.println(Thread.currentThread().getName() + " l�petas");
	}

	public static void main(String[] args) {
		V�idujooks l�im1 = new V�idujooks();
		Thread t = new Thread(l�im1, "L�im-1");
		t.start();
		V�idujooks l�im2 = new V�idujooks();
		Thread s = new Thread(l�im2, "L�im-2");
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