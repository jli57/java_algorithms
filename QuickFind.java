public class QuickFind {

  private int[] ids;

  public QuickFind(int n) {
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

 // constant time
  public boolean connected(int p, int q) {
    return ids[q] == ids[q];
  }


  public static void main(String[] args) {
    for (String str: args) {
      System.out.println(str);
    }
    // System.out.println(args.parseInt());
    QuickFind qf = new QuickFind(2);
    for ( int i = 0; i < qf.ids.length; i++ ) {
      System.out.println(qf.ids[i]);
    }
  }

}