package com.kingxfshame;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
	/*int number = 100;

	do{

        System.out.printf("Ruud juur %d arvust %.1f \n",number,Math.sqrt(number));
        number-- ;
    }

        while (number >= 0);
        number = 100;
        System.out.println("Noviq Tsikl");
        while(number >= 0){
            System.out.printf("Ruud juur %d arvust %.1f \n",number,Math.sqrt(number));
            number-- ;
        }

        int [] arvud = new int[] {1,100,25,700} ;
        int [] arvud2 = new int[6] ;

        Random rand = new Random();

        for(int i = 0; i < arvud2.length ; i++){
            arvud2[i] = rand.nextInt(100);
            System.out.println(arvud2[i]);
        }
        */
        Random rand = new Random();
        int min = -10;
        int max = 10;

        int [] [] arvud3 = new int[3][4];

        for(int i = 0; i < arvud3.length ; i++){
            for(int j = 0; j < arvud3[i].length ; j++){
                arvud3[i][j] = ThreadLocalRandom.current().nextInt(min,max +1);
            }
        }


        int A  = arvud3[0][0] * arvud3[1][1] * arvud3[2][2];
        int S = arvud3[0][1] * arvud3[1][2] * arvud3[2][0];
        int D  = arvud3[0][2] * arvud3[1][0] * arvud3[2][1];
        int F  = arvud3[0][2] * arvud3[1][1] * arvud3[2][0];
        int G  = arvud3[0][0] * arvud3[1][2] * arvud3[2][1];
        int H  = arvud3[0][1] * arvud3[1][0] * arvud3[2][2];
        int Otvet = A + S + D - F -G -H;


        System.out.printf("%d %d %d", arvud3[0][0] , arvud3[0][1] , arvud3[0][2]);
        System.out.printf("\n%d %d %d", arvud3[1][0] , arvud3[1][1] , arvud3[1][2]);
        System.out.printf("\n%d %d %d", arvud3[2][0] , arvud3[2][1] , arvud3[2][2]);

        System.out.printf("\nAnswer =  %d + %d + %d - %d -%d -%d", A,S,D,F,G,H);
        System.out.printf("\nAnswer = %d",Otvet);

    }
}
