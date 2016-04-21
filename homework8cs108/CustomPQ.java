
/**
PART 1. CREATE A PRIORITY QUEUE "ITEM" CLASS
--------------------------------------------

An item in a "priority queue" has two things:
* the data
* a priority value

Create an Item class, which has two instance variables (properties):

* info -- of type int (int for ease)
* p -- priority, of type int.
  Priority values are 1-10, with lower numbers = higher priority.
  (For ease, you do NOT need to enforce the legal range, 1-10,
  you can assume that Prog1 testers will always use legal ranges.)

The Item class has a compareTo routine, to make comparisons easier:

* compareTo -- compares Item priorities.
  Specifically, obj1.compareTo(obj2) will return:

  * -1 if obj1 is "LESS THAN" obj2, as per Java's rules,
    but "less than" IN TERMS OF PRIORITY (so, its p has a HIGHER int value).

  * 0 if obj1 is "equal to" obj2, meaning their priority p's are equal.

  * 1 if obj1 is "GREATER THAN" obj2, as per Java's rules,
    but "greater than" IN TERMS OF PRIORITY (so, it's p has LOWER int value).


NOTE: DO NOT USE ARRAYS.SORT FOR HW8 --
      *YOU MUST CODE THE PROPER INSERTIONS!
      The compareTo is just to assist you with that task.
 */
public class CustomPQ
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CustomPQ
     */
    public CustomPQ()
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


