import java.util.LinkedList;

public class ThreadSafeLinkedList {

    private LinkedList<Integer> list;
    private Object lock;

    public ThreadSafeLinkedList(){
        this.list = new LinkedList<>();
        this.lock = new Object();
    }

    public void addAtPosition(int index, int element){
        synchronized (lock){
            list.add(index, element);
        }
    }

    public void removeAtPosition(int index, int element){
        synchronized(lock){
            list.remove(index);
        }
    }

    public int getFirst(){
        synchronized(lock){
            return list.getFirst();
        }
    }

    public int getLast(){
        synchronized (lock){
            return list.getLast();
        }
    }

    public int size(){
        synchronized (lock){
            return list.size();
        }
    }

    public void print(){ // for test
        System.out.println(this.list);
    }
}
