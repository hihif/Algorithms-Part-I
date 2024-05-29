import java.util.TreeSet;

public class SuccWithDel {
    private TreeSet<Integer> S;

    SuccWithDel(int n) {
        S = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            S.add(i);
        }
    }
    SuccWithDel(int[] s) {
        S  = new TreeSet<>();

        for (int i = 0; i < s.length; i++) {
            S.add(s[i]);
        }
    }

    public void delete(int x) {
        S.remove(x);
    }

    public int Successor(int x) {
        return S.ceiling(x);
    }

    // Tests
    public static void main(String[] args) {
        SuccWithDel s = new SuccWithDel(10);

        s.delete(3);
        System.out.println( "the successor of 5 in a deafault array == " + s.Successor(5));
    }
}