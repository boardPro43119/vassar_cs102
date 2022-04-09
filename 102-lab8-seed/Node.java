/**
 * A simple class to represent a node in a linked list.
 *
 * @author Rui Meireles
 * @version 1.0
 */
public class Node{

    /* the value stored at this node */
    private Object value;
  
    /* A reference to the next node in the list */
    private Node next;

    /**
     * Constructs a new object with the value passed in as an argument and a
     * null next reference.
     * @param value the value to store in the node
     */
    public Node(Object value){
        this.value = value;
        this.next = null; // redundant as it's null by default, here for clarity
    }

    /**
     * Constructs a new object with the value passed in as an argument and a
     * next reference to a node passed as an argument.
     * @param value the value to store in the node
     * @param next the node coming next in the list
     */
    public Node(Object value, Node next){
        this.value = value;
        this.next = next;
    }

    /**
     * Returns the value stored at this node.
     * @return the value stored at this node
     */
    public Object getValue(){
        return this.value;
    }

    /**
     * Sets the value of this node to the value passed as an argument.
     * @param value value to be stored
     */
    public void setValue(Object value){
        this.value = value;
    }

    /**
     * Returns the next reference stored at this node, which represents
     * the next node in the linked list.
     * @return the next reference stored at this node
     */
    public Node getNext(){
        return this.next;
    }

    /**
     * Sets this node's next reference, which represents the next node
     * in the linked list, to the value passed as an argument.
     * @param next next node reference to be stored in the node
     */
    public void setNext(Node next){
        this.next = next;
    }

}

