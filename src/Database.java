import java.util.HashMap;

public class Database {
    private HashMap<String, Tables> Tables;

    public Tables getTables(String tableName) {
        return Tables.get(tableName);
    }
}
