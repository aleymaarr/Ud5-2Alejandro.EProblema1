import java.util.ArrayList;

public abstract class ListaManager<T> extends SuperList{
    ArrayList<T> list = new ArrayList<T>();

    public abstract void addElement(T element);
    public abstract T removeElement(int position);
    public abstract void showElements();
    public abstract void showReversedElements();

    @Override
    public String toString() {
        String output = "-> ";

        for ( T value: list ) {
            output += value.toString() + " | ";
        }
        return output;
    }
}



}
