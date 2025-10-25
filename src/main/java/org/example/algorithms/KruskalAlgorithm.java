package org.example.algorithms;

import org.example.models.Edge;
import org.example.models.Graph;
import java.util.*;

public class KruskalAlgorithm {
    static class DisjointSet {
        private final Map<String, String> parent = new HashMap<>();

        void makeSet(List<String> nodes) {
            for (String node : nodes) parent.put(node, node);
        }

        String find(String node) {
            String p = parent.get(node);
            if (p == null) return null;
            if (!p.equals(node))
                parent.put(node, find(p));
            return parent.get(node);
        }

        void union(String a, String b) {
            String rootA = find(a);
            String rootB = find(b);
            if (rootA == null || rootB == null) return;
            if (!rootA.equals(rootB))
                parent.put(rootA, rootB);
        }
    }

    public static Map<String, Object> run(Graph graph) {
        long start = System.currentTimeMillis();
        int operations = 0;

        List<Edge> mst = new ArrayList<>();
        DisjointSet ds = new DisjointSet();
        ds.makeSet(graph.nodes);

        List<Edge> sortedEdges = new ArrayList<>(graph.edges);
        Collections.sort(sortedEdges);

        for (Edge edge : sortedEdges) {
            String rootA = ds.find(edge.from);
            String rootB = ds.find(edge.to);
            operations++;

            if (rootA == null || rootB == null) continue;

            if (!rootA.equals(rootB)) {
                mst.add(edge);
                ds.union(rootA, rootB);
                operations++;
            }

            if (mst.size() == graph.nodes.size() - 1)
                break;
        }

        long end = System.currentTimeMillis();
        int totalCost = mst.stream().mapToInt(e -> e.weight).sum();

        Map<String, Object> result = new HashMap<>();
        result.put("mst_edges", mst);
        result.put("total_cost", totalCost);
        result.put("operations_count", operations);
        result.put("execution_time_ms", (end - start));
        return result;
    }
}
