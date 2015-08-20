import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()){
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      LCS lcs = new LCS(s1, s2);
      lcs.setMatrix();
      System.out.println(lcs.a[s1.length()][s2.length()]);
    }
  }
}
class LCS{
  String s1;
  String s2;
  int[][] a;
  public LCS(String s1, String s2){
    this.s1 = s1;
    this.s2 = s2;
    a = new int[s1.length()+1][s2.length()+1];
  }
  public void setMatrix(){
    int c1 = 0;
    int c2 = 0;
    for(int i = 1; i < a.length; i++){
      for(int j= 1; j < a[0].length; j++){
        if(s1.charAt(i-1) == s2.charAt(j-1)){
          a[i][j] = a[i-1][j-1] +1;
        } else {
          int max = (Integer) Math.max(a[i-1][j], a[i][j-1]);
          a[i][j] = max;
        }
        c2++;
      }
      c1++;
    }
  }
}