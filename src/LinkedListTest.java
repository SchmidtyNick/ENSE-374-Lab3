
public class LinkedListTest {
	public static LinkedList testList;
	public static void main(String[] args) 
	{
				// Default constructor - let's put "0" into head element.
				testList = new LinkedList();

				// add more elements to LinkedList
				testList.addElement(7); //Adds value 7 to index 0
				testList.addElement(5); //Adds value 5 to index 1
				testList.addElement(9); //Adds value 9 to index 2
				testList.addElement(5); //Adds value 9 to index 3
				testList.addElement(1); //Adds value 9 to index 4
				System.out.println(testList.getElement(1)); //Print out of getElement in position 1
				testList.deleteListElement(2); //Deletes list element in position 2
				testList.forwardPrint(); //Prints linked list from head to tail	
				testList.backwardPrint(); //Prints linked list from tail to head
	}

}
