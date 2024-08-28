public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.add_edge(0, 1);
        graph.add_edge(1, 2);

        graph.add_edge(3, 4);

        printArray(graph.calcPath());
    }
    public static void printArray (int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
