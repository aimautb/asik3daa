🚦 Assignment 3 — City Transportation Network Optimization
👨‍💻 Student Info

Name: Aimaut Bolatkhanuly
Group: SE-2407
Course: Design and Analysis of Algorithms
Instructor: Khaimuldin Nursultan

🎯 Objective

Implement Prim’s and Kruskal’s algorithms to find the Minimum Spanning Tree (MST) of a city network — connecting all districts with the lowest possible total road cost.

🧩 Project Structure
src/
 ├─ main/
 │   ├─ java/org/example/
 │   │   ├─ Main.java
 │   │   ├─ algorithms/{PrimAlgorithm,KruskalAlgorithm}.java
 │   │   ├─ models/{Edge,Graph}.java
 │   │   └─ util/{JSONReader,JSONWriter}.java
 │   └─ resources/{ass_3_input.json, ass_3_output.json}
 ├─ pom.xml
 └─ README.md

⚙️ Algorithms
Algorithm	Idea	Complexity
Prim’s	Expands MST from a starting vertex using a priority queue	O(E log V)
Kruskal’s	Sorts edges and joins components using DSU	O(E log E)
📂 Input / Output

Input: src/main/resources/ass_3_input.json
Output: src/main/resources/ass_3_output.json (auto-generated)

🧠 Comparison
Criteria	Prim	Kruskal
Works better for	Dense graphs	Sparse graphs
Data structure	Priority Queue	Disjoint Set
MST cost	✅ Identical	✅ Identical
▶️ Run Instructions
mvn clean compile
mvn exec:java -Dexec.mainClass="org.example.Main"

📊 Conclusion

Both algorithms produce the same MST cost.
Prim’s is faster for dense graphs, while Kruskal’s is simpler and more efficient for sparse ones.

Version: 1.0.0 — Final Submission
✅ Implemented full MST optimization with JSON I/O and algorithm comparison.
