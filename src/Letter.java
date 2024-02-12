import java.util.ArrayList;

public class Letter implements IDoc {
    public Letter(String key) {
        this.key = key;
    }
    private String key = "";
    private ArrayList<String> content = new ArrayList<String>();

    public String getKey() {
        return this.key;
    }

    @Override
    public void create(String item) {
        this.content.add(item);
    }

    @Override
    public ArrayList<String> read() {
        return this.content;
    }

    @Override
    public void update(int index, String item) {
        this.content.set(index, item);
    }

    @Override
    public void delete(int index) {
        this.content.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (String item : this.content) {
            result.append(" ").append(item);
        }

        return result.toString();
    }
}
