package HausaufgabenSieben;

import java.util.Scanner;

public class ClockTask implements Runnable{
	
	private boolean stopRequest;
	private double sekunden;
	private Thread thread = new Thread(this);
	private Scanner tastatur = new Scanner(System.in);
	
	public ClockTask() {
		stopRequest = false;
		sekunden = 0.0;
		tastatur.nextLine();
		thread.start();
		if (tastatur.hasNextLine()){
			stop();
		}
	}
	
	@Override
	public void run() {
		while (!stopRequest){
			try{
				Thread.sleep(1000);
				sekunden++;
				System.out.println(sekunden);
				}
			catch (InterruptedException e) {
				System.out.println("geht nicht");
			}
		}
	}
	
	public void stop() {
		// TODO Auto-generated method stub
		stopRequest = true;
	}
	
	public static void main(String[] args) {
		new ClockTask();		
	}
}
