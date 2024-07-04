
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class NodeGraph<T> {
    T user;
    HashSet<T> friends;

    public T getUser() {
        return user;
    }

    public void setUser(T user) {
        this.user = user;
    }

    public NodeGraph(T user) {
        this.user = user;
        friends = new HashSet<>();
    }

    public void addFriend(T friend) {
        friends.add(friend);
    }

    public HashSet<T> getFriends() {
        return friends;
    }
}
