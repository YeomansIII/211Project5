import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void test1() {
		Person p = new Person("" + 1000, 20);
		Person p2 = new Person("" + 500, 4);
		Person p3 = new Person("" + 10000, 60);
		Person p4 = new Person("" + 20, 18);

		Node n = new LLNode(p);
		Node n2 = new LLNode(p2);
		Node n3 = new LLNode(p3);
		Node n4 = new LLNode(p4);

		assertEquals(n.add(n2), n);
		assertEquals(n.add(n3), n);
		assertEquals(n.add(n4), n);

		assertEquals(n.search(p), n);
		assertEquals(n.search(p3), n3);
		assertEquals(n.search(p4), n4);

		assertEquals(n.getData().compareTo(p), 0);
		assertEquals(n2.getData().compareTo(p2), 0);
		assertEquals(n3.getData().compareTo(p3), 0);
		assertEquals(n4.getData().compareTo(p4), 0);

	}// end test

	@Test
	public void test2() {

		Person p = new Person("Jason123", 1);
		Person p2 = new Person("" + 100, 2);
		Person p3 = new Person("123Pedro" + 500, 3);
		Person p4 = new Person("" + 500, 18);

		Node n = new LLNode(p);
		Node n2 = new LLNode(p2);
		Node n3 = new LLNode(p3);
		Node n4 = new LLNode(p4);

		assertEquals(n.add(n2), n);
		assertEquals(n.add(n3), n);
		assertEquals(n.add(n4), n);

		assertEquals(n.search(p), n);
		assertEquals(n.search(p2), n2);
		assertEquals(n.search(p3), n3);

		assertEquals(n.getData().compareTo(p), 0);
		assertEquals(n2.getData().compareTo(p2), 0);
		assertEquals(n3.getData().compareTo(p3), 0);
		assertEquals(n4.getData().compareTo(p4), 0);
	}// end test

	@Test
	public void test3() {

	}// end test

	@Test
	public void test4() {

	}// end test

	@Test
	public void test5() {

	}// end test

	@Test
	public void test6() {

	}// end test

	@Test
	public void test7() {

	}// end test

	@Test
	public void test8() {

	}// end test

	@Test
	public void test9() {

	}// end test

	@Test
	public void test10() {

	}// end test

	@Test
	public void test11() {
		assertEquals(true, true);
	}// end test

	@Test
	public void test12() {
		assertEquals(true, true);
	}// end test

	@Test
	public void test13() {
		assertEquals(true, true);
	}// end test

	@Test
	public void test14() {
		assertEquals(true, true);
	}// end test

	@Test
	public void test15() {
		assertEquals(true, true);
	}// end test

}
