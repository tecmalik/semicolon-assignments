package dsa;

public class MySet {

     private int size = 0;
    MyArrayList myArrayList = new MyArrayList();

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void add(String element) {
        if(myArrayList.contains(element)){
            return ;
        }
            myArrayList.add(element);
            this.size++;
    }

    public int size() {
        return this.size;
    }

    public void clear() {

        myArrayList.clear();
        this.size = 0;
    }


    public boolean contains(String element){
        if(myArrayList.contains(element)){
            return true;
        }
        return false;
    }

    public void removeAll() {
        myArrayList.clear();
        this.size = 0;
    }

    public int get(String element) {
        if(myArrayList.contains(element)){
            return myArrayList.getIndexOf(element);
        }
        return -1;
    }
}
