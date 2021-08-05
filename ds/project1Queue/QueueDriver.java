public class QueueDriver
{

public static void main(String args[])
{
Queue myQueue1=new Queue();
Queue myQueue2=new Queue(new QueueNode(5,null));

System.out.println(">>myQueue1 values: "+myQueue1);
System.out.println(">>myQueue1 front: "+myQueue1.getFront());
System.out.println(">>myQueue1 end: "+myQueue1.getEnd());
System.out.println(">>myQueue2 values: "+myQueue2);
System.out.println(">>myQueue2 front: "+myQueue2.getFront());
System.out.println(">>myQueue2 end: "+myQueue2.getEnd());

myQueue1.enqueue(123);
System.out.println("myQueue1 enqueue(int value) test:  "+myQueue1);
myQueue2.enqueue(123);
System.out.println("myQueue2 enqueue(int value) test:  "+myQueue2);

System.out.println(">>myQueue1 values: "+myQueue1);
System.out.println(">>myQueue1 front: "+myQueue1.getFront());
System.out.println(">>myQueue1 end: "+myQueue1.getEnd());
System.out.println(">>myQueue2 values: "+myQueue2);
System.out.println(">>myQueue2 front: "+myQueue2.getFront());
System.out.println(">>myQueue2 end: "+myQueue2.getEnd());


System.out.println("myQueue1 toString() test:  "+myQueue1);
System.out.println("myQueue2 toString() test:  "+myQueue2);

System.out.println(">>myQueue1 values: "+myQueue1);
System.out.println(">>myQueue1 front: "+myQueue1.getFront());
System.out.println(">>myQueue1 end: "+myQueue1.getEnd());
System.out.println(">>myQueue2 values: "+myQueue2);
System.out.println(">>myQueue2 front: "+myQueue2.getFront());
System.out.println(">>myQueue2 end: "+myQueue2.getEnd());


System.out.println("myQueue1 isEmpty() test:  "+myQueue1.isEmpty());
System.out.println("myQueue2 isEmpty() test:  "+myQueue2.isEmpty());

System.out.println(">>myQueue1 values: "+myQueue1);
System.out.println(">>myQueue1 front: "+myQueue1.getFront());
System.out.println(">>myQueue1 end: "+myQueue1.getEnd());
System.out.println(">>myQueue2 values: "+myQueue2);
System.out.println(">>myQueue2 front: "+myQueue2.getFront());
System.out.println(">>myQueue2 end: "+myQueue2.getEnd());


System.out.println("myQueue1 size() test:  "+myQueue1.size());
System.out.println("myQueue2 size() test:  "+myQueue2.size());

System.out.println(">>myQueue1 values: "+myQueue1);
System.out.println(">>myQueue1 front: "+myQueue1.getFront());
System.out.println(">>myQueue1 end: "+myQueue1.getEnd());
System.out.println(">>myQueue2 values: "+myQueue2);
System.out.println(">>myQueue2 front: "+myQueue2.getFront());
System.out.println(">>myQueue2 end: "+myQueue2.getEnd());


System.out.println("myQueue1 front() test:  "+myQueue1.front());
System.out.println("myQueue2 front() test:  "+myQueue2.front());

System.out.println(">>myQueue1 values: "+myQueue1);
System.out.println(">>myQueue1 front: "+myQueue1.getFront());
System.out.println(">>myQueue1 end: "+myQueue1.getEnd());
System.out.println(">>myQueue2 values: "+myQueue2);
System.out.println(">>myQueue2 front: "+myQueue2.getFront());
System.out.println(">>myQueue2 end: "+myQueue2.getEnd());


System.out.println("myQueue1 dequeue() test:  "+myQueue1.dequeue());
System.out.println("myQueue2 dequeue() test:  "+myQueue2.dequeue());

System.out.println(">>myQueue1 values: "+myQueue1);
System.out.println(">>myQueue1 front: "+myQueue1.getFront());
System.out.println(">>myQueue1 end: "+myQueue1.getEnd());
System.out.println(">>myQueue2 values: "+myQueue2);
System.out.println(">>myQueue2 front: "+myQueue2.getFront());
System.out.println(">>myQueue2 end: "+myQueue2.getEnd());


myQueue1.enqueue(123);
System.out.println("myQueue1 enqueue(int value) test:  "+myQueue1);
myQueue2.enqueue(123);
System.out.println("myQueue2 enqueue(int value) test:  "+myQueue2);

System.out.println(">>myQueue1 values: "+myQueue1);
System.out.println(">>myQueue1 front: "+myQueue1.getFront());
System.out.println(">>myQueue1 end: "+myQueue1.getEnd());
System.out.println(">>myQueue2 values: "+myQueue2);
System.out.println(">>myQueue2 front: "+myQueue2.getFront());
System.out.println(">>myQueue2 end: "+myQueue2.getEnd());


/*
System.out.println("myQueue1 test:  "+myQueue1.);
System.out.println("myQueue2 test:  "+myQueue2.);

System.out.println("myQueue1 test:  "+myQueue1.);
System.out.println("myQueue2 test:  "+myQueue2.);

System.out.println("myQueue1 test:  "+myQueue1.);
System.out.println("myQueue2 test:  "+myQueue2.);

*/

}


}//QueueDriver