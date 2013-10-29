public class LõimR implements Runnable {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " töötab.");
			Thread.sleep(1000);
			// sekundiline viivitus,
			// jäljendamaks reaalset tööd
			System.out.println(Thread.currentThread().getName() + " lõpetas.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		LõimR lõim1 = new LõimR();
		Thread t = new Thread(lõim1, "Lõim-1");
		t.start();
		LõimR lõim2 = new LõimR();
		Thread s = new Thread(lõim2, "Lõim-2");
		s.start();
	}
}