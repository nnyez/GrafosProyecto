

import java.util.*;

/**
 * Graph
 */
public class Graph<T> {

    private HashSet<NodeGraph<T>> nodes;

    public HashSet<NodeGraph<T>> getNodes() {
        return nodes;
    }

    public Graph() {
        nodes = new LinkedHashSet<>();
    }

    public void addNode(NodeGraph<T> node) {
        nodes.add(node);
    }

    public void addConnection(NodeGraph<T> node1, NodeGraph<T> node2) {
        node1.addFriend(node2.getUser());
        node2.addFriend(node1.getUser());// grafos no dirigidos
    }

    public List<T> getFriends(NodeGraph<T> node) {
        return node.getFriends();
    }

    // public List<T> recommendedFriends(NodeGraph<T> node) {
    // }

    public void printGraph() {
        for (NodeGraph<T> nod : nodes) {
            System.out.print("Vertex " + nod.getUser() + ":");
            for (T neightbor : nod.getFriends()) {
                System.out.print(" -> " + neightbor);
            }
            System.out.println();
        }
    }
}