class QuickUnion {
    private int[] arr;
    private int[] sz;
    private int[] max;


    public  QuickUnion(int N) {
        arr = new  int[N];
        sz = new  int[N];
        max = new  int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = i;
            sz[i] = 1;
            max[i] = i;
        }
    }

    public int  root(int i) {
        while (i != arr[i]) {
            arr[i] = arr[arr[i]];
            i = arr[i];
        }
        return i;
    }

    public boolean  connected(int p, int q) {
        return root(p) == root(q);
    }

    public  void union(int p, int q) {
        int i = root(p);
        int j = root(q);

        if (i == j) return;
        if (sz[i] < sz[j]) { arr[i] = j; sz[j] += sz[i]; max[j] = Math.max(max[i], max[j]); }
        else { arr[j] = i; sz[i] += sz[j]; max[i] = Math.max(max[i], max[j]); }
    }
    public int  find(int i) { return max[root(i)];}

    // Tests
    public static void main(String[] args) {
        QuickUnion  uf = new QuickUnion(15);

        uf.union(1, 3);
        uf.union(1, 4);
        uf.union(2, 9);
        uf.union(9, 3);

        int max = uf.find(1);
        System.out.println("max value in the connected chain is == " + max);;
    }
}