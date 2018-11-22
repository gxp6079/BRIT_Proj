import java.util.ArrayList;

public class Field {
    private ArrayList lines;
    private ArrayList cols;

    public Field(ArrayList<Integer> lines, ArrayList<Integer> cols){
        this.lines = lines;
        this.cols = cols;
    }

    public ArrayList getCols() {
        return cols;
    }

    public ArrayList getLines() {
        return lines;
    }

    public void addNew(int line, int col){
        lines.add(line);
        cols.add(col);
    }
}
