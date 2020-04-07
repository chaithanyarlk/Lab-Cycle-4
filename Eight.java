import java.util.*;

public class Eight{
     static public void display(int arr[][],int n){
          for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                    if(arr[i][j]==0)
                    System.out.print("-\t");
                    else
                    System.out.print("Q\t");
               }
               System.out.println();

          }
     }




     static public int isSafe(int arr[][],int row,int col,int n){
          //row should not contain another queen
          for(int i=0;i<n;i++){
               if(arr[row][i]==1)
               return 0;

          }
          //column should not contain another queen
          for(int i=0;i<n;i++){
               if(arr[i][col]==1)
               return 0;
          }
          //uppre diagonal
          for (int i = row,  j = col; i >= 0 && j >= 0; i--, j--) 
			if (arr[i][j] == 1) 
				return 0; 

		//lower diagonal
		for (int  i = row,  j = col; j >= 0 && i < n; i++, j--) 
			if (arr[i][j] == 1) 
				return 0; 

          return 1;

     }
     public static int codeSolver(int arr[][],int col,int n){
          if(col>=n)
          return 1;

          for(int i=0;i<n;i++){
               if(isSafe(arr, i, col, n)==1){
                    arr[i][col]=1;
                    if(codeSolver(arr, i+1, n)==1)
                    return 1;
                    arr[i][col]=0;
               }
          }
          return 0;

     }

     public static void main(String []args){
          int n=8;
          int arr[][]= new int [8][8];
          for(int i=0;i<n;i++){
               for(int j=0;j<n;j++)
               arr[i][j]=0;
          }
          int temp=codeSolver(arr, 0, n);
          if(temp==1)
          {
               display(arr, n);
               System.out.println("Solved");
          }
          else{
               System.out.println("Cannot be solved");
          }
     }


}
