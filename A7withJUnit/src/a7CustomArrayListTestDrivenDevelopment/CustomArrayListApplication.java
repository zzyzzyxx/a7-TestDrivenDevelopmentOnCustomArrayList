package a7CustomArrayListTestDrivenDevelopment;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
			
		for (int i=0; i<21; i++) {
            myCustomList.add("element: "+(i+1));
            
        }
		
		for (int i=0; i<myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i));
          
        }
		System.out.println("Size: " + myCustomList.getSize()); // size: 21
		System.out.println("***********");
		
		myCustomList.add(2, "TRALALALA");
		for (int i=0; i<myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i)); 
        }
		System.out.println("Size: " + myCustomList.getSize()); //size is 22 
		System.out.println("***********");
		
		myCustomList.remove(0);
		for (int i=0; i<myCustomList.getSize(); i++) {
            System.out.println(myCustomList.get(i)); 
        }
		System.out.println("Size: " + myCustomList.getSize()); //size is 21
	}

}
