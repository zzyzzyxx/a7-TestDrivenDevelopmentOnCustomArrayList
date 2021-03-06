package a7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import a7CustomArrayListTestDrivenDevelopment.CustomArrayList;
import a7CustomArrayListTestDrivenDevelopment.CustomList;

class CustomArrayListTest {
	
	// TEST DRIVEN DEVELOPMENT
		//1. Write a failing test
		//2. Write the business logic to make the test pass
		//3. Refactor your code
	
	@Test
	void should_one_item_to_list() {
		
		//arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		//act
		sut.add(10);
		Integer expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();
		//assert
		//what would we expect to happen?
		//an integer 10 stored in the first index
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
		
	}
	@Test
	void should_add_11_item_to_list() {
		//arrange
		CustomList<Integer> sut = new CustomArrayList<>();
		//act
		for(int i =0; i <= 20; i++) {
			sut.add(i+1);
			
		}
		//assert
		for(int i =0; i <= 10; i++) {
		assertEquals(i+1, sut.get(i));}
		assertEquals(21, sut.getSize());
	}
	
	@Test	
	void should_add_item_to_list_at_index0() {
		//arrange
		CustomList<String> sut = new CustomArrayList<>();
		//act
		for(int i = 1; i < 20; i++) {
			sut.add("index"+i);
		}
		sut.add(0, "addedItem");
		String expectedResult = sut.get(0);
		Integer expectedSize = sut.getSize();
		//assert
		//what would we expect to happen?
		//a String "addedItem" stored in the third index
		assertEquals("addedItem", expectedResult);
		//	expected size of 11
		assertEquals(20, expectedSize); 
	}
	
	@Test
	void should_add_item_to_list_in_the_middle() {
		//arrange
		CustomList<String> sut = new CustomArrayList<>();
		//act
		for(int i = 0; i < 20; i++) {
			sut.add("index"+i);
		}
		sut.add(5, "addedItem");
		String expectedResult = sut.get(5);
		Integer expectedSize = sut.getSize();
		//assert
		//what would we expect to happen?
		//a String "addedItem" stored in the index 5
		assertEquals("addedItem", expectedResult);
		//	expected size of 12
		assertEquals(21, expectedSize);
	
		
	}
	
	@Test
	void should_add_item_to_large_list_in_the_middle() {
		//arrange
		CustomList<String> sut = new CustomArrayList<>();
		//act
		for(int i = 0; i < 10000; i++) {
			sut.add("index"+i);
		}
		sut.add(5000, "addedItem");
		String expectedResult = sut.get(5000);
		Integer expectedSize = sut.getSize();
		//assert
		//what would we expect to happen?
		//a String "addedItem" stored in the index 5
		assertEquals("addedItem", expectedResult);
		//	expected size of 1
		assertEquals(10001, expectedSize);
	}
	
	@Test	
	void should_add_item_to_list_at_last_index() {
		//arrange
		CustomList<String> sut = new CustomArrayList<>();
		//act
		for(int i = 0; i < 20; i++) {
			sut.add("index"+i);
		}
		sut.add(12, "addedItem");
		String expectedResult = sut.get(12);
		Integer expectedSize = sut.getSize();
		//assert
		//what would we expect to happen?
		//a String "addedItem" stored in the index 12
				assertEquals("addedItem", expectedResult);
				//	expected size of 1
				assertEquals(21, expectedSize);
 
	}
	
	@Test
	void should_remove_item_from_list_start() {
		//arrange
		CustomList<String> sut = new CustomArrayList<>();
		//act
		sut.add("element");
		sut.remove(0);
		Integer expectedSize = sut.getSize();
		//assert
		//what would we expect to happen?
		//a String with index 0 removed from the list
		assertEquals(0, expectedSize);	
	}
	
	@Test
	void should_remove_item_from_middle_of_the_list() {
		//arrange
		CustomList<String> sut = new CustomArrayList<>();
		//act
		for(int i = 0; i < 20; i++) {
			sut.add("index"+i);
		}
		sut.add(5, "addedItem");
		sut.remove(5);
		Integer expectedSize = sut.getSize();
		//assert
		//what would we expect to happen?
		//a String with index 5 removed from the list and list size 11
		assertEquals(20, expectedSize);	
	}

	@Test
	void should_remove_item_from_list_end() {
		//arrange
		CustomList<String> sut = new CustomArrayList<>();
		//act
		for(int i = 0; i < 20; i++) {
			sut.add("index"+i);
		}
		sut.add(12, "addedItem");
		sut.remove(12);
		Integer expectedSize = sut.getSize();
		//assert
		//what would we expect to happen?
		assertEquals(20, expectedSize);	
	}
	
	@Test
	void should_throw_exception_when_out_of_bounds() {
		//arrange
		CustomList<String> sut = new CustomArrayList<>();
		//act
		try {
			sut.get(20);
		} catch (IndexOutOfBoundsException e) {
			
		}
		//assert
		
	}
	
	@Test
	void should_throw_exception_when_add_is_out_of_bounds() {
			//arrange
			CustomList<String> sut = new CustomArrayList<>();
			//act
			try {
				sut.add(20, "addedItem");
			} catch (IndexOutOfBoundsException e) {
				
			}
			//assert
			fail("No IndexOutOfBoundsException"); 
	}
	
	@Test
	void should_throw_exception_when_remove_is_out_of_bounds() {
			//arrange
			CustomList<String> sut = new CustomArrayList<>();
			//act
			try {
				sut.remove(20);
			} catch (IndexOutOfBoundsException e) {
				
			}
			//assert
			fail("No IndexOutOfBoundsException"); 
	}
}
