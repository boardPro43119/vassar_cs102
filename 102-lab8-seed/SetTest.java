import java.util.LinkedList;
import java.lang.management.ThreadMXBean;
import java.lang.management.ManagementFactory;

/**
 * A class to test and benchamrk different set implementations.
 *
 * @author Rui Meireles
 * @version 1.0
 */
public class SetTest{
    
    /**
     * This method measures the time it takes to insert, test and remove
     * elements using multiple different set implementations.
     */
    public static void main(String[] args){
        
        // create an array of sets, each using a different implementation
        ISet sets[] = {new SetMyLinkedList(),
                       new SetJavaArrayList(),
                       new SetJavaLinkedList()};
        
        final long nelems = 50000; // number of elements to create
        
        // prepare a list with the numbers to be tested
        LinkedList<Long> containsList = new LinkedList<Long>();
        for (long i=0; i < nelems; i++)
            containsList.add(new Long(i));
        
        // create a list with the elements to be removed
        LinkedList<Long> removeList = (LinkedList<Long>) containsList.clone();
        
        // randomize order in which elements will be tested for existence and
        // then removed
        java.util.Collections.shuffle(containsList);
        java.util.Collections.shuffle(removeList);
        
        // create a timer object
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        
        System.out.printf("Now performing a %d-element set test...\n", nelems);
        
        // benchmark each set implementation
        for (ISet set : sets){
            System.out.printf("Testing %s... ", set.getClass().getSimpleName());
            
            // start timer
            long starTime = bean.getCurrentThreadCpuTime();
            
            // insert all the elements
            for (long i=0; i < nelems; i++){
                assert(set.add(new Long(i))); // must return true
                assert(!set.add(new Long(i))); // can't add again
            }
            
            assert(set.getSize() == nelems); // size check
          
            // test element existence in random order
            for (Long i : containsList)
                assert(set.contains(i)); // must return true because it's there
            
            // remove elements in random order
            for (Long i : removeList)
                assert(set.remove(i)); // must return true because it's there
            
            assert(set.getSize() == 0); // size check, set must be empty now
            
            // stop timer
            long endTime = bean.getCurrentThreadCpuTime();
            // nanosecs to secs
            double elapsedTime = (endTime - starTime)/1000000000.0;
            
            // print benchmark results
            System.out.printf(" %.3f s\n", elapsedTime);
        }
    }
}
