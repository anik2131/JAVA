package com.anik.cts.threading.example;

public class DownloadFiles extends Thread {

	@Override
	public void run() {
		System.out.println("----------Downloading files----------");
		for (int i = 1; i <= 10; i++) {
			System.out.println("Files downloaded: " + i);
			try {
				Thread.sleep(2000); //activities will be done after 2s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
