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
		CustomList<Integer> myCustomList = new CustomArrayList<>();
		
		//act
		myCustomList.add(10);
		Integer expectedResult = myCustomList.get(0);
		Integer expectedSize = myCustomList.getSize();
		//assert
		//what would we expect to happen?
		//a string "bee" stored in the first index
		assertEquals(10, expectedResult);
		assertEquals(1, expectedSize);
		
	}
	@Test
	void should_add_11_item_to_list() {
		
	}
	
	@Test
	void should_add_item_to_list_at_index() {
		//arrange
		CustomList<Integer> myCustomList = new CustomArrayList<>();
		//act
		myCustomList.add(3, 1010);
		Integer expectedResult = myCustomList.get(3);
		Integer expectedSize = myCustomList.getSize();
		//assert
		//what would we expect to happen?
		//an int 1010 stored in the third index
		assertEquals(1010, expectedResult);
		//expected size should be actually 22, either way  - JUnit asserts 0
		assertEquals(21, expectedSize); 
	}

}
