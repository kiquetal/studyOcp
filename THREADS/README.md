#The go' ol blocking stuff
===

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
