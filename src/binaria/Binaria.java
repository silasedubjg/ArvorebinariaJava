/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaria;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Binaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int c = 1;
        while (c < (k + 1)) {

            int qtnum = sc.nextInt();

            No pai = new No(sc.nextInt());
            while (qtnum > 1) {

                No aux = pai;
                pai.inserir(aux, sc.nextInt());
                qtnum--;
            }

            System.out.println("Case " + (c) + ":");
            c++;
            System.out.print("Pre.: ");
            pai.red(pai);
            System.out.println("");
            System.out.print("In..: ");
            pai.erd(pai);

            System.out.println("");
            System.out.print("Post: ");
            pai.po(pai);
            System.out.println(" ");

        }

    }
}
