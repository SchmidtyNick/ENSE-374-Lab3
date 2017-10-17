
public class LinkedList 
{
	private ListElement head;
	public static int counter;
	//Empty Constructor
	public LinkedList() 
	{
		 
	}
	//Add element function
	public void addElement(int data)
	{
		 
		// If list is empty
		if (head == null) {
			head = new ListElement(data);
		}
 
		ListElement Temp = new ListElement(data);
		ListElement Current = head;
 
		// Let's check for NPE before iterate over crunchifyCurrent
		if (Current != null) {
 
			// starting at the head node, move through the list and add at the last node
			while (Current.getNext() != null) 
			{
				Current = Current.getNext();
			}
 

			Current.setNext(Temp);
		}
 
		// Increase counter
		counter++;
	}
	
	// returns the element at the specified position in this list.
	public Object getElement(int index)

	{
		// index must be 1 or higher
		if (index < 0)
			return 0;
		ListElement Current = null;
		if (head != null) {
			Current = head.getNext();
			for (int i = 0; i < index; i++) {
				if (Current.getNext() == null)
					return null;
 
				Current = Current.getNext();
			}
			return Current.getData();
		}
		return Current;
 
	}
	
	//Delete ListElement function
	//Made this function boolean to check if the index is is in realm of the counter
	public boolean deleteListElement(int index) {
		 
		// if the index is out of range, exit
		if (index < 1 || index > counter)
			return false;
 
		ListElement Current = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (Current.getNext() == null)
					return false;
 
				Current = Current.getNext();
			}
			Current.setNext(Current.getNext().getNext());
 
			// decrement the number of elements variable
			counter--;
			return true;
 
		}
		return false;
	}
	
	public void printLinkedList()
	{
		ListElement temp = head;
		while (temp != null)
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	

}
