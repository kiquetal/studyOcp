#The go' ol blocking stuff
===

(http://docs.oracle.com/cd/E19455-01/806-5257/6je9h032b/index.html), parallelism
is “a condition that arises when at least two threads are executing simultaneously.” In
contrast, concurrency is “a condition that exists when at least two threads are making
progress. [It is a] more generalized form of parallelism that can include time-slicing as a
form of virtual parallelism.”


====
## Methods Object

 public final wait() throws IE

 public final finalize() throws IE

 public String toString()

 public final void notifyAll()  
                                   >   IllegalMonitorException 	if the current thread is not the owner of this object monitor.

                                   >  A thread becomes the owner when:
       
                                   >       Executing a synchronized instance method of that object.

                                   >       By executing the body of a synchronized statement that synchronize on object.

				   >	  For objects of type Class, by executing a synchronized static method of the class. 

 public final void notify()

+ **Item 1**:
   
  * Create and use the Thread class and the Runtime interface.
 
  * Defining and Starting a Thread

+ **Item 2:**
  
   * Manage and control thread lifecycle.

     By default the threads associated with Threads Objects are nondaemon threads.
   
     A program only end when all the nondaemon thread finished. A program with only daemons thread finish as soon the default main thread ends. 
 

     States:
     
     NEW: A thread that has not yet started in this state
  
     RUNNABLE:Ready to be selected by the scheduler.

     BLOCKED: Waiting for a monitor locks is in this state

     WAITING: A thread that is waiting	indefinitely for another thread to perform a particular action is in this state.

     TIMED_WAITING: A thread waiting for another thread to perform an action for up to a specified waiting time is in this state.

     TERMINATED: A thread that has exited is in this state.
     

   * Pausing Execution with Sleep
 
   * Interrupts

   * Joins

+ **Item 3**:
  
  * Synchronize thread access to shared data.
  
  * Synchronization
  
  * Thread Interference
  
  * Synchronized Methods
  
  * Intrinsic Locks and Synchronization

+ **Item 4:**
  
  * Identify potential threading problems.
  
  * Memory Consistency Errors
  
  * Deadlock

## CheckedExceptions

+  java.lang.InterruptedException
  
