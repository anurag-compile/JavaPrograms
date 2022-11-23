package day042_JavaPrimalityTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args)
            throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        BigInteger n = new BigInteger(bufferedReader.readLine());
        bufferedReader.close();

        System.out.println(n.isProbablePrime(1)? "prime" : "not prime");
    }
}

