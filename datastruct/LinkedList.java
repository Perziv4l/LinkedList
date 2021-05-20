package datastruct;

public class LinkedList implements List {
	
	private Element sentinel;  // pointe sur l'élément sentinelle
	
	private Element current;  // pointe sur l'élément courant
	
	private int size;  // nombre d'élément dans la liste
	
	public LinkedList() {
		
	}
	
	
	public void goToHead() {
		
		
	}

	
	public void goToEnd() {
		
		
	}
	
	
	public boolean next() {
		
		
	}
	
	
	public boolean previous() {
		
		
	}
	
	
	public String toString() {
		
		
	}
	
	
	public Object getValueAt(int index) {
		
		
	}
	
	
	public boolean hasPrevious() {
		
		
	}
	
	
	public boolean hasNext() {
		
		
	}
	
	
	@Override
	public void insert(Object data) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object data) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, Object data) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setValue(Object newData) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

}

private class Element{
	
	Element prev;  // Connexion à l'élément précédent de la liste
	
	Element next;  // Connexion à l'élément suivant de la liste
	
	Object theValue;  // Donnée stockée
	
	Element(Element prev, Element next, Object data){
		
		
	}
}
