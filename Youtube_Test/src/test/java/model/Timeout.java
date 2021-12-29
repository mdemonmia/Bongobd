package model;

public class Timeout {
	
	public void timeout() {
		try {
			Thread.sleep(30000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
