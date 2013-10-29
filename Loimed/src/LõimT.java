public class LõimT extends Thread {
	LõimT(String name) {
		super(name);
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " töötab.");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " lõpetas.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		LõimT lõim = new LõimT("Lõim-2 1");
		lõim.start();
		LõimT lõim2 = new LõimT("Lõim-2 2");
		lõim2.start();
	}
}