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
		if(test2.toString().equals("\n0:Je suis le 1er\n1:Je suis le 2eme")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testGetValueAt() {
		System.out.println("Test Get Value At");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		if(test2.getValueAt(1).toString().equals("Je suis le 2eme")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testHasPrevious() {
		System.out.println("Test Has Previous");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		test2.goToEnd();
		if(test2.hasPrevious()) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testHasNext() {
		System.out.println("Test Has Next");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		test2.goToHead();
		if(test2.hasNext()) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
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
		System.out.println("Test Contains");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		test2.insert(nouveau);
		if(test2.contains(nouveau)) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non Ok");
		}
	}

	@Test
	void testAdd() {
		System.out.println("Test Add");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.add(0,nouveau2);
		test2.goToHead();
		if(test2.getValue().toString().equals("Je suis le 2eme")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testGetValue() {
		System.out.println("Test Get Value");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		if(test2.getValue().equals("Je suis le 2eme")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testSetValue() {
		System.out.println("Test Set Value");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		test2.setValue(nouveau);
		if(test2.getValue().equals("Je suis le 1er")) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testIsEmpty() {
		System.out.println("Test Empty");
		LinkedList test2 = new LinkedList();
		if(test2.isEmpty()) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

	@Test
	void testGetSize() {
		System.out.println("Test Get Size");
		LinkedList test2 = new LinkedList();
		String nouveau = new String("Je suis le 1er");
		String nouveau2 = new String("Je suis le 2eme");
		test2.insert(nouveau);
		test2.insert(nouveau2);
		if(test2.getSize()==2) {
			System.out.println("Test Ok");
		}else {
			System.out.println("Test Non OK");
		}
	}

}
