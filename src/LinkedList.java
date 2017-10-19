
public class LinkedList 
{
	private ListElement head;
	private ListElement tail;
	public static int counter;
	//Empty Constructor
	public LinkedList() 
	{
		 
	}
	//Checks to see if the list is empty. This is a helper function for addElement
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	//Add element function
	public void addElement(int  data)//add elements in the list
	{
	    ListElement newElement = new ListElement(data);
	    if (isEmpty()) {
	        head = newElement;
	        tail = newElement;
	    }
	    else {
	        newElement.setPrev(tail);
	        tail.setNext(newElement);
	        tail = newElement;
	    }
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
	public boolean deleteListElement(int index) 
	{
		 int i =0;
		// if the index is out of range, exit
		if (index < 1 || index > counter)
			return false;
		
		//Starts at head and iterates through list
		for (ListElement current = head.getNext(); current != head; current= current.getNext())
		{
			if (i == index)
			{
				ListElement prev = current.getPrev();
				ListElement next =current.getNext();
				prev.setNext(next);
				next.setPrev(prev);
			}
			i ++;
		}
		return true;
	}

	public void forwardPrint()
	{
		   System.out.print("List (head-->tail): ");
		ListElement temp = head;
		while (temp != null)
		{
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}
	
	public void backwardPrint()
    {
    System.out.print("List (tail-->head): ");
    ListElement temp = tail;           // start at end
    while(temp != null)         // until start of list,
       {
      System.out.println(temp.getData());      // display data
       temp = temp.getPrev(); // move to previous link
       }
    System.out.println("");
    }

}
