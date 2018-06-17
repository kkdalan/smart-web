package org.smart4j.smartweb.thread;

public class SequenceA implements Sequence {

	private static int number = 0;

	@Override
	public int getNumber() {
		return ++number;
	}
	
	public static void main(String[] args) {
		
		Sequence sequence = new SequenceA();
		
		SequenceClientThread thread1 = new SequenceClientThread(sequence);
		SequenceClientThread thread2 = new SequenceClientThread(sequence);
		SequenceClientThread thread3 = new SequenceClientThread(sequence);
		
		thread1.start();
		thread2.start();
		thread3.start();
	
	}

}
