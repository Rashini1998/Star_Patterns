public class IncreasingTriangle {
    public static void main(String[] args) {
        int n=5;
        for (int i=0;i<n;i++){ //rows
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// *
// * *
// * * *
// * * * *
// * * * * *
