
public class MySet {
    private String[] elements = new String[5] ;
    private int size = 0;


    public boolean isEmpty() {
        return size == 0;
    }


    public boolean add(String element) {

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
        for(String eachElement : elements) {
            if(element.equals(eachElement)){
                return true;
            }
        }
        return false;
    }

    public String get(int index) {
        if(index > 0 || index < size) {
            return this.elements[index];
        }
        return null;
    }
}