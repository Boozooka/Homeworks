import java.util.ArrayList;
import java.util.List;

public class Graph {
    private int V;
    int[][] vertices_info;
    public Graph(int V){
        this.V = V;
        vertices_info = new int[V][V];
    }
    public void add_edge (int a, int b){
        add(a, b);
        add(b, a);
    }

    private void add (int column, int value){
        for(int i = 0; i < V; i++){
            if (vertices_info[column][i] == 0){
                vertices_info[column][i] = value;
                return;
            }
        }
    }

    public int[] adjacent (int v){
        return vertices_info[v];
    }

    public int[] vertices (){
        int[] arr = new int[V];
        for (int i = 0; i <= V; i++){
            arr[i] = i;
        }
        return arr;
    }
    public int dfs ( int vertex, int mark, int[] marks){
        marks[vertex] = mark;
        int size = 1;
        for (int vv : adjacent(vertex)) {
            if (marks[vv] == 0){
                size += dfs(vv, mark, marks);
            }
        }
        return size;
    }
    public int[] calcPath() {
        int[] marks = new int[size()];
        List <Integer> markSizes = new ArrayList<>();
        for (int v = 0; v < size(); v++) {
            if (marks[v] == 0) {
                markSizes.add(markSizes.size(), dfs(v, markSizes.size() + 1, marks));
            }
        }
        int[] answer = new int[size()];
        for (int i = 0; i < size(); i++) {
            answer[i] = markSizes.get(marks[i] - 1) - 1;
        }
        return answer;
    }

    public int size (){
        return V;
    }
}
