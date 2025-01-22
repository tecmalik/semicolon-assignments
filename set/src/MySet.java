
public class MySet {
    private String[] elements = new String[5] ;
    private int size = 0;


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean add(String element) {
        this.elements[size] = element;
        size++;
        return true;
    }

    public void remove(String hello) {
        for(int index = 0; index < elements.length; index++){
            if(this.elements[size].equals(hello)){ this.elements[size] = null;
                size--;
                break;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(String element) {
        for(String element : elements) {
            return true;
        }
        return false;
    }
}