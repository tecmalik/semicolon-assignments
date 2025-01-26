package dsa;

public class MyHashMap {

    MyArrayList myList = new MyArrayList();
    MySet mySet = new MySet();
    private int size = 0;

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void put(String key, String value) {
        if(mySet.contains(key)){
            myList.setElement(mySet.get(key) , value);
            return;
        }
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

   /** public String[] keySet() {
        String[] keys = new String[myList.size()];
        for(int index = 0; index < mySet.size(); index++){
           // keys[index] = mySet.

        }
    }*/
}
