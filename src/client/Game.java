package client;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import client.graphics.TableGTX;

public class Game implements Runnable{

	private TableGTX table;
	private Thread thread;
	
	private boolean running;
	
	private BufferStrategy bs;
	private Graphics g;
	
	private void init() {
		table = new TableGTX();
	}
	
	private void tick() {
	}
	
	private void render() {
		
	}
	
	
	@Override
	public void run() {
		this.init(); //inizializzo
		
		while(running) {
			tick();
			render();
		}
		
		this.stop();
	}
	
	public synchronized void start() {
		if(running) {
			return;
		} //se sta già andando non faccio ripartire il thread
		running=true;
		thread = new Thread(this);
		thread.start();
	}
	
	public synchronized void stop() {
		if(!running) {
			return;
		}
		
		running = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
