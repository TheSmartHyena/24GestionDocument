import java.util.HashMap;

public class Database {
    private HashMap<String, IDoc> documents = new HashMap<String, IDoc>();

    public void addDocument(String key, IDoc doc) {
        this.documents.put(key, doc);
    }

    public IDoc getDocument(String key) {
        if (this.documents.containsKey(key)) {
            return this.documents.get(key);
        }

        return null;
    }

    public void updateDocument(String key, IDoc doc) {
        this.documents.put(key, doc);
    }
}
