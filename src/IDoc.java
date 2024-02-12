import java.util.ArrayList;

public interface IDoc {
    public void create(String item);
    public ArrayList<String> read();
    public void update(int index, String item);
    public void delete(int index);
}
