public class Prog1
{
public static void main(String args[])
{


CustomPQ q = new CustomPQ();

q.enqueue( 100 , 5 );    //sets up:  1000 , 99 , 100 , 80 , 101 , 80
q.enqueue( 101 , 10 );   //            1     1    5     6    10   10
q.enqueue( 80 , 10 );
q.enqueue( 80 , 6 );
q.enqueue( 1000 , 1 );
q.enqueue( 99 , 1 );     //ex: item's info is 99, p is 1


for (int i=1; i<=6; i++)
{
   int r = q.dequeue();
   System.out.println(r);
}


}
}
/**
 * PROGRAM'S CORRECT OUTPUT IS:
----------------------------

1000
99
100
80
101
80

 */