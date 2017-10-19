
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
	  public void addElement(int data) 
	  {
	      ListElement Temp = new ListElement(data);
	      Temp.setNext(null);
	      
	      //Checks to see if its the first element
	      if (counter == 0) 
	      {
	          Temp.setPrev(null);
	          head = Temp;
	          tail = Temp;
	      }
	      //Checks to see if there is only 1 element. head and tail are same node
	      else if (counter == 1) 
	      {
	          head.setNext(Temp);
	          tail = Temp;
	          tail.setPrev(head);
	       }
	      
	      //Else its inserted into the end of the list
	      else
	      {
	        Temp.setPrev(tail);
	        tail.setNext(Temp);
	        tail = Temp;
	      }
	      
	      //Added a print statement for testing purposes
	      System.out.println("Inserted " + data + " into the linked list");
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
	
	 public void deleteListElement(int index) 
	  {
	     if (index == 0) {
	           ListElement q = head;
	           head = q.getNext();
	           counter--;
	      }
	     
	     else
	      {
	        ListElement currNode = head;
	        for (int i = 0; i < index; i++) {
	            //Node p = currNode;
	         //   System.out.println("At this payload " + currNode.getPayload());
	            currNode = currNode.getNext();
	          //  System.out.println("Now at this payload " + currNode.getPayload());
	        }
	        ListElement temp = currNode;
	       // System.out.println("Removing the node with payload " + temp.getPayload()); 
	        currNode = temp.getPrev();
	        currNode.setNext(temp.getNext());
	        temp = null;
	        counter--;
	    }

	  }
	public void forwardPrint()
	{
		  System.out.print("List (head-->tail): "); //Start at head
		ListElement temp = head;
		while (temp != null) //Until end of list
		{
			System.out.println(temp.getData()); //Display Data	
			temp = temp.getNext(); //Move to next link
		}
	}
	
	public void backwardPrint()
    {
    System.out.print("List (tail-->head): ");
    ListElement temp = tail;           // start at end
    while(temp != null)         // Until start of list,
       {
      System.out.println(temp.getData());      // Display data
       temp = temp.getPrev(); // Move to previous Link
       }
    System.out.println("");
    }

}
