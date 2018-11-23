import java.util.ArrayList;

public class Field {
    private ArrayList lines;
    private ArrayList cols;
    private String name;

    public Field(String name, String filename, String value){
        this.name = name;
        find(filename, value);
    }

    public ArrayList getCols() {
        return cols;
    }

    public ArrayList getLines() {
        return lines;
    }

    public void find(String filename, String value){
    }

    public void addNew(int line, int col){
        lines.add(line);
        cols.add(col);
    }
}
