/**
 * A class that implements the set interface using the linked list from the last lab.
 *
 * @author
 * @version
 */
public class SetMyLinkedList implements ISet{
    
    private MyLinkedList set;
    
    public SetMyLinkedList(){
        set =  new MyLinkedList();
    }

    public boolean add(Object o){
        if(!contains(o)){
            set.add(o, 0);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean remove(Object o){
        int index = set.find(o);
        if(index != -1){
            set.remove(index);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean contains(Object o){
        return !(set.find(o) == -1);
    }

    public int getSize(){
        return set.getLength();
    }

    public String toString(){
        return set.toString();
    }
}

