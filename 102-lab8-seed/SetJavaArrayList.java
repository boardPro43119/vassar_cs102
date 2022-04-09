/**
 * A class that implements the set interface using a java.util.ArrayList.
 *
 * @author
 * @version
 */
import java.util.*;
public class SetJavaArrayList implements ISet{

    private ArrayList set;
    
    public SetJavaArrayList(){
        set =  new ArrayList();
    }

    public boolean add(Object o){
        if(set.indexOf(o) == -1){
            set.add(o);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean remove(Object o){
        int index = set.indexOf(o);
        if(index != -1){
            set.remove(index);
            return true;
        }
        else{
            return false;
        }
    }

    public boolean contains(Object o){
        return !(set.indexOf(o) == -1);
    }

    public int getSize(){
        return set.size();
    }

    public String toString(){
        String result = "{";
        int size = getSize();
        
        for(int i=0; i<size; i++){
            result += set.get(i);
            if(i<size-1)
                result += ", ";
        }
        
        result += "}";
        return result;
    }
}
