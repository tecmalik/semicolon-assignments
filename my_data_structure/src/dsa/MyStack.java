package dsa;

public class MyStack {
    private String[] element = new String[5];
    private int size = 0 ;

    public boolean isEmpty() {
        return size == 0;
    }
    public void push(String element ) {
        this.element[size] = element;
        size++;
    }
    public String peek(){
        return this.element[size-1];
    }
    public String pop(){
        String temp = null;
        temp = this.element[size-1];
        this.element[size-1] = null;
        size--;
        return temp;
    }

    public int size() {
        return this.size;
    }


    public int search(String element) {
        int dummyValue = -1;
        for (int index = 0; index < size; index++) {
            if (this.element[index].equals(element)) {
                return index;
            }
        }
        return dummyValue;
    }
}
