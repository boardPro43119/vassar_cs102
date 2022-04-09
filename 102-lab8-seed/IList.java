/**
 * An interface specifying the operations that should be supported
 * by a simple list data structure.
 *
 * @author Rui Meireles
 * @version 1.0
 */
public interface IList{

    /**
     * Appends an object to the end of the list.
     *
     * @param Object o the object to add to the list
     */
    public void add(Object o);

    /**
     * Adds a new element to the list at the index specified as an argument.
     *
     * @param  idx  the index at which the new element should be found once it
     *              has been added to the list.
     * @return true if the object was added, false if the element couldn't be
     *         added because the specified index is invalid. An index is invalid
     *         if it is not an integer in the range [0, list length).
     */
    public boolean add(Object o, int idx);

    /**
     * Removes the list element located at the index specified as an argument.
     *
     * @param idx the index at which the element to be removed resides.
     * @return the element removed or null if there is no element at that index.
     */
    public Object remove(int idx);
    
    /**
     * Returns the list element stored at the index specified as an argument.
     *
     * @param idx the index of the object to be retrieved.
     * @return the element at the specified index or null if there is no such
     * element.
     */
    public Object get(int idx);

    /**
     * Returns the index at which the object passed as an argument can be found
     * in the list. Equality is determined by the equals(Object o) method,
     * defined in the Object class.
     * If the object is present multiple times, the lowest index at which it can
     * be found is returned. If the element is not present in the list, -1 is
     * returned.
     *
     * @param o the object we're trying to find
     * @return the index of the first ocurrence of Object o, or -1 is not found.
     */
    public int find(Object o);

    /**
     * Returns the number of elements in the list.
     *
     * @return the number of elements in the list.
     */
    public int getLength();

    /**
     * Returns a String representation of the list elements.
     *
     * @return the string representation of the list.
     */
    public String toString();
}
