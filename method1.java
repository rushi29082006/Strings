import java.util.Scanner;
class method1{
    static int[][] som(int j,int k,int i ,int m,int n,int g){
        return new int[][] {{j,k,i},{m,n,g}};
    }
    static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int j= s.nextInt();
        int k = s.nextInt();
        int i = s.nextInt();
        int m = s.nextInt();
        int n = s.nextInt();
        int g = s.nextInt();
        int[][] nom=som(j,k,i,m,n,g);
        for(int[] q:nom){
            for(int f:q){
                System.out.println(f);
            }
        }

    }
}