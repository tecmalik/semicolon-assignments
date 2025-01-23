package dsa;

public class MyStack {
    private String element;
    private int size = 0 ;

    public boolean isEmpty() {
        return size == 0;
    }
    public void add(String element ) {
        this.element = element;
        size++;
    }
    public String peek(){
        return this.element;
    }


}
