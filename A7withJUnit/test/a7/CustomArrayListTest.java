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
		for(int i =0; i <= 10; i++) {
			sut.add(i+1);
			
		}
		//assert
		for(int i =0; i <= 10; i++) {
		assertEquals(i+1, sut.get(i));}
		assertEquals(11, sut.getSize());
	}
	
	@Test	
	void should_add_item_to_list_at_index() {
		//arrange
		CustomList<String> sut = new CustomArrayList<>();
		//act
		sut.add(3, "index3");
		String expectedResult = sut.get(3);
		Integer expectedSize = sut.getSize();
		//assert
		//what would we expect to happen?
		//a String "index3" stored in the third index
		assertEquals("index3", expectedResult);
		//	expected size of 1
		assertEquals(1, expectedSize); 
	}
	
	@Test
	void should_remove_item_from_list() {
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

}
