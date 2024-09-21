import java.util.*;

public class LockingTree {
    int[] locked, par;
    List<Integer>[] adj;
    Lock lock = new ReentrantLock(); // Lock for thread safety

    // @SuppressWarnings("unchecked")
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
        lock.lock();  // Lock for thread safety
        try {
            if (locked[num] != -1) return false;
            locked[num] = user;
            return true;
        } finally {
            lock.unlock();
        }
    }

    public boolean unlock(int num, int user) {
        lock.lock();  // Lock for thread safety
        try {
            if (locked[num] == -1 || locked[num] != user) return false;
            locked[num] = -1;
            return true;
        } finally {
            lock.unlock();
        }
    }

    public boolean checkDescendant(int node) {
        lock.lock();  // Lock for thread safety
        try {
            if (locked[node] != -1) return true;
            for (int child : adj[node]) {
                if (checkDescendant(child)) return true;
            }
            return false;
        } finally {
            lock.unlock();
        }
    }

    public void unlockAllDescendants(int node) {
        lock.lock();  // Lock for thread safety
        try {
            if (locked[node] != -1) locked[node] = -1;
            for (int child : adj[node]) {
                unlockAllDescendants(child);
            }
        } finally {
            lock.unlock();
        }
    }

    public boolean upgrade(int num, int user) {
        lock.lock();  // Lock for thread safety
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
            lock.unlock();
        }
    }
}
