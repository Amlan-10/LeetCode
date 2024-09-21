import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockingTree {
    int[] locked, par;
    List<Integer>[] adj;
    Lock mtx = new ReentrantLock(); // Lock for thread safety

    @SuppressWarnings("unchecked")
    public LockingTree(int[] parent) {
        int n = parent.length;
        locked = new int[n];
        par = new int[n];
        adj = new ArrayList[n];
        
        // Initialize arrays and lists
        for (int i = 0; i < n; i++) {
            locked[i] = -1;
            adj[i] = new ArrayList<>();
        }

        par[0] = -1;  // root has no parent
        for (int i = 1; i < n; i++) {
            adj[parent[i]].add(i);
            par[i] = parent[i];
        }
    }

    public boolean lock(int num, int user) {
        mtx.lock();  // Lock for thread safety
        try {
            if (locked[num] != -1) return false;
            locked[num] = user;
            return true;
        } finally {
            mtx.unlock();
        }
    }

    public boolean unlock(int num, int user) {
        mtx.lock();  // Lock for thread safety
        try {
            if (locked[num] == -1 || locked[num] != user) return false;
            locked[num] = -1;
            return true;
        } finally {
            mtx.unlock();
        }
    }

    public boolean checkDescendant(int node) {
        mtx.lock();  // Lock for thread safety
        try {
            if (locked[node] != -1) return true;
            for (int child : adj[node]) {
                if (checkDescendant(child)) return true;
            }
            return false;
        } finally {
            mtx.unlock();
        }
    }

    public void unlockAllDescendants(int node) {
        mtx.lock();  // Lock for thread safety
        try {
            if (locked[node] != -1) locked[node] = -1;
            for (int child : adj[node]) {
                unlockAllDescendants(child);
            }
        } finally {
            mtx.unlock();
        }
    }

    public boolean upgrade(int num, int user) {
        mtx.lock();  // Lock for thread safety
        try {
            // Check if any ancestors are locked
            for (int node = num; node != -1; node = par[node]) {
                if (locked[node] != -1) return false;
            }

            // Check if any descendants are locked
            if (!checkDescendant(num)) return false;

            // Unlock all descendants
            unlockAllDescendants(num);

            // Lock the current node
            locked[num] = user;
            return true;
        } finally {
            mtx.unlock();
        }
    }
}
// ```

// ### Explanation:
// 1. **Thread Safety**: We use the `ReentrantLock` in Java, which is functionally similar to C++'s `std::mutex`.
// 2. **Lock Mechanism**: For ensuring thread safety, the `mtx.lock()` and `mtx.unlock()` methods are used to wrap critical sections of the code, ensuring that only one thread at a time can access or modify shared data.
// 3. **Array Initialization**: In Java, `ArrayList` is used instead of `std::vector` for adjacency lists. We use `@SuppressWarnings("unchecked")` to handle generic array creation.