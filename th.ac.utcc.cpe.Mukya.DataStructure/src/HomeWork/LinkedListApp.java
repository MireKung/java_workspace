package	HomeWork;
import java.util.*;
public class LinkedListApp {

	public LinkedListApp() {	
		}
	
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		Scanner input = new Scanner(System.in);
		DataItem item1 = new DataItem(input.nextLine(),input.nextDouble());
		DataItem item2 = new DataItem("Physics I", 3.5);
		DataItem item3 = new DataItem("English", 3.0);
		DataItem item4 = new DataItem("Thai", 2.5);
		
		linkedList.insertFirst(item1);
		linkedList.insertFirst(item2);
		linkedList.insertFirst(item3);
		linkedList.insertFirst(item4);

		linkedList.displayList();
		
		linkedList.deleteFirst();
		System.out.println("\nAfter deleteFirst()#1");
		linkedList.displayList();
		
		linkedList.deleteFirst();
		System.out.println("\nAfter deleteFirst()#2");
		linkedList.displayList();
	}

}
