package ADT;

public class ArrayQueue implements iQueue{

	private int f;
	private int r;
	private int N;
	private Object[] arrayQueue;
	
	public ArrayQueue(int N) {
		this.f = 0;
		this.r = 0;
		this.N = N;
		this.arrayQueue = new Object[N];
	}
	
	@Override
	public void enqueue(Object o) throws FullQueueException {
		if(size() == N-1)
			throw new FullQueueException("Cola Llena");
		arrayQueue[r] = o;
		r = (r+1) % N;
	}
	
	@Override
	public Object front() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException("Cola Vacia");
		
		return arrayQueue[f];
	}
	
	@Override
	public Object dequeue() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException("Cola Vacia");
		Object o = arrayQueue[f];
		f = (f+1) % N;
		return o;
	}
	
	
	public String printQueue() throws EmptyQueueException {
		if(isEmpty())
			throw new EmptyQueueException("Cola Vacia");
		
		String salida = "";
		
		for (int i = 0; i < this.arrayQueue.length; i++){
		    salida += this.arrayQueue[i]+ ", ";
		}
		
		return salida;
	}
	
	
	@Override
	public boolean isEmpty() {
		return (f==r);
	}
	
	@Override
	public int size() {
		return (N-f+r)%N;
	}
}
