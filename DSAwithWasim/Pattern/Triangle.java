package DSAwithWASiM.DSAwithWasim.Pattern;

public class Triangle {
    public static void triangleUpdated(int n,int row,int col){
        if(row>n){
            return;
        }

        if(col<=row){
            System.out.print("* ");
            triangleUpdated(n,row, col+1);
        }else{
            System.out.println();
            triangleUpdated(n,row+1, 1);
        }
    }
    public static void triangle(int n){
        if(n==0){
            return;
        }
        /*
            *
            * *
            * * *
            * * * *
            * * * * * 
        */
        // triangle(n-1);  // this call will give output like above pattern
        for(int i=1;i<=n;i++){
            System.out.print("* ");
        }
        System.out.println();
        /*
            * * * * *
            * * * *
            * * *
            * *
            * 
        */
        triangle(n-1);  // this call will output like above pattern but above call must be commented
    }
    public static void main(String[] args) {
        // triangle(5);
        triangleUpdated(5, 1, 1);
    }
}
