# Analytical Report: Minimum Spanning Tree Algorithms for City Transportation Optimization

**Author:** Aimaut Bolatkhanuly (SE-2407)  
**Instructor:** Khaimuldin Nursultan  
**Course:** Design and Analysis of Algorithms

## 1. Summary of Input Data and Algorithm Results

### 1.1 Input Data Analysis

**Graph 1: Medium Urban Network**

- Vertices: 5 districts (A, B, C, D, E)
- Edges: 7 potential roads
- Graph Density: Moderate (7 edges for 5 vertices)

**Graph 2: Small Urban Network**

- Vertices: 4 districts (A, B, C, D)
- Edges: 5 potential roads
- Graph Density: Relatively dense

### 1.2 Algorithm Results

**Graph 1 Results**

| Algorithm | Total Cost | Execution Time | Operations | MST Edges                  |
|-----------|------------|----------------|------------|----------------------------|
| Prim      | 16         | 0.35 ms        | 10         | A-C(3), C-B(2), B-D(5), D-E(6) |
| Kruskal   | 16         | 0.66 ms        | 27         | B-C(2), A-C(3), B-D(5), D-E(6) |

**Graph 2 Results**

| Algorithm | Total Cost | Execution Time | Operations | MST Edges              |
|-----------|------------|----------------|------------|------------------------|
| Prim      | 6          | 0.03 ms        | 6          | A-B(1), B-C(2), C-D(3) |
| Kruskal   | 6          | 0.02 ms        | 18         | A-B(1), B-C(2), C-D(3) |

## 2. Comparison Between Prim’s and Kruskal’s Algorithms

### 2.1 Efficiency Analysis

**Execution Time Comparison:**

- Graph 1: Prim (0.35 ms) vs Kruskal (0.66 ms) → Prim ≈ 1.9× faster
- Graph 2: Prim (0.03 ms) vs Kruskal (0.02 ms) → Kruskal ≈ 1.5× faster

**Operation Count Comparison:**

- Graph 1: Prim (10 ops) vs Kruskal (27 ops) → Prim ≈ 2.7× more efficient
- Graph 2: Prim (6 ops) vs Kruskal (18 ops) → Prim ≈ 3× more efficient

### 2.2 Performance Characteristics

**Prim’s Algorithm**

- **Strengths:** Superior operation efficiency; performs best on dense graphs
- **Complexity:** O(E log V) using a binary heap
- **Memory:** O(V + E) (adjacency list)
- **Implementation:** Slightly more complex due to priority queue management

**Kruskal’s Algorithm**

- **Strengths:** Simpler and efficient for sparse graphs
- **Complexity:** O(E log E) due to sorting
- **Memory:** O(E) (edge list)
- **Implementation:** Straightforward with Union-Find

### 2.3 Correctness Verification

Both algorithms produced identical total construction costs:

- Graph 1: 16
- Graph 2: 6

✅ Confirms correctness of both implementations.

## 3. Conclusions and Algorithm Preferences

### 3.1 Performance Conclusions

- **Operational Efficiency:** Prim consistently performs fewer operations (≈ 3× better).
- **Execution Time:**
    - Prim → better for larger/dense graphs
    - Kruskal → better for smaller/sparse graphs
- **Memory Usage:** Kruskal → more memory-efficient for sparse networks.

### 3.2 Algorithm Selection Guidelines

**Use Prim’s Algorithm when:**

- Graph is dense
- Efficiency and stability matter most
- Working in real-time or high-load systems

**Use Kruskal’s Algorithm when:**

- Graph is sparse
- Simplicity and clarity are priorities
- Operating under memory constraints

### 3.3 Practical Implications for City Planning

- **Urban Areas:** Prim’s algorithm provides faster, consistent performance.
- **Mixed Urban-Rural:** Hybrid approach — run both and compare.
- **Real-Time Systems:** Prim preferred for predictable runtime.
- **Resource-Constrained Environments:** Kruskal offers lower memory use.

## 4. Implementation Insights and Code Quality

### 4.1 Technical Implementation

**Strengths**

- Modular package structure (models, algorithms, util)
- JSON input/output for automation
- Time and operation metrics collection
- Efficient data structures and logic separation

**Improvements**

- Add stress-tests on large datasets
- Handle disconnected graphs
- Memory usage profiling

### 4.2 Requirement Verification

✅ Implemented both MST algorithms  
✅ Processed JSON input/output  
✅ Collected detailed metrics  
✅ Verified identical MST costs  
✅ Structured Maven project with readability and modularity

## References

- Cormen, T. H., Leiserson, C. E., Rivest, R. L., & Stein, C. (2009). *Introduction to Algorithms* (3rd ed.). MIT Press.
- Sedgewick, R., & Wayne, K. (2011). *Algorithms* (4th ed.). Addison-Wesley Professional.

Report generated based on experimental results from the implemented MST algorithms.