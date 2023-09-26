import java.util.ArrayList;

public class Generic<T> {
    protected ArrayList<T> elementList;

    public void add(T b){
        this.elementList.add(b);
    }

    public void remove(T b){
        this.elementList.remove(b);
    }

    public void clear(T b){
        this.elementList.clear();
    }
}
