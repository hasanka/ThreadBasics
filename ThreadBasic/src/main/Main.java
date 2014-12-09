package main;

import thread.DisplayMessageRunnable;
import thread.DisplayMessageThread;

public class Main {

	public static void main(String[] args) {
		DisplayMessageRunnable t1 = new DisplayMessageRunnable("T1");
		DisplayMessageThread t2 = new DisplayMessageThread("T2");
		t1.start();
		t2.start();
	}

}
