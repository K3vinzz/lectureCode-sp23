package lec7_lists4.DIY;

/** This is a fill in the blanks version of the SLList class
 *  in case you want to try to figure out how to write it yourself.
 *  After writing your methods, you can run the AListTest file.
 */
public class AList<Item> {

/* invariants (things that must be true):
 addLast: The next Item we want to add, will go into position size.
 getLast: The item we want to return is in position size - 1.
 size: The number of items in the list should be size.
 */
    private Item[] items;
    private int size;
    /** Creates an empty list. */
    public AList() {
        items = (Item[]) new Object[8];
        size = 0;
    }

    /*
     Define the "usage ratio" R = size / items.length;
     Typical solution: Half array size when R < 0.25.
     */
    private void resize(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** Inserts X into the back of the list. */
    public void addLast(Item x) {
        if (size == items.length){
//          resize the array by multiply
            resize(size * 2);
        }
        items[size] = x;
        size += 1;
    }

    /** Returns the item from the back of the list. */
    public Item getLast() {
        return items[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return items[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public Item removeLast() {
        Item returnItem = getLast();
        items[size - 1] = null; // Prevent from loitering
        size -= 1;
        return returnItem;
    }
} 