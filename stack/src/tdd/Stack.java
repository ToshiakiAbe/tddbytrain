package tdd;

import java.util.EmptyStackException;

public class Stack {

	private int[] value = new int[10];
	private int size = 0;

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(int value) {
		this.value[size] = value;
		size++;
	}

	public int size() {
		return size;
	}

	public int top() {
		emptyCheck();
		return value[size - 1];
	}

	public void pop() {
		emptyCheck();
		this.value[size - 1] = 0;
		size--;
	}

	private void emptyCheck() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
	}
}
