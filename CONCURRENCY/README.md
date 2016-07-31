
# Atomic variables
java.util.concurrent.atomic
happens-before relationships

-addAndGet
-getAndAdd

-getAndAccummulate
-accummulateAndGet


-compareAndSet


-decrementAndGet
-incrementAndGet



-getAndDecrement
-getAndIncrement

-getAndSet

-getAndUpdate
-updateAndGet

-get
-set

#Locks
java.util.concurrent.locks

void locks 
void lockInterruptibly IE
Condition newCondition
boolean tryLock

void unlock()

class= > ReentrantLock

       >ReentrantReadWriteLock

interfaces
	Locks
	ReadWriteLock

No existe

AtomicShort
AtomicByte
AtomicFloat
AtomicDouble

Executors

Interfaces

=Executor
=ExecutorService
=ScheduledExecutorService

Fork/JOIN
left.fork
right.compute
left.join




Read:
http://www.oracle.com/technetwork/articles/java/fork-join-422606.html
