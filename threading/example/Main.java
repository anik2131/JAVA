package com.anik.cts.threading.example;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DownloadFiles download = new DownloadFiles();
		PrintFiles print = new PrintFiles();

		download.start();
		download.join(); //join keywords checks weather any thread is running or not to avoid collision.
		print.start();
	}

}
