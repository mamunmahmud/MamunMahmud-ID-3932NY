package math.problems;

public class MakePyramid {

    public static void main(String args[]){

    /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */



        int n=5;
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {
// printing spaces
                System.out.print(" ");
            }
            for (int j=0; j<=i; j++ )
            {
// printing stars
                System.out.print("* ");
            }
            System.out.println();
        }




    }

}