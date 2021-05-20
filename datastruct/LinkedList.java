package datastruct;

public class LinkedList implements List {
	
	private Element sentinel;  // pointe sur l'élément sentinelle
	
	private Element current;  // pointe sur l'élément courant
	
	private int size;  // nombre d'élément dans la liste
	
	public LinkedList() {
		
		this.sentinel = new Element(null,null,null);
		this.size = 0;
		this.sentinel.prev = this.sentinel;
		this.sentinel.next = this.sentinel;
		assert(this.invariant()):"Invariant violé !";
	}
	
	
	public void goToHead() {
		
		this.current = this.sentinel.next;
		assert(this.invariant()):"Invariant violé !";
	}

	
	public void goToEnd() {
		
		this.current = this.sentinel.prev;
		assert(this.invariant()):"Invariant violé !";
	}
	
	
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
	
	
	public String toString() {
		
		String retu = null;
		
		goToHead();
		int i=0;
		while(this.current != this.sentinel) {
			retu += i+":"+this.current.theValue.toString();
			i++;
		}
		
		return retu;
	}
	
	
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
	
	
	public boolean hasPrevious() {
		
		boolean ret;
		
		if(this.current.prev != this.sentinel) {
			ret = true;
		}else {
			ret = false;
		}
		return ret;
	}
	
	
	public boolean hasNext() {
		
		boolean ret;
		
		if(this.current.next != this.sentinel) {
			ret = true;
		}else {
			ret = false;
		}
		return ret;
	}
	
	
	@Override
	public void insert(Object data) {
		if(data == null) {
			throw new NullPointerException("L'objet indiqué est null");
		}else {
			goToEnd();
			Element nouv = new Element(this.current,this.sentinel,data);
			this.size++;
			this.current.next = nouv;
			this.current = nouv;
		}
		
		assert(this.invariant()):"Invariant violé !";
	}

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

	@Override
	public Object getValue() {
		
		return this.current.theValue;
	}

	@Override
	public void setValue(Object newData) {
		if(newData == null) {
			throw new NullPointerException("L'objet indiqué est null");
		}else {
			this.current.theValue = newData;
		}
		assert(this.invariant()):"Invariant violé !";
	}

	@Override
	public boolean isEmpty() {
		boolean ret= false;
		
		if(this.size == 0) {
			ret = true;
		}
		
		return ret;
	}

	@Override
	public int getSize() {
		return this.size;
	}

	
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

	private class Element{
	
		Element prev;  // Connexion à l'élément précédent de la liste
	
		Element next;  // Connexion à l'élément suivant de la liste
	
		Object theValue;  // Donnée stockée
	
		Element(Element prev, Element next, Object data){
		
			this.prev = prev;
			this.next = next;
			this.theValue = data;
		}
	}
}
