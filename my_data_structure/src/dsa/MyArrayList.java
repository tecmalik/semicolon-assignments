package dsa;

public class MyArrayList {
    private String[] elements = new String[3];
    private int size = 0;
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String item) {
        if (size == elements.length-1 ) {
        String[] newElements = new String[elements.length*2];
        for(int index = 0; index < size; index++) {
            newElements[index] = elements[index];
        }
         elements = newElements;
    }
        this.elements[size] = item ;
        this.size++;

    }

    public String get(int index) {
    return this.elements[index];
    }

    public int size() {
        return this.size;
    }

    public int getIndexOf(String element) {
        for(int index = 0; index < size; index++) {
            if(this.elements[index].equals(element)) return index;
        }
        return -1;
    }

    public boolean contains(String element) {
        for(int count = 0; count < size; count++) {
            if(this.elements[count].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void remove(String element) {
        if(this.contains(element)) {
            for(int count = 0; count < size-1; count++) {
                if(element.equals(elements[count]) && count != size-1 ) {
                    elements[count] = elements[count+1];
                    elements[count+1] = null;
                }
                else if(count == size-1) {
                    elements[count] = null;
                }
            }
            size--;
        }
    }

    public void clear() {
        for(int count = 0; count < size; count++) {
            elements[count] = null;
            size = 0;
        }
    }
}
