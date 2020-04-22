import java.util.ArrayList;
import java.util.HashMap;

public class Tables {
    private String tableName;
    private int rows;
    private HashMap<String, String> column;
    private HashMap<String, String> row;
    private ArrayList<ArrayList<String>> data;

    public Tables(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public String getColumn(String key) {
        return column.get(key);
    }

    public String getRow(String id) {
        return row.get(id);
    }

    public ArrayList<ArrayList<String>> getData() {
        return data;
    }

    public int getRows() {
        return rows;
    }

}
