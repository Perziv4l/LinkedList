package datastruct;

public class LinkedList implements List {
	
	private Element sentinel;  // pointe sur l'élément sentinelle
	
	private Element current;  // pointe sur l'élément courant
	
	private int size;  // nombre d'élément dans la liste
	
	/**
	 * constructor of LinkedList
	 */
	public LinkedList() {
		
		this.sentinel = new Element(null,null,null);
		this.size = 0;
		this.sentinel.prev = this.sentinel;
		this.sentinel.next = this.sentinel;
		this.current = this.sentinel;
		assert(this.invariant()):"Invariant violé !";
	}
	
	
	/**
	 * current Element goes to the top of the list
	 */
	public void goToHead() {
		
		this.current = this.sentinel.next;
		assert(this.invariant()):"Invariant violé !";
	}

	
	/**
	 * current Element goes to the last Element
	 */
	public void goToEnd() {
		
		this.current = this.sentinel.prev;
		assert(this.invariant()):"Invariant violé !";
	}
	
	
	/**
	 * current Element goes to the next Element if he can
	 * @return boolean true if he can, false if not
	 */
	public boolean next() {
		boolean ret;
		
		if(hasNext()) {
			ret = true;
			this.current = this.current.next;
		}else {
			ret = false;
		}
		
		assert(this.invariant()):"Invariant violé !";
		return ret;
	}
	
	
	/**
	 * current Element goes to the previous Element if he can
	 * @return boolean true if he can, false if not
	 */
	public boolean previous() {
		
		boolean ret;
		
		if(hasPrevious()) {
			ret = true;
			this.current = this.current.prev;
		}else {
			ret = false;
		}
		
		assert(this.invariant()):"Invariant violé !";
		return ret;
	}
	
	
	/**
	 * return a string to know what is inside of the list
	 * pattern : number on the list : data inside the object
	 */
	public String toString() {
		
		String retu = null;
		
		goToHead();
		int i=0;
		while(this.current != this.sentinel) {
			retu += i+":"+this.current.theValue.toString();
			this.current = this.current.next;
			i++;
		}
		
		return retu;
	}
	
	
	/**
	 * getter of the value on the list with an index
	 * @param index, number in the list
	 * @return the data
	 */
	public Object getValueAt(int index) {
		
		Object ret = null;
		
		if(index >= this.size || index < 0) {
			throw new ArrayIndexOutOfBoundsException("L'index doit être compris entre 0 et la taille -1 de la liste !");
		}else {
			int i = 0;
			goToHead();
			
			while(i!=index) {
				this.current = this.current.next;
				i++;
			}
			ret = this.current.theValue;
		}
		
		assert(this.invariant()):"Invariant violé !";
		return ret;
	}
	
	
	/**
	 * to know if the Element has a previous Element
	 * @return boolean true if he has, false if not
	 */
	public boolean hasPrevious() {
		
		boolean ret;
		
		if(this.current.prev != this.sentinel) {
			ret = true;
		}else {
			ret = false;
		}
		return ret;
	}
	
	
	/**
	 * to know if the Element has a next Element
	 * @return boolean true if he has, false if not
	 */
	public boolean hasNext() {
		
		boolean ret;
		
		if(this.current.next != this.sentinel) {
			ret = true;
		}else {
			ret = false;
		}
		return ret;
	}
	
	
	/**
	 * insert an Element on the list
	 * @param data an Object
	 */
	@Override
	public void insert(Object data) {
		if(data == null) {
			throw new NullPointerException("L'objet indiqué est null");
		}else {
			goToEnd();
			Element nouv = new Element(this.current,this.sentinel,data);
			this.size++;
			this.current.next = nouv;
			this.sentinel.prev = nouv;
			this.current = nouv;
		}
		 
		assert(this.invariant()):"Invariant violé !";
	}

	
	/**
	 * delete the current Element
	 * @return boolean to know if it goes wrong or not
	 */
	@Override
	public boolean delete() {
		
		if(this.current.prev != this.sentinel) {
			this.current.prev.next = this.current.next;
			this.current.next.prev = this.current.prev;
			this.current = this.current.prev;
		}else {
			this.current.next.prev = this.sentinel;
			this.sentinel.next = this.current.next;
			this.current = this.current.next;
		}
		this.size--;
		
		assert(this.invariant()):"Invariant violé !";
		return true;
	}

	
	/**
	 * know if an object in on the list
	 * @param data the Object that we want to know if it's inside the list or not
	 * @return boolean true if he contains, false if not
	 */
	@Override
	public boolean contains(Object data) {
		boolean ret = false;
		
		if(data == null) {
			throw new NullPointerException("L'objet indiqué est null");
		}else {
			goToHead();
			
			int i =0;
			
			while(!ret && i<this.size) {
				if(this.current.theValue == data) {
					ret = true;
				}
				this.current = this.current.next;
				i++;
			}
		}
		
		assert(this.invariant()):"Invariant violé !";
		return ret;
	}
	
	
	/**
	 * add a Object on the index
	 * @param index integer of the place of the new Object
	 * @param data the new Object
	 */
	@Override
	public void add(int index, Object data) {
		
		if(index >= this.size || index < 0) {
			throw new ArrayIndexOutOfBoundsException("L'index doit être compris entre 0 et la taille -1 de la liste !");
		}else if(data == null){
			throw new NullPointerException("L'objet indiqué est null");
		}else {
			goToHead();
			for(int i =0; i<=index; i++) {
				this.current = this.current.next;
			}
			
			Element nouv = new Element(this.current.prev,this.current,data);
			this.size++;
			this.current.prev = nouv;
			this.current.prev.next = nouv;
		}
		assert(this.invariant()):"Invariant violé !";
	}

	
	/**
	 * get the value of the current Element
	 * @return Object
	 */
	@Override
	public Object getValue() {
		
		return this.current.theValue;
	}

	
	/**
	 * set the value of the current Element
	 * @param newData the new Object
	 */
	@Override
	public void setValue(Object newData) {
		if(newData == null) {
			throw new NullPointerException("L'objet indiqué est null");
		}else {
			this.current.theValue = newData;
		}
		assert(this.invariant()):"Invariant violé !";
	}

		
	/**
	 * know if the list is empty or not
	 * @return boolean true if empty, false if not
	 */
	@Override
	public boolean isEmpty() {
		boolean ret= false;
		
		if(this.size == 0) {
			ret = true;
		}
		
		return ret;
	}

	
	/**
	 * getter of the size of the list
	 * @return int, the size of the list
	 */
	public int getSize() {
		return this.size;
	}

	
	/**
	 * test of the attribute
	 * @return boolean if all goes well or not
	 */
	private boolean invariant() {
		boolean ret = true;
		
		if(this.sentinel == null) {
			ret = false;
			System.err.println("Le sentinel est null");
		}
		
		if(this.current == null) {
			ret = false;
			System.err.println("Le current est null");
		}
		
		if(this.size < 0) {
			ret = false;
			System.err.println("La taille du tableau est négative");
		}
		return ret;
	}
	
	/**
	 * inside class of Element of the list
	 * @author perzival
	 */
	private class Element{
	
		Element prev;  // Connexion à l'élément précédent de la liste
	
		Element next;  // Connexion à l'élément suivant de la liste
	
		Object theValue;  // Donnée stockée
		
	
		/**
		 * constructor of Element
		 * @param prev
		 * @param next
		 * @param data
		 */
		Element(Element prev, Element next, Object data){
		
			this.prev = prev;
			this.next = next;
			this.theValue = data;
		}
	}
}
