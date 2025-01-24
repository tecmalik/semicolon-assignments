package dsa;

public class MyHashMap {

    MyArrayList myList = new MyArrayList();
    MySet mySet = new MySet();
    private int size = 0;

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void put(String key, String value) {
        mySet.add( key );
        myList.add(value);
        this.size++;
    }

    public String get(String key) {
        if(mySet.contains(key)){
            return myList.get((mySet.get(key)));
        }
        return null;
    }

    public int size() {
        return this.size;
    }

    public void clear() {
        myList.clear();
        mySet.clear();
        this.size = 0;
    }

}
