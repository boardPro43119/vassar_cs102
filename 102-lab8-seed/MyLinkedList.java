/**
 * A class that implements the list interface using a linked list of nodes.
 *
 * @author
 * @version
 */
public class MyLinkedList implements IList{
    /* the first node in the linked list */
    private Node headNode;
    
    public void add(Object o){
        Node curr = headNode;
        Node newNode = new Node(o);
        while(curr != null && curr.getNext() != null){
            curr = curr.getNext();
        }
        if(curr != null)
            curr.setNext(newNode);
        if(headNode ==  null)
            headNode = newNode;
    }
    
    public boolean add(Object o, int idx){
        Node curr = headNode;
        Node prev = null;
        Node newNode = new Node(o);
        int count = 0;
        
        if((idx < 0) || (idx > getLength()))
            return false;
  
        while(count < idx){
            prev = curr;
            curr = curr.getNext();
            count++;
        }        
        
        newNode.setNext(curr);
        if(prev != null)
            prev.setNext(newNode);
        if(idx == 0)
            headNode = newNode;
            
        return true;
        
    }
    
    public Object remove(int idx){
        Node curr = headNode;
        Node prev = null;
        int count = 0;
        if((idx < 0) || (idx >= getLength()))
            return null;
        while(count < idx){
            prev = curr;
            curr = curr.getNext();
            count++;
        }        
        
        if(prev != null)
            prev.setNext(curr.getNext());
        if(idx == 0)
            headNode = curr.getNext();
        curr.setNext(null);
        return curr.getValue();
    }
    
    public Object get(int idx){
        Node curr = headNode;
        if((idx < 0) || (idx >= getLength()))
            return null;
        while(idx > 0){
            curr = curr.getNext();
            idx--;
        }        
        
        return curr.getValue();
    }

    public int find(Object o){
        int idx = 0;
        Node curr = headNode;
        
        while(curr != null){
            if(curr.getValue().equals(o)){
                return idx;
            }
            curr = curr.getNext();
            idx++;
        }
        
        return -1;
    }

    public int getLength(){
        Node curr = headNode;
        int length = 0;
        while(curr != null){
            curr = curr.getNext();
            length++;
        }
        
        return length;
    }

    /**
     * Returns a String representation of the list elements.
     *
     * @return the string representation of the list.
     */
    public String toString(){

        String s = "{";

        for(Node cur = headNode; cur != null; cur = cur.getNext()){
            s += cur.getValue();
            if (cur.getNext() != null)
                s += ", ";
        }
        
        return s + "}";
    }
}
