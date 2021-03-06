package a7CustomArrayListTestDrivenDevelopment;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	
	@Override
	public boolean add(T item) {
		return add(size, item);
	}

	@Override
	public boolean add(int index, T item) throws IndexOutOfBoundsException {
		if(index > size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
			}
		if (size >= items.length) {
			items = Arrays.copyOf(items, items.length * 2);
		}

		
		Object newItems[] = new Object[items.length+1];  
			
        for (int i = 0; i < index; i++) {
        	newItems[i] = items[i];
        }
 
        newItems[index] = item;
        for (int i = index + 1; i <= items.length; i++) {
        	newItems[i] = items[i - 1];
        }
        items = newItems;
        size++;
        return true;
        
        
	}

	@Override
	public int getSize() {
		
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override	
	public T get(int index) throws IndexOutOfBoundsException {
		if(index >= size) {
			throw new IndexOutOfBoundsException("Index out of bounds");
			}
		return (T) items[index];
	}

	@SuppressWarnings("unchecked")
	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		if(index >= size) {
			throw new IndexOutOfBoundsException("Out of bounds");
		}
		Object newShorterItems[] = new Object[items.length-1]; 
		for (int i = 0, j = 0; i < items.length; i++) {
		    if (i != index) {
		    	newShorterItems[j++] = items[i];
		    }
		}
		items = newShorterItems;
		size--;
		return (T) items[index];
	}

}
