# Java Directed Graph 
This repository holds an implementation of a directed graph structure in Java. This was an implementation I did for my undergraduate algorithms class in which I wrote a class that implemented a Graph interface. I used an adjacency list representation for storing the directed graph and used generics for the vertex type. This project also includes a text-based interface that allows the user to interact with the graph structure.

# Features 
- numVertices() - returns the number of vertices in the graph
- numEdges() - returns the number of edges in the graph
- clear() - removes all vertices from the graph
- addVertex(V v) - adds a vertex to the graph
- addEdge(V u, V v) - adds an edge between vertices u and v in the graph
- getVertices() - returns a set of all vertices in the graph
- getNeighbors(V v) - returns the neighbors of v in the graph
- containsVertex(V v) - returns true if vertex v exists in the graph, false otherwise
- edgeExists(V v, V u) - returns true if an edge exists between the two vertices, false otherwise
degree(V v) - returns the degree of vertex v
toString() - returns a string representation of the graph

The text-based interface starts with an empty graph and allows the user to interact with the structure through a menu with the following five options:

1. **Option 1:** Insert a new vertex into the graph. This option asks the user to enter the name of the vertex and adds it into the graph.
2. **Option 2:** Insert a new edge into the graph. This option asks the user to enter the vertices they want the edge to start and end at 
3. **Option 3:** Show graph statistics. This options prints out the following graph statistics: number of vertices, number of edges, density, maximum degree (the vertex with the maximum degree).
4. **Option 4:** Print out the graph. This option prints out the adjacency list that makes up the directed graph.
5. **Option 5:** Quit. This option exits the program.

# Credits
My professor, America Chambers, wrote the Graph interface and gave it to me as starter code for this assignment. This was also a pair programming assignment in which I worked with my classmate, Gennie Cheatham.

