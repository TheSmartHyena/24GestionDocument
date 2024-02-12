public class SDatabase {
    private static Database db = null;
    public static Database getInstance() {
        if (db == null) {
            db = new Database();
        }

        return db;
    }
}
