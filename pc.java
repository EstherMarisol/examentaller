public class pc {
    public static void main (String []args ){
        int matriz [][]= new int [5][5];

        for (int i=1; i<5;i++){
            System.out.println("Esta es nuestra matriz");
            for (int j=1; j<5;j++){
                matriz [i][j]=j*2;
                System.out.print(matriz[i][j]+" ");
            }
        }
        for (int i=1; i<5;i++){
            System.out.println();
            for (int j=1; j<5;j++){
                matriz [i][j]=j*2;
                System.out.print(matriz[i][j]+" ");
    }
}
