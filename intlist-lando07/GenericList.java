import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * An implementation of the List ADT using
 * a type E array.
 * 
 * @author Landon Smith
 */

public class GenericList<E> implements Iterable {

    private E[] data;
    private int size;
    private int numMods;

    /**
     * Constructs an empty GenericList with an initial capacity of ten
     */
    public GenericList() {
        data = (E[]) (new Object[10]);
        size = 0;
        numMods = 0;
    }

    /**
     * Constructs an empty GenericList with the specified initial capacity
     * 
     * @param initialCapacity the initial capacity of the list
     * @throws IllegalArgumentException if the specified initial capacity is
     *                                  negative
     */
    public GenericList(int initialCapacity) {
        if (size < 0)
            throw new IllegalArgumentException("Initial capacity cannot be negative");
        data = (E[]) new Object[initialCapacity];
        size = 0;
        numMods = 0;
    }

    /**
     * Appends the specified Object E to the end of this list
     * 
     * @param n integer to be appended to this list
     * @return boolean true
     */
    public boolean add(E n) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size] = n;
        size++;
        return true;
    }

    /**
     * Inserts the specified Object E at the specified position in this list
     * 
     * @param index index at which the specified Object E is to be inserted
     * @param n     Object E to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void add(int index, E n) {
        if (index < 0 || index > size())
            throw new IndexOutOfBoundsException(index);
        if (size == data.length)
            data = Arrays.copyOf(data, data.length * 2);
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = n;
        size++;
        numMods++;
    }

    /**
     * Removes all of the elements from this list
     */
    public void clear() {
        size = 0;
    }

    /**
     * Returns true if this list contains the specified Object E.
     * 
     * @param n Object E whose presence in this list is to be tested
     * @return true if this list contains the specified integer
     */
    public boolean contains(E n) {
        return indexOf(n) > -1;
    }

    /**
     * Returns the Object E at the specified position in this list.
     * 
     * @param index index of the Object E to return
     * @return the Object E at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E get(int index) {
        if (index >= size() || isEmpty() || index < 0)
            throw new IndexOutOfBoundsException(index);
        return data[index];
    }

    /**
     * Returns the index of the first occurrence of the specified Object E in this
     * list, or -1 if this list does not contain the Object E.
     * 
     * @param n Object E to search for
     * @return int the index of the first occurrence of the specified Object E in
     *         this list, or -1 if this list does not contain the Object E
     */
    public int indexOf(E n) {
        if (n == null) {
            for (int i = 0; i < size; i++) {
                if (get(i) == n) {
                    return i;
                }
            }
            return -1;
        }
        for (int i = 0; i < size; i++) {
            if (n.equals(get(i)))
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified Object E in this
     * list, or -1 if this list does not contain the integer.
     * 
     * @param n the Object E to search for
     * @return the index of the last occurrence of the specified element in this
     *         list, or -1 if this list does not contain the element
     */
    public int lastIndexOf(E n) {
        if (n == null) {
            for (int i = size - 1; i > -1; i--) {
                if (get(i) == n) {
                    return i;
                }
            }
            return -1;
        }
        for (int i = size - 1; i > -1; i--) {
            if (n.equals(get(i)))
                return i;
        }
        return -1;
    }

    /**
     * Returns true if this list contains no elements
     * 
     * @return true if this list contains no elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Removes the element at the specified position in this list. Shifts any
     * subsequent elements to the left (subtracts one from their indices). Returns
     * the element that was removed from the list.
     * 
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException - if the index is out of range
     */
    public E remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException(index);
        }
        E rmv = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        size--;
        numMods++;
        return rmv;

    }

    /**
     * Removes first occurence of specified element in the list if it is present,
     * if not then the list is unchanged.
     * 
     * @param e element to be removed in the list
     * @return true if element e was in the list and false if it was not
     */
    public boolean remove(E e) {
        if (e == null) {
            for (int i = 0; i < size; i++) {
                if (e == data[i]) {
                    remove(i);
                    return true;
                }
            }
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (get(i) == null)
                continue;
            if (get(i).equals(e)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * Replaces the Object E at the specified position in this list with the
     * specified Object E
     * 
     * @param index index of the element to replace
     * @param n     Object E to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundException if the index is out of range
     */
    public E set(int index, E n) {
        if (index > size())
            throw new IndexOutOfBoundsException(index);
        E prv = data[index];
        data[index] = n;
        return prv;
    }

    /**
     * Compares the specified GenericList for equality. Returns true if and only if
     * both
     * lists have the same size and all corresponding pairs of Object E in the two
     * lists are equal.
     * 
     * @param o the other GenericList to be compared for equality
     * @return true if the specified GenericList is equal to this GenericList
     */
    public boolean equals(GenericList o) {
        if (size() != o.size)
            return false;
        for (int i = 0; i < size; i++) {
            if (get(i) != o.get(i))
                return false;
        }
        return true;
    }

    /**
     * Returns the number of elements in this list. If this list contains more than
     * Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     * 
     * @return the number of elements in this list
     */
    public int size() {
        return size;
    }

    /**
     * Returns an array containing all of the elements in this list in proper
     * sequence.
     * 
     * @return an array containing the elements of this list
     */
    public E[] toArray() {
        return Arrays.copyOf(data, size);
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int index = 0;
            boolean canRemove = false;
            int currentMods = numMods;

            public boolean hasNext() {
                return index < size;
            }

            public E next() {
                if (currentMods != numMods) {
                    throw new ConcurrentModificationException();
                }
                canRemove = true;
                return get(index++);
            }

            @Override
            public void remove() {
                if (canRemove) {
                    canRemove = false;
                    GenericList.this.remove(--index);
                    currentMods++;
                } else {
                    throw new IllegalStateException();
                }
            }
        };
    }

    /**
     * Returns a string representation of this GenericList. The string
     * representation
     * consists of a list of the elements in the order they are indexed, enclosed in
     * square brackets ("[]")
     * 
     * @return a String representation of this G.enericList
     */
    @Override
    public String toString() {
        if (isEmpty())
            return "[]";
        StringBuilder str = new StringBuilder();
        str.append("[" + data[0] + ",");
        for (int i = 1; i < size - 1; i++) {
            str.append(" " + data[i] + ",");
        }
        str.append(" " + data[size - 1] + "]");
        return str.toString();
    }

}