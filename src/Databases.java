import java.util.HashMap;

public class Databases {
    private HashMap<String, Database> databases;

    public Database getDatabase(String dbName) {
        return databases.get(dbName);
    }
}
