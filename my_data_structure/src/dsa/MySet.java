package dsa;

public class MySet {

     private boolean isEmpty;
     private int size = 0;

    public boolean isEmpty() {
        return size==0;
    }

    public void add(String element) {
        MyArrayList myArrayList = new MyArrayList();
        if(myArrayList.contains(element) == false){
            myArrayList.add(element);
            size++;
        }
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.clear();
        this.size = 0;
    }

}
