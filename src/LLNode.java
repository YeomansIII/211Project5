
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
		System.out.println(thing.getData().toString());
		LLNode current = getStart();
		//LLNode current = this;
		while(current.next != null) {
			if((current.getData().compareTo(thing.getData()) < 0) && (current.next.getData().compareTo(thing.getData()) > 0)) {
				//System.out.println("Success Add IF STATEMENT");
				thing.setNext(current.next);
				thing.setPrev(current);
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

		return getStart();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Node search(Comparable item) {
		//LLNode current = getStart();
		LLNode current = this;
		while(current.next != null) {
			System.out.println(current.getData().toString());
			if(current.getData().compareTo(item)==0) {
				return current;
			}
			current = current.next;
		}
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
	
	private LLNode getStart() {
		LLNode current = this;
		while(current.prev != null) {
			current = current.prev;
		}
		return current;
	}

}
