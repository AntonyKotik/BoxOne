/**
 * Created by Kotik on 13.11.2015.
 */
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.InputStream;
import java.util.*;
import java.util.Map.Entry;

public class main {

    public static boolean Nat(int n) {
        boolean prime = true;
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return (n % 2 != 0 && prime && n > 2) || n == 2;
    }


    static int ref(int N)
    {
        int n1 = 0;
        while(N != 0) {
            n1 = n1 * 10 + N % 10;
            N /= 10;
        }
        return n1;
    }

    public static int Simple(int MAX)
    {
        boolean leave=false;
        ArrayList <Integer> mas=new ArrayList();
        int i=0,number=1;
        int a=0;
        while(leave!=true)
        {
            if (Nat(number) && Nat(ref(number)))
            {
                mas.add(number);
                i++;
            }
            number++;
            if (number >= MAX) leave = true;
        }
        for(i=0;i<mas.size();i++)
        {

            System.out.print(mas.get(i)+" ");
        }
        return i;

    }

    public static void main(String[] args)
    {
        int n = 1000;
        int i=0;
        i=Simple(n);
        System.out.print(" "+i);
        System.out.println();
    }
}
