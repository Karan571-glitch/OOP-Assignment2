package utilities;

/**
 * StackADT.java
 *
 * @authors Jashanpreet Kaur
 * @version 1.0
 * 
 * <p>
 * The <code>StackADT</code> interface defines the basic operations for a stack data structure,
 * which follows the Last-In-First-Out (LIFO) principle.
 * </p>
 *
 * @param <T> The type of elements stored in the stack.
 */
public interface StackADT<T> {

    /**
     * Adds (pushes) an element onto the top of the stack.
     * @param element the element to be added
     * @throws IllegalArgumentException if the element is null
     * Pre: element not null  
     * Post: element is added to the top
     */
    void push(T element);

    /**
     * Removes (pops) and returns the top element from the stack.
     * @return the element removed from the top
     * @throws StackUnderflowException if the stack is empty
     * Pre: stack not empty  
     * Post: top element is removed
     */
    T pop();

    /**
     * Returns (peeks) the top element without removing it.
     * @return the top element
     * @throws StackUnderflowException if the stack is empty
     * Pre: stack not empty  
     * Post: top element returned, stack unchanged
     */
    T peek();

    /**
     * Checks if the stack is empty.
     * @return true if the stack has no elements, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns the number of elements currently in the stack.
     * @return the size of the stack
     */
    int size();

    /**
     * Removes all elements from the stack.
     * Post: stack is empty
     */
    void clear();
}
