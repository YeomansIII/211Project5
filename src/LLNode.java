//Jason Yeomans
//Pedro De Jesus

public class LLNode implements Node {

	private Comparable data;
	protected LLNode next;
	protected LLNode prev;

	public LLNode(Comparable c) {
		data = c;
	}

	@Override
	public Comparable getData() {

		return data;
	}

	@Override
	public Node add(Node thing) {
		System.out.println(thing.getData().toString());
		LLNode current = getStart();
		// LLNode current = this;
		while (current.next != null) {
			if ((current.getData().compareTo(thing.getData()) < 0)
					&& (current.next.getData().compareTo(thing.getData()) > 0)) {
				// System.out.println("Success Add IF STATEMENT");
				thing.setNext(current.next);
				thing.setPrev(current);
				current.next.setPrev(thing);
				current.setNext(thing);
				break;
			} else {
				current = current.next;
			}
		}
		if (current.next == null) {
			current.setNext(thing);
		}

		return getStart();
	}

	@Override
	public Node search(Comparable item) {
		// LLNode current = getStart();
		LLNode current = this;
		while (current.next != null) {
			System.out.println(current.getData().toString());
			if (current.getData().compareTo(item) == 0) {
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
		while (current.prev != null) {
			current = current.prev;
		}
		return current;
	}

}

// 1
// The sorted ArrayList is slower to add to than the Linked List because when
// you add elements to an ArrayList, because every time you insert an element,
// the array must re-adjust its size to accommodate newly entered elements.
// Also, when trying to insert an element into a certain spot in the array, it
// must shift to fit it into its place. A Linked List is better for adding
// elements because it does not require re-adjustment.
// 2
// The add is so quick for the unsorted array because it does not need to place
// elements into a correct order when added, just immediately add the element to
// the end.
// 3
// Our numbers are not identical because the driver class uses the Random class
// to create random numbers for every run of Driver. The speed of certain parts
// of the program is being measured in terms of time.
// 4
// The person objects in Driver have a random ID and therefore are sorted when
// they are added to the list, as none of the person objects are ever identical,
// the placement of the person objects are not identical.
// 5
// There are many methods of searching for the desired Comparable. Currently we
// go through the list from the beginning to the end, another method is to start
// in the middle and check the comparable values of the next and previous nodes.
// From there you can keep chopping the list in half until you are left with
// your desired node.
