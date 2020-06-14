import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static <V> void main(String args[]){
        Graph<V> g = new Graph();
        Scanner scan = new Scanner(System.in);
        String option;
        try {
            do {
                //prints out the analyzing options for the user
                System.out.println("========================= Welcome to Directed Graph ==========================");
                System.out.println("[Option 1] Insert a new vertex into the graph");
                System.out.println("[Option 2] Insert a new edge into the graph");
                System.out.println("[Option 3] Show graph statistics");
                System.out.println("[Option 4] Print out the graph");
                System.out.println("[Option 5] Quit.");

                //prompts the user to choose an option
                System.out.println("Choose an option. (1-5)");
                option = scan.nextLine();
                if(option.equals("1")) { //insert a new vertex
                    //ask user for priority value
                    System.out.println("Enter the vertex to be added");
                    V newVertex = (V) scan.nextLine();
                    g.addVertex(newVertex);
                }else if(option.equals("2")) { //add a new edge
                    //get start node
                    System.out.println("Enter the starting vertex for the edge");
                    V startVertex = (V) scan.nextLine();

                    //get end node
                    System.out.println("Enter the ending vertex for the edge");
                    V endVertex = (V) scan.nextLine();

                    //add edge to graph
                    g.addEdge(startVertex,endVertex);

                }else if(option.equals("3")){ // print out graph statistics
                    int vertices = g.numVertices();
                    int edges = g.numEdges();
                    System.out.println("Number of nodes: " + vertices);
                    System.out.println("Number of edges: " + edges);
                    double density = (edges / (double) (vertices*(vertices-1)));
                    System.out.println("Density of the graph: " + density);
                    V maxVertex = g.maxVertex();
                    int degreeValue = g.degree(maxVertex);
                    System.out.println("Maximum degree: " + degreeValue + "(node " + maxVertex + ")");
                }else if(option.equals("4")) { //display minimum heap
                    System.out.println("Printing Directed Graph...");
                    System.out.println(g.toString());
                }else if(!option.equals("5")) {
                    System.out.println("Please enter a number 1-5.");
                }
            }while(!option.equals("5"));
            System.out.println("Exiting... bye.");
            System.exit(0);
        }catch(InputMismatchException e) {
            throw new InputMismatchException();
        }
    }
}


