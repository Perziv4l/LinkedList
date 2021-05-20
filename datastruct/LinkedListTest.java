package datastruct;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {

	@Test
	void testLinkedList() {
		System.out.println("Test Constructor");
		LinkedList test1 = new LinkedList();
		if(test1.getSize()==0) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non Ok");
		}
	}

	@Test
	void testGoToHead() {
		System.out.println("Test GoToHead");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		test2.goToHead();
		if(test2.getValue().equals("Je suis le 1er")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testGoToEnd() {
		System.out.println("Test GoToEnd");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		test2.goToHead();
		test2.goToEnd();
		if(test2.getValue().equals("Je suis le 2eme")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testNext() {
		System.out.println("Test Next");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		test2.goToHead();
		test2.next();
		if(test2.getValue().equals("Je suis le 2eme")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testPrevious() {
		System.out.println("Test Previous");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		test2.previous();
		if(test2.getValue().equals("Je suis le 1er")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testToString() {
		System.out.println("Test to String");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		System.out.println(test2.toString());
		if(test2.toString().equals("Je suis le 1er\nJe suis le 2eme")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testGetValueAt() {
		fail("Not yet implemented");
	}

	@Test
	void testHasPrevious() {
		fail("Not yet implemented");
	}

	@Test
	void testHasNext() {
		fail("Not yet implemented");
	}

	@Test
	void testInsert() {
		System.out.println("Test Insert");
		LinkedList test2 = new LinkedList();
		Object nouveau = new Object();
		test2.insert(nouveau);
		if(test2.getSize()==1) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non Ok");
		}
	}

	@Test
	void testDelete() {
		System.out.println("Test Delete");
		LinkedList test2 = new LinkedList();
		Object nouveau = new Object();
		test2.insert(nouveau);
		test2.delete();
		if(test2.getSize()==0) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non Ok");
		}
	}

	@Test
	void testContains() {
		fail("Not yet implemented");
	}

	@Test
	void testAdd() {
		fail("Not yet implemented");
	}

	@Test
	void testGetValue() {
		fail("Not yet implemented");
	}

	@Test
	void testSetValue() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {
		fail("Not yet implemented");
	}

	@Test
	void testGetSize() {
		fail("Not yet implemented");
	}

}
