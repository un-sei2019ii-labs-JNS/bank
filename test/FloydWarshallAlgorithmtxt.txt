/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package floydwarshallalgorithm;

/**
 *
 * @author Juan David Correa
 */
//Algorithm to find the shortest path between two nodes (any pair of nodes), from the adjacency matrix
public class FloydWarshallAlgorithm {

    /**
     * @param args the command line arguments
     */
        //static int inf=Integer.MAX_VALUE;
        static char[][]MatPath;
        //Define 1000 as Infinite

	public static void main(String[] args) {
	int MatAd [][]= { { 0, 1000, 5, 20 }, { 10, 0, 40, 1000 }, { 1000, 1000, 0, 10},{ 1000, 6, 1000, 0}};
        MatPath= new char[MatAd.length][MatAd.length];
        System.out.println("Adjacency Matrix");
	printMatrixInt(MatAd);
	System.out.println("Shortest Path Matrix.");
	printMatrixInt(FloydWarshall(MatAd));
	System.out.println("Path Matrix");
	printMatrixChar(MatPath);
        
	}

	public static int[][] FloydWarshall(int[][] MatAd) {
            for(int k=0;k<MatAd.length;k++){
                for(int i=0;i<MatAd.length;i++){
                    for(int j=0;j<MatAd.length;j++){
                        if(MatAd[i][k]+MatAd[k][j]<MatAd[i][j]){
                            MatAd[i][j]=MatAd[i][k]+MatAd[k][j];                           
                            MatPath[i][j]=(char)(k+65);                          
                        }
                        
                        if(MatAd[i][j]==0){
                           MatPath[i][j]='-'; 
                        }
                    }
                }
            }
            return MatAd;		
	}


	public static void printMatrixInt(int[][] Matrix) {
            System.out.print("\n\t");
		for (int j = 0; j < Matrix.length; j++) {
			System.out.print((char)(j+65) + "\t");
		}
		System.out.println();
		for (int j = 0; j < (Matrix.length*9); j++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < Matrix.length; i++) {
			System.out.print((char)(i+65) + " |\t");
			for (int j = 0; j < Matrix.length; j++) {                             
				System.out.print(Matrix[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
        
        public static void printMatrixChar(char[][] Matrix) {
            System.out.print("\n\t");
		for (int j = 0; j < Matrix.length; j++) {
			System.out.print((char)(j+65) + "\t");
		}
		System.out.println();
		for (int j = 0; j < (Matrix.length*9); j++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < Matrix.length; i++) {
			System.out.print((char)(i+65) + " |\t");
			for (int j = 0; j < Matrix.length; j++) {
                            
				System.out.print(Matrix[i][j]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
    
}
