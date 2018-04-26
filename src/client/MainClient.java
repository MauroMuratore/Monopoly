package client;


import client.graphics.TableGTX;

public class MainClient {

	public static void main(String[] args) {
			
		TableGTX tab = new TableGTX();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tab.rollDice(5);

	}

}
