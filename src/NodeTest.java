import static org.junit.Assert.*;

import org.junit.Test;


public class NodeTest {

	@Test
	public void test1(){
		Person p = new Person(""+ 1000, 20);
		Person p2 = new Person(""+ 5000, 40);
		Person p3 = new Person(""+ 10000, 60);
		Person p4 = new Person("Pedro", 18);
		Node n = new LLNode(p);
		Node n2 = new LLNode(p2);
		Node n3 = new LLNode(p3);
		n.add(n2);
		
		n.add(n3);
		assertEquals(n.search(p), n);
		assertEquals(n.search(p2), n2);
		assertEquals(n.search(p3), n3);
		
		
	}//end test
	
	@Test
	public void test2(){
		
	}//end test
	
	@Test
	public void test3(){
		
	}//end test
	
	@Test
	public void test4(){
		
	}//end test

	@Test
	public void test5(){
		
	}//end test
	
	@Test
	public void test6(){
		
	}//end test
	
	@Test
	public void test7(){
		
	}//end test
	
	@Test
	public void test8(){

	}//end test
	
	@Test
	public void test9(){

	}//end test
	
	@Test
	public void test10(){
		
	}//end test	
	
	@Test
	public void test11(){
		assertEquals(true,true);
	}//end test
	
	@Test
	public void test12(){
		assertEquals(true,true);
	}//end test
	
	@Test
	public void test13(){
		assertEquals(true,true);
	}//end test
	
	@Test
	public void test14(){
		assertEquals(true,true);
	}//end test
	
	@Test
	public void test15(){
		assertEquals(true,true);
	}//end test


}
