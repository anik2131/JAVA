package com.anik.cts.threading.example;

public class PrintFiles extends Thread {
	@Override
	public void run() {
		System.out.println("----------Printing files----------");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Files printed: " + i);
			try {
				Thread.sleep(2000); //activities will be done after 2s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
