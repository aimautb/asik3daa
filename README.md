# 🚦 Assignment 3: Optimization of a City Transportation Network (Minimum Spanning Tree)

## 👨‍💻 Student Information

- **Name**: Aimaut Bolatkhanuly
- **Group**: SE-2407
- **Course**: Design and Analysis of Algorithms
- **Instructor**: Khaimuldin Nursultan

## 🎯 Objective

The goal of this assignment is to optimize a city’s transportation network by determining the Minimum Spanning Tree (MST) using two classical algorithms:

- **Prim’s Algorithm**
- **Kruskal’s Algorithm**

The MST ensures that all districts (vertices) are connected with the lowest total road construction cost (sum of edge weights).

## 🧩 Project Structure
asik3daa/
├─ pom.xml
├─ README.md
└─ src/
└─ main/
├─ java/
│   └─ org/example/
│       ├─ Main.java
│       ├─ algorithms/
│       │    ├─ KruskalAlgorithm.java
│       │    └─ PrimAlgorithm.java
│       ├─ models/
│       │    ├─ Edge.java
│       │    └─ Graph.java
│       └─ util/
│            ├─ JSONReader.java
│            └─ JSONWriter.java
└─ resources/
├─ ass_3_input.json
└─ ass_3_output.json

## ⚙️ Algorithms Implemented

| Algorithm          | Description                                      | Complexity    |
|--------------------|--------------------------------------------------|---------------|
| Prim’s Algorithm   | Greedy approach expanding the MST by adding the smallest edge connected to the tree | O(E log V)   |
| Kruskal’s Algorithm| Greedy approach sorting edges and merging disjoint sets using union-find | O(E log E)   |

Both algorithms produce:

- A list of MST edges
- Total MST cost
- Operation count
- Execution time (ms)

## 📂 Input / Output Format

### Input File: `src/main/resources/ass_3_input.json`

```json
[
  {
    "id": 1,
    "nodes": ["A", "B", "C", "D"],
    "edges": [
      {"from": "A", "to": "B", "weight": 4},
      {"from": "A", "to": "C", "weight": 3},
      {"from": "B", "to": "D", "weight": 2},
      {"from": "C", "to": "D", "weight": 5}
    ]
  }

Output File: src/main/resources/ass_3_output.json
Automatically generated after execution — contains results of both algorithms.
🧠 Comparison Table






























CriteriaPrimKruskalBest forDense graphsSparse graphsData structurePriority QueueDisjoint SetImplementation complexityModerateSimpleMST total cost✅ Identical✅ Identical
🧪 Running the Project


Compile the project
textmvn clean compile


Run the main class
textmvn exec:java -Dexec.mainClass="org.example.Main"


Output
Results will be printed in the console and saved to:

src/main/resources/ass_3_output.json

Example console output:
text✅ Graph 1 processed successfully!
💾 Results saved to src/main/resources/ass_3_output.json


🧱 Technologies Used

Java 17
Apache Maven
Gson (for JSON parsing)
JUnit 5 (for testing)

📊 Analysis Summary

Both Prim’s and Kruskal’s algorithms return the same MST cost.
However:

Prim’s is faster on dense graphs (when most vertices are connected).
Kruskal’s performs better on sparse graphs (few edges).


Implementation note: Prim’s uses a priority queue; Kruskal’s uses disjoint-set union (DSU).

📜 Conclusion
This project demonstrates how graph optimization algorithms can be applied to real-world problems such as transportation planning.
By comparing Prim and Kruskal, we can choose the right approach based on graph density and structure.
🧾 Project Information

Course: Design and Analysis of Algorithms
Week: 7
Instructor: Khaimuldin Nursultan
Student: Aimaut Bolatkhanuly, SE-2407

✅ Version 1.0.0 — Stable Release
Final version implementing MST optimization with full JSON I/O and algorithm comparison.