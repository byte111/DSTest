package com.ds1;

/**
 * Created by dbhattac on 3/19/2017.
 *
 * procedure mergesort( var a as array )
 if ( n == 1 ) return a

 var l1 as array = a[0] ... a[n/2]
 var l2 as array = a[n/2+1] ... a[n]

 l1 = mergesort( l1 )
 l2 = mergesort( l2 )

 return merge( l1, l2 )
 end procedure

 procedure merge( var a as array, var b as array )

 var c as array

 while ( a and b have elements )
 if ( a[0] > b[0] )
 add b[0] to the end of c
 remove b[0] from b
 else
 add a[0] to the end of c
 remove a[0] from a
 end if
 end while

 while ( a has elements )
 add a[0] to the end of c
 remove a[0] from a
 end while

 while ( b has elements )
 add b[0] to the end of c
 remove b[0] from b
 end while

 return c

 end procedure
 @Source : https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm
  * procedure mergesort( var a as array )
 if ( n == 1 ) return a

 var l1 as array = a[0] ... a[n/2]
 var l2 as array = a[n/2+1] ... a[n]

 l1 = mergesort( l1 )
 l2 = mergesort( l2 )

 return merge( l1, l2 )
 end procedure
 */
public class MergeSorting {
    public static int[] mergesort(int arr[],int start,int end)
    {
        if(arr.length == 1)
            return arr;
        int mid = (start+end)/2;
        int m1[] = new int[end-start];
        int m2[] = new int[end-start];
        for(int i =0 ; i<=mid ; i++);
        {
          //  m1[i++] = arr[i++];
        }

        for(int i =mid+1 ; i<end ; i++)
        {
            m2[i++] = arr[i++];
        }

         m1 = mergesort(arr,start,mid);
         m2 = mergesort(arr,mid+1,end);
        int c[] = merge(m1,m2);
        return c;
    }

    public static int[] merge(int m1[],int m2[])
    {
        int l1 = m1.length;
        int l2 = m2.length;
        int c[] = new int[m1.length+m2.length];
        int i =0 , j = 0,k= 0;

        while(i<l1 && j < l2)
        {
            if(m1[i] < m2[j])
            {
                c[k] = m1[i];
                i++;
                k++;
            }
            else
            {
                c[k] = m2[j];
                j++;
                k++;
            }
        }

        if( i < l1)
        {
            c[k] = m1[i];
            i++;
            k++;
        }

        else if( j  < l2)
        {
            c[k] = m2[j] ;
            j++;
            k++;
        }

        return c;

    }

    public static void main(String args[])
    {
        int a[] = {6,3,1,0,9,78};
       int c[] =  MergeSorting.mergesort(a,0,a.length);
        for(int i = 0;i< c.length ; i++)
        {
            System.out.print(c[i] + " ");
        }

    }

}
