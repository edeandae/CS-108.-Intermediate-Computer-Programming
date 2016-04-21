
/**
PART 2. PRIORITY QUEUE, USING AN ORDERED ARRAY
----------------------------------------------

Create a CustomPQ class.
It has the usual enqueue and dequeue routines,
but, as with all priority queues, a new item can cut to the front
until it encounters an item with same or higher priority.

To keep track of the items, use an array.
Hint: Your CustomPQ objects each get an array of Items.
(For ease, assume array size 100, and assume the user will never
insert more than 100 items.  Also, you will NOT need to
use the "%" efficiency tricks from the "array queue" lectures.)


The data-tracking array must be ordered, which means:
the items in the array exactly match what the "line" looks like --
that is, the highest priority items are at the left/front of the array,
the lowest priority items are at the right/back of the array.
So, a dequeue simply takes out the front item (highest-priority item).
But, the enqueue must calculate where each new item must get inserted
into the array, then must shift the array's items to fit it there.

When a Prog1 tester program uses the priority queue's enqueue,
the Prog1 will specify the item to insert by using two int properties
as parameters, NOT by creating an Item object:
an int parameter for the info, and an int parameter for the p.
See sample Prog1 below.

When a Prog1 tester program uses the priority queue's dequeue,
it will get the proper item's info, NOT the priority p.
See sample Prog1 below.

 */
public class Item
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
