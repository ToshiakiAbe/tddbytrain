package tdd;

import java.util.EmptyStackException;

import junit.framework.TestCase;

public class StackTest extends TestCase {

	private Stack stack;

	@Override
	public void setUp() {
		stack = new Stack();
	}

	public void testIsEmptyTrue() {
		assertTrue(stack.isEmpty());

		try {
			stack.top();
			fail();
		} catch (EmptyStackException e) {
		}
	}

	public void testIsEmptyFalse() {
		stack.push(1);
		assertFalse(stack.isEmpty());
		assertEquals(1, stack.size());
		assertEquals(1, stack.top());

		stack.push(3);
		assertEquals(2, stack.size());
		assertEquals(3, stack.top());
	}

	public void testPop() {
		try {
			stack.pop();
			fail();
		} catch (EmptyStackException e) {
		}

		stack.push(1);
		assertEquals(1, stack.size());
		stack.pop();
		assertEquals(0, stack.size());
		stack.push(1);
		stack.push(2);
		assertEquals(2, stack.size());
		stack.pop();
		assertEquals(1, stack.size());
		assertEquals(1, stack.top());
	}
}
