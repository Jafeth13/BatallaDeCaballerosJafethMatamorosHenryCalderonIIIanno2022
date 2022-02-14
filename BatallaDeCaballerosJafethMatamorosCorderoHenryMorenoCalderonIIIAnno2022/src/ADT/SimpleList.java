package ADT;

public class SimpleList {

	private NodeList head, tail;
	private int size;
	
	public SimpleList() {
		// Constructor default
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	//Setters y Getters
	public NodeList getHead() {
		return head;
	}
	
	public NodeList getTail() {
		return tail;
	}
	
	public void setHead(NodeList head) {
		this.head = head;
	}
	
	public void setTail(NodeList tail) {
		this.tail = tail;
	}
	
	public boolean isEmpty(){
        return this.head == null;
    }
	
    public int getSize(){
        return this.size;
    }
    
    public void addFirst(NodeList nuevo){
    	
        if (isEmpty()) {
            this.head = nuevo;
            this.tail = nuevo;
        } else{
            nuevo.setNext(this.head);
            this.head = nuevo;
        }
        this.size++;
    }
    
    public void addLast(NodeList nuevo){
    	
        if (isEmpty()) {
            this.head = nuevo;
            this.tail = nuevo;
        } else{
            nuevo.setNext(null);
            this.tail.setNext(nuevo);
            this.tail = nuevo;
        }
        this.size++;
    }
    
    public boolean search(NodeList referencia){
        
    	NodeList aux = this.head;
        boolean bandera = false;
        
        while(aux != null && bandera != true){
            
        	if (referencia == aux)
                bandera = true;
            else
                aux = aux.getNext();
        }
        return bandera;
    }
    
    public void remove(NodeList referencia){
    	
        if (search(referencia)) {
        	
            if (this.head == referencia)
                this.head = this.head.getNext();
            
            else{
                NodeList aux = this.head;
                
                while(aux.getNext() != referencia){
                    aux = aux.getNext();
                }
                
                NodeList siguiente = aux.getNext().getNext();
                aux.setNext(siguiente);  
            }
            
            this.size--;
            
        }else
        	System.out.println("No se encontro el nodo a eliminar");
    }
    
    public void printList(){
    	
        if (!isEmpty()) {
        	
            NodeList aux = this.head;
            
            while(aux != null){
                System.out.print(aux.getElement()+ "->  ");
                
                aux = aux.getNext();
            }
        }
    }
}
