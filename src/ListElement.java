

public class ListElement 
{
//Variables
private ListElement next;
private ListElement previous;
private int data;

//Constructor with only data element
public ListElement(int data)
{
	this.data = data;
	this.next = null;
	this.previous = null;
}
//Constructor with elements
public ListElement(int dataElement, ListElement NextElement, ListElement PreviousElement)
{
	next = NextElement;
	previous = PreviousElement;
	data = dataElement;
	
}
//Data Setter
public void setData(int data)
{
	this.data = data;
}
// Data Getter
public int getData() 
{
	return this.data;
}
//Get nextElement function
public ListElement getNext()
{
	return next;
}
//Get prevElement function
public ListElement getPrev()
{
	return previous;
}
//setNext function
public void setNext( ListElement nextValue)
{
	next = nextValue;
}
//SetPrev function
public void setPrev(ListElement prevValue)
{
	previous = prevValue;
}
}

