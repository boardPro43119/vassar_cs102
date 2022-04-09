/**
 * A class that tests out a list implementation.
 *
 * @author Rui Meireles
 * @version 1.0
 */
public class MyLinkedListTest{

    /**
     * Checks list contains integers from low+offset to high+offset, in order, at indices low to high.
     * @param list The list we're checking.
     * @param low The smallest index we're checking.
     * @param high The largest index we're checking.
     */
    private static void checkListContents(IList list, int low, int high, int offset){
        // check that all elements are there and in the proper order
        for (int i=low; i <= high; i++){
            final int val = i + offset;
            assert(list.find(new Integer(val)) == i);
            assert(list.get(i).equals(new Integer(val)));
        }
    }
  
    /**
     * Creates a list, adds integer elements from 0 to 99,
     * makes some checks.
     */
    public static void main(String[] args){

        IList list = new MyLinkedList(); // create empty list

        Integer zero = new Integer(0);
      
        assert(list.find(zero) == -1); // can't find anything on an empty list
        assert(!list.add(zero, 1)); // can't insert at index 1 because list is empty
        assert(list.add(zero, 0)); // should be able to insert at index 0

        assert(list.getLength() == 1); // list must have length 1
        assert(list.remove(0).equals(zero));
        assert(list.getLength() == 0); // list must have length 0
        list.add(zero);
        assert(list.getLength() == 1); // list must have length 0
      
        for (int i=1; i < 100; i++){
            list.add(new Integer(i));
        }

        assert(list.getLength() == 100); // list must have length 100
        checkListContents(list, 0, 99, 0); // check contents
      
        // check 51st element contains the right value
        Object fiftieth = list.get(50);
        assert(fiftieth != null);
        assert(fiftieth instanceof Integer);
        assert(((Integer)fiftieth) == 50);

        assert(list.remove(50).equals(new Integer(50))); // element at index 50 is no longer
        assert(list.getLength() == 99); // list now has length 99
      
        checkListContents(list, 0, 49, 0); // check contents
        checkListContents(list, 50, 98, 1); // check contents

        assert(!list.add(fiftieth, -1)); // can't add before the beginning
        assert(!list.add(fiftieth, 101)); // can't add beyond the list's end
      
        assert(list.add(fiftieth, 50)); // reinstate 50 in its right place
        assert(list.getLength() == 100); // back to length 100
        checkListContents(list, 0, 99, 0); // check contents
      
        assert(list.find(new Integer(200)) == -1); // 200 shouldn't be present
        assert(list.remove(200) == null); // there should be no such index to remove
      
        // remove last element
        assert(list.remove(99).equals(new Integer(99)));
        assert(list.getLength() == 99); // length should be 99
        checkListContents(list, 0, 98, 0); // check contents
      
        // remove first element
        assert(list.remove(0).equals(new Integer(0)));
        assert(list.getLength() == 98); // length should be 98
        checkListContents(list, 0, 97, 1); // check contents
      
        // add elements back
        assert(list.add(new Integer(0), 0)); // first element
        assert(list.add(new Integer(99), 99)); // last element
      
        assert(list.getLength() == 100); // list must have length 100
        checkListContents(list, 0, 99, 0); // check length and contents
      
        // remove and add back some random elements
        for (int i = 0; i < 10000; i++){
            int idx = (int) Math.random()*100;
            assert(list.remove(idx).equals(new Integer(idx)));
            assert(list.add(new Integer(idx), idx));
        }
      
        assert(list.getLength() == 100); // list must have length 100
        checkListContents(list, 0, 99, 0); // check length and contents
      
        assert(list.get(-1) == null); // no element at index -1
        assert(list.get(100) == null); // no element at index 100
      
        // print the list's contents
        System.out.printf("List contents: %s\n", list);
    }


}
