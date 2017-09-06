package com.github.hoodsen.array;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void testInsertAndFind() {
		UnorderedArray<Integer> array = new UnorderedArray<Integer>();
		array.insert(3);
		
		assertEquals(0, array.find(3));
		assertEquals(1, array.getSize());
	}
	
	@Test
	public void testInsertAndFindTwoElements() {
		UnorderedArray<Integer> array = new UnorderedArray<Integer>();
		array.insert(3);
		array.insert(5);
		
		assertEquals(0, array.find(3));
		assertEquals(1, array.find(5));
		assertEquals(2, array.getSize());
	}
	
	@Test
	public void testRemoveBasic() {
		UnorderedArray<Integer> array = new UnorderedArray<Integer>();
		array.insert(3);
		
		assertEquals(0, array.find(3));
		assertEquals(1, array.getSize());
		
		array.remove(3);
		
		assertEquals(UnorderedArray.NOT_FOUND, array.find(3));
		assertEquals(0, array.getSize());
	}
	
	@Test
	public void testRemoveShiftsElements() {
		UnorderedArray<Integer> array = new UnorderedArray<Integer>();
		array.insert(3);
		array.insert(5);
		array.insert(7);
		
		assertEquals(0, array.find(3));
		assertEquals(1, array.find(5));
		assertEquals(2, array.find(7));
		assertEquals(3, array.getSize());
		
		array.remove(5);
		
		assertEquals(UnorderedArray.NOT_FOUND, array.find(5));
		assertEquals(2, array.getSize());
		assertEquals(0, array.find(3));
		assertEquals(1, array.find(7));
	}

}
