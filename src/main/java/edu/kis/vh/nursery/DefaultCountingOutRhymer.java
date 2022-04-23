package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int SIZE = 12;
	private static final int START_VALUE = -1;
	private final int[] numbers = new int[SIZE];

	public static int getSIZE() {
		return SIZE;
	}

	public static int getStartValue() {
		return START_VALUE;
	}

	public int getTotal() {
		return total;
	}

	private int total = START_VALUE;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
			return total == START_VALUE;
		}
		
	public boolean isFull() {
				return total == 11;
			}
		
	protected int peekaboo() {
		if (callCheck())
			return START_VALUE;
		return numbers[total];
	}
			
	public int countOut() {
		if (callCheck())
			return START_VALUE;
		return numbers[total--];
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
