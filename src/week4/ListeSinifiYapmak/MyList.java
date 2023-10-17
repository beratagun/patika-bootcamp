package week4.ListeSinifiYapmak;

import java.util.ArrayList;

public class MyList<T> {
    private Object[] array;
    private int originalSize;

    MyList() {
        this.array = new Object[10];
        this.originalSize = 10;
    }

    MyList(int capacity) {
        array = new Object[capacity];
        this.originalSize = capacity;
    }

    public int size() {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                size++;
            }
        }
        return size;
    }

    T get(int index) {
        if (index >= array.length) {
            System.out.println("Index can't be equal or bigger the arrays length!");
            return null;
        }
        T t = (T) array[index];
        return t;
    }

    T set(int index, T t) {
        if (index >= array.length) {
            System.out.println("Index can't be equal or bigger the arrays length!");
            return null;
        }
        array[index] = t;
        return t;

    }

    public T remove(int index) {
        if (index < 0 || index >= array.length) {
            System.out.println("Index can't be equal or bigger the arrays length!");
            return null;
        }

        T t = (T) array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        return t;
    }

    public void add(T data) {
        int nullIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                nullIndex = i;
                break;
            }
        }

        if (nullIndex >= 0) {
            set(nullIndex, data);
        } else {
            Object[] tempArray = array;
            tempArray = new Object[array.length * 2];

            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            tempArray[array.length] = data;
            array = tempArray;
        }
    }

    public String toString() {
        if (array.length == 0) {
            return null;
        }
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            if (array[i] != null) {
                b.append(String.valueOf(array[i]));
            }


            if (i == iMax || array[i + 1] == null)
                return b.append(']').toString();
            b.append(", ");
        }
    }

    boolean contains(T data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    T[] toArray() {
        int size = this.size();
        Object[] tempArray = new Object[size];

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                tempArray[i] = array[i];
            }
        }
        return (T[]) tempArray;
    }


    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                return false;
            }
        }
        return true;
    }

    T clear() {
        Object[] tempArray = new Object[this.originalSize];
        array = tempArray;
        return null;
    }

    public int indexOf(T data) {


        if (array == null) {
            return -1;
        }


        int length = array.length;
        int i = 0;


        while (i < length) {


            if (array[i] == data) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        if (array == null) {
            return -1;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }


    public int getCapacity() {
        return array.length;
    }

}