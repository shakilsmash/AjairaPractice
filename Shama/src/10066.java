import java.util.Scanner;
class UVA10066{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int count = 0;
    while(true){
      count++;
      int s1 = sc.nextInt();
      int s2 = sc.nextInt();
      if(s1 == 0 && s2 == 0){
        break;
      }
      System.out.println("a1 && a2");
      int[] a1 = new int[s1];
      int a2[] = new int[s2];
      for(int i = 0; i < s1; i++){
        a1[i] = sc.nextInt();
      }
      for(int i = 0; i < s2; i++){
        a2[i] = sc.nextInt();
      }
      LCS66 lcs = new LCS66(a1, a2);
      lcs.setMatrix();
      System.out.println("Twin Towers #" + count);
      System.out.println("Number of Tiles : " +lcs.a[a1.length][a2.length]);
      System.out.println();
    }
  }

}
class LCS66{
  int[] s1;
  int[] s2;
  int[][] a;
  public LCS66(int[] s1, int[] s2){
    this.s1 = s1;
    this.s2 = s2;
    a = new int[s1.length+1][s2.length+1];
  }
  public void setMatrix(){
    int c1 = 0;
    int c2 = 0;
    for(int i = 1; i < a.length; i++){
      for(int j= 1; j < a[0].length; j++){
        if(s1[i-1] == s2[j-1]){
          a[i][j] = a[i-1][j-1] +1;
        } else {
          int max = Math.max(a[i-1][j],a[i][j-1]);
          a[i][j] = max;
        }
        c2++;
      }
      c1++;
    }
  }
}