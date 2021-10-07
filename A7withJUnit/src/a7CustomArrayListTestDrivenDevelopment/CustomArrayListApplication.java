package a7CustomArrayListTestDrivenDevelopment;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		CustomList<Integer> myCustomList = new CustomArrayList<>();
			
		for (int i=0; i<21; i++) {
            myCustomList.add(i + 1);
            
        }
		
		for (int i=0; i<myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i));
          
        }
		System.out.println("Size: " + myCustomList.getSize());
		System.out.println("***********");
		
		myCustomList.add(2, 1212);
		for (int i=0; i<myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i)); 
        }
		System.out.println("Size: " + myCustomList.getSize());
		//size is 21? 
		System.out.println("***********");
		
		myCustomList.remove(0);
		for (int i=0; i<myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i)); 
        }
		System.out.println("Size: " + myCustomList.getSize());
		//size is 21...
	}

}
