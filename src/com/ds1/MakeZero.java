package com.ds1;

/**
 * Created by dbhattac on 3/5/2017.
 */
public class MakeZero {

    public int[][] makeZero(int input[][])
    {
        boolean iszero = false;
        int matchi = -1,matchj=-1;
        for(int i = 0 ; i <input.length;i++ ) {
            matchi = -1;matchj=-1;
            for (int j = 0; j < input.length; j++) {
                if (input[i][j] == 0) {
                    iszero = true;
                    matchi = i;
                    matchj = j;
                    break;
                }
            }


            if (iszero) {
                for (int ii = 0; ii < input.length; ii++) {
                    for (int jj = 0; jj < input.length; jj++) {
                        if (matchi == ii) {
                            input[ii][jj] = 0;
                        } else if (matchj == jj) {
                            input[ii][jj] = 0;
                        }
                    }

                }
            }
        }
        return input;
    }

    public static void main(String args[])
    {
        MakeZero obj = new MakeZero();

        int input [][] = {
                                {1,0,3,4},
                                {5,6,7,8},
                                {9,10,0,12},
                                {13,14,15,16}
                            };

       int output[][] = obj.makeZero(input);

        for(int i  = 0;i < output.length; i++)
        {

            for(int j  = 0;j < output.length; j++)
            {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }

    }
}
