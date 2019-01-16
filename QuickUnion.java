public class QuickUnion {

  private int[] ids;

  public QuickUnion(int n) {
    ids = new int[n];
    for ( int i = 0; i < n; i++ ) {
      ids[i] = i;
    }
  }

  // at at most n-1 operations
  public void union(int p, int q) {
    // For change id for p to q
    int id = ids[p];
    int prevId = ids[q];

    // found all instances of
    for( int i = 0; i < ids.length; i++ ) {
      if (ids[i] == prevId) {
        ids[i] = id;
      }
    }
  }

  // check if it's the same oot.
  public boolean connected(int p, int q) {
    return ids[q] == ids[q];
  }


  public static void main(String[] args) {
    for (String str: args) {
      System.out.println(str);
    }
    // System.out.println(args.parseInt());
    QuickUnion qf = new QuickUnion(9);
    for ( int i = 0; i < qf.ids.length; i++ ) {
      System.out.println(qf.ids[i]);
    }
  }

}