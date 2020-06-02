package com.example.test_tucach3;
import java.util.Random;
public class TienIch {
    public static int []M;
    public static void Generate(){
        Random r = new Random();
        M = new int [101];
        for(int i=0;i<101;i++){
            M[i] = r.nextInt(300);
        }
    }

    public static boolean NotInClass(int N){
        for(int i =0;i<101;i++){
            if(M[i] != N){
                return true;
            }
        }
        return false;
    }
}
