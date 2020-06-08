# Java Directed Graph 
This repository holds an implementation of a directed graph structure in Java. This was an implementation I did for my undergraduate algorithms class in which I wrote a class that implemented the Graph interface. I used an adjacency list representation for storing the directed graph and used generics for the vertex type. 

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

# How to use
Update the code in the main class to use the directed graph structure. First start by initializing a new graph and adding vertices using the addVertex method. The current driver class then adds edges between a few vertices and prints out the adjacency list of each vertex to ensure correctness.

# Credits
My professor, America Chambers, wrote the Graph interface and gave it to me as starter code for this assignment. This was also a pair programming assignment in which I worked with my classmate, Gennie Cheatham.

