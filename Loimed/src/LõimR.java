public class L�imR implements Runnable {
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " t��tab.");
			Thread.sleep(1000);
			// sekundiline viivitus,
			// j�ljendamaks reaalset t��d
			System.out.println(Thread.currentThread().getName() + " l�petas.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		L�imR l�im1 = new L�imR();
		Thread t = new Thread(l�im1, "L�im-1");
		t.start();
		L�imR l�im2 = new L�imR();
		Thread s = new Thread(l�im2, "L�im-2");
		s.start();
	}
}