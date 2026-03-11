package OptimizedPowerCalculation;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X,N;
        X = sc.nextInt();
        N = sc.nextInt();

        System.out.println(power(X,N));
    }

    public static long power(int x, int y)
    {
        if(y==0)return 1;
        return x * power(x , y-1);
    }
}
