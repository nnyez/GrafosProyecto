
import java.util.*;

public class RecommendationEngine {
    public List<User> recommendedFriends(NodeGraph<User> node, Graph<User> graph) {
        List<User> recommendations = new ArrayList<>();

        for (NodeGraph<User> nodeGraph : graph.getNodes()) {
            User potentialFriend = nodeGraph.getUser();
            if (!node.getFriends().contains(potentialFriend) && !node.getUser().equals(potentialFriend)) {
                double similarity = calculateSimilarity(node.getUser(), potentialFriend);
                if (similarity > 0.5) {
                    recommendations.add(potentialFriend);
                }
            }
        }

        return recommendations;
    }

    private double calculateSimilarity(User user, User potentialFriend) {
        Set<String> int1 = new HashSet<>(user.getInterests());
        Set<String> int2 = new HashSet<>(potentialFriend.getInterests());
        Set<String> intersection = new HashSet<>(int1);

        intersection.retainAll(int2);

        Set<String> union = new HashSet<>(int1);
        union.addAll(int2);
        double r = (double) intersection.size() / union.size();

        return r;
    }
}
