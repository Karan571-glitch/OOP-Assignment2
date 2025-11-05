package utilities;

/**
 * QueueADT.java
 *
 * @authors Karanveer Singh
 * @version 1.0
 * 
 * <p>
 * The <code>QueueADT</code> interface defines the basic operations for a queue data structure,
 * which follows the First-In-First-Out (FIFO) principle.
 * </p>
 *
 * @param <T> The type of elements stored in the queue.
 */
public interface QueueADT<T> {

    /**
     * Adds (enqueues) an element to the rear of the queue.
     * @param element the element to add
     * @throws IllegalArgumentException if the element is null
     * Pre: element not null  
     * Post: element added at the rear
     */
    void enqueue(T element);

    /**
     * Removes (dequeues) and returns the front element from the queue.
     * @return the element removed from the front
     * @throws QueueUnderflowException if the queue is empty
     * Pre: queue not empty  
     * Post: front element removed
     */
    T dequeue();

    /**
     * Returns (peeks) the front element without removing it.
     * @return the front element
     * @throws QueueUnderflowException if the queue is empty
     * Pre: queue not empty  
     * Post: front element returned, queue unchanged
     */
    T peek();

    /**
     * Checks if the queue is empty.
     * @return true if the queue has no elements, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements currently in the queue.
     * @return the size of the queue
     */
    int size();

    /**
     * Removes all elements from the queue.
     * Post: queue is empty
     */
    void clear();
}
