package thread;

public class DisplayMessageThread extends Thread {

	private Thread t;
	private String name;

	public DisplayMessageThread() {
	}

	public DisplayMessageThread(String name) {
		this.name = name;
		System.out.println("Creating [" + name + "] thread !");
	}

	@Override
	public void run() {
		System.out.println("Thread [" + name + "] started !");
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread ["+name+"] print number ["+i+"]");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Intrerupted Exception Ocurred !");
			}
		}

	}

	public void start() {
		if (t == null) {
			t = new Thread(this, name);
			t.start();
		}
	}
}
