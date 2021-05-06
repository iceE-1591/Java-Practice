package iceE.codezine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Part1 {
    public static void main(String[] args) throws java.io.IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        while (true) {
            System.out.print(">");
            String consoleTxt = br.readLine();
            if (consoleTxt.equals("EXIT")) {
                System.exit(0);
            } else {
                System.out.println("未入力です");
            }
        }
    }
}
