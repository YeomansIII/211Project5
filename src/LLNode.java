
public class LLNode implements Node {

	@SuppressWarnings("rawtypes")
	private Comparable data;
	protected LLNode next;
	protected LLNode prev;
	
	@SuppressWarnings("rawtypes")
	public LLNode(Comparable c) {
		data = c;
	}
	
	@SuppressWarnings("rawtypes")
	@Override
	public Comparable getData() {
		
		return data;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Node add(Node thing) {
		// TODO Auto-generated method stub
		LLNode start;
		LLNode current = this;
		while(current.next != null) {
			if(current.getData().compareTo(thing.getData()) < current.next.getData().compareTo(thing.getData())) {
				System.out.println("Success Add IF STATEMENT");
				current.next.setPrev(thing);
				current.setNext(thing);
				break;
			} else {
				current = current.next;
			}
		}
		if(current.next==null) {
			current.setNext(thing);
		}
		
		current = this;
		while(current.prev != null) {
			current = current.prev;
		}
		
		return current;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Node search(Comparable item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setNext(Node next) {
		this.next = (LLNode) next;
	}

	@Override
	public void setPrev(Node prev) {
		this.prev = (LLNode) prev;
	}

}
