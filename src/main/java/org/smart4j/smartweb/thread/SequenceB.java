package org.smart4j.smartweb.thread;

public class SequenceB implements Sequence {

	private static MockThreadLocal<Integer> numberContainer = new MockThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return 0;
		}
	};

	public int getNumber() {
		numberContainer.set(numberContainer.get() + 1);
		return numberContainer.get();
	}

	public static void main(String[] args) {

		Sequence sequence = new SequenceB();

		SequenceClientThread thread1 = new SequenceClientThread(sequence);
		SequenceClientThread thread2 = new SequenceClientThread(sequence);
		SequenceClientThread thread3 = new SequenceClientThread(sequence);

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
