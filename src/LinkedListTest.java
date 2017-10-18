
public class LinkedListTest {
	public static LinkedList testList;
	public static void main(String[] args) 
	{
				// Default constructor - let's put "0" into head element.
				testList = new LinkedList();

				// add more elements to LinkedList
				testList.addElement(1);
				testList.addElement(2);
				testList.addElement(3);
				System.out.println(testList.getElement(1));
				testList.deleteListElement(2);
				testList.forwardPrint();
				testList.backwardPrint();
	}

}
