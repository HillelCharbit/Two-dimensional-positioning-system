
//Don't change the class name

/** A class to contain a point and additional data about that point in the system. */
public class Container{
	//Don't delete or change this field;
	private Point data;
	private Container prev;
	private Container next;
	private Container inOtherList;

	//Don't delete or change this function
	public Point getData() { return data; }

	//

	public Container(Point point, Container prev, Container next){
		if (point == null)
			throw new NullPointerException("got null instead of a point.");

		this.data = point;
		this.prev = prev;
		this.next = next;
		this.inOtherList = null;
	}

	public Container(Point point){
		this(point, null, null);
	}

	public Container getPrev() { return prev; }

	public Container getNext() { return next; }

	/** @return the container that holds the same point as this container, in another list. */
	public Container getInOtherList() { return inOtherList; }

	public void setInOtherList(Container me){ this.inOtherList = me; }

	public void setNext(Container next){ this.next = next; }

	public void setPrev(Container prev){ this.prev = prev; }

	public String toString(){
		if (data == null)
			return "()";
		return this.data.toString();
	}

	public int getX(){ return this.data.getX(); }
	public int getY(){ return this.data.getY(); }

	/**
	 * Get the value of the point by a given axis.
	 * @param axis true for X, false for Y.
	 * @return the value by the given axis.
	 */
	public int getVal(boolean axis){
		return axis ? getX() : getY();
	}
}
