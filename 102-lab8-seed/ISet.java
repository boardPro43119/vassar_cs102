/**
 * An interface specifying the operations that should be supported
 * by a dynamic set abstract data type.
 *
 * @author Rui Meireles
 * @version 1.0
 */
public interface ISet{

    /**
     * Adds an object to the set.
     *
     * @param Object o the object to be added to the set.
     * @return true if the object was added, false if it was already present.
     */
    public boolean add(Object o);

    /**
     * Removes an object from the set.
     *
     * @param Object o the object to be removed from the set.
     * @return true if the object was removed, false if it was not present in
     * the set.
     */
    public boolean remove(Object o);

    /**
     * Checks whether the object passed as an argument is present in the set.
     *
     * @param Object o the object whose presence is to be tested.
     * @return true if the object is present in the set, false otherwise.
     */
    public boolean contains(Object o);

    /**
     * Returns the number of elements in the set.
     *
     * @return the number of elements in the set.
     */
    public int getSize();

    /**
     * Returns a String representation of the set elements.
     *
     * @return the string representation of the set.
     */
    public String toString();
}
