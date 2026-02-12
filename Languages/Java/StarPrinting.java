package Languages.Java;

public class StarPrinting {
    /* 
    *
    * *
    * * *
    * * * *
     */
    public static void star1(int n){
        for(int line=1; line<=n; line++){
            for(int star=1; star<=line; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* 
    * * * *
    * * *
    * *
    * 
     */
    public static void invertedStar2(int n){
        for(int line=1; line<=n; line++){
            for(int star=line; star<=n-1+1; star++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* 
    1
    1 2
    1 2 3
    1 2 3 4
     */
    public static void halfPyramid(int n){
        for(int line=1; line<=n; line++){
            for(int num=1; num<=line; num++){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    /* 
    A
    BC
    DEF
    GHIJ
     */
    public static void characterPrint(int n){
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch++);
            }
            System.out.println();
        }
    }

    // HOLLOW RECTANGLE pattern
    /* 
    * * * * *
    *       *
    *       *
    * * * * *
     */
    public static void hollowRectangle(int totRows, int totCols){
        // outer loop
        for(int i=1; i<=totRows; i++){
            // inner - columns
            for(int j=1; j<=totCols; j++){
                // cell - (i, j)
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    // boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // star1(4);
        // invertedStar2(4);
        // halfPyramid(4);
        // characterPrint(7);
        hollowRectangle(4, 5);
    }
}
