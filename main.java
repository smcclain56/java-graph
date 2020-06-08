public class main {
    public static void main(String args[]){
        Graph g = new Graph();
        g.addVertex("a");
        g.addVertex("b");
        g.addVertex("c");
        g.addVertex("d");
        g.addEdge("a", "b");
        g.addEdge("a", "d");
        g.addEdge("c", "d");
        System.out.println((g.toString()));
    }
}
