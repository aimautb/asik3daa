package org.example;

import org.example.models.Graph;
import org.example.util.JSONReader;
import org.example.util.JSONWriter;
import org.example.algorithms.PrimAlgorithm;
import org.example.algorithms.KruskalAlgorithm;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            String inputFile = "src/main/resources/ass_3_input.json";
            String outputFile = "src/main/resources/ass_3_output.json";

            List<Graph> graphs = JSONReader.read(inputFile);
            List<Map<String, Object>> results = new ArrayList<>();

            for (Graph g : graphs) {
                Map<String, Object> graphResult = new HashMap<>();
                graphResult.put("graph_id", g.id);
                graphResult.put("vertices", g.nodes.size());
                graphResult.put("edges", g.edges.size());

                Map<String, Object> primRes = PrimAlgorithm.run(g);
                Map<String, Object> kruskalRes = KruskalAlgorithm.run(g);

                graphResult.put("prim", primRes);
                graphResult.put("kruskal", kruskalRes);
                results.add(graphResult);

                System.out.println("✅ Graph " + g.id + " processed successfully!");
            }

            JSONWriter.write(results, outputFile);
            System.out.println("\n📄 Results saved to: " + outputFile);

        } catch (Exception e) {
            System.err.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
