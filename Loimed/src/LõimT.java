public class L�imT extends Thread {
	L�imT(String name) {
		super(name);
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " t��tab.");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " l�petas.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		L�imT l�im = new L�imT("L�im-2 1");
		l�im.start();
		L�imT l�im2 = new L�imT("L�im-2 2");
		l�im2.start();
	}
}