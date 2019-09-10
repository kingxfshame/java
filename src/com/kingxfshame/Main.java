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
        float x1 = Otvet;
        System.out.println(" Условие");

        System.out.printf(" (%d %d %d | %d)", arvud3[0][0] , arvud3[0][1] , arvud3[0][2], arvud3[0][3]);
        System.out.printf("\n (%d %d %d | %d)", arvud3[1][0] , arvud3[1][1] , arvud3[1][2] , arvud3[1][3]);
        System.out.printf("\n (%d %d %d |  %d)", arvud3[2][0] , arvud3[2][1] , arvud3[2][2], arvud3[2][3]);

        System.out.println("   \n \nОпределитель основной матрицы:");

        System.out.printf("     (%d %d %d | %d)", arvud3[0][0] , arvud3[0][1] , arvud3[0][2], arvud3[0][3]);
        System.out.printf("\n Δ = (%d %d %d | %d) = %d + %d + %d - %d -%d -%d = %d", arvud3[1][0] , arvud3[1][1] , arvud3[1][2] , arvud3[1][3], A,S,D,F,G,H,Otvet);
        System.out.printf("\n     (%d %d %d |  %d)", arvud3[2][0] , arvud3[2][1] , arvud3[2][2], arvud3[2][3]);

        System.out.println("   \n \nОпределители 3 дополнительных матриц:");


        A  = arvud3[0][3] * arvud3[1][1] * arvud3[2][2];
        S = arvud3[0][1] * arvud3[1][2] * arvud3[2][3];
        D  = arvud3[0][2] * arvud3[1][3] * arvud3[2][1];
        F  = arvud3[0][2] * arvud3[1][1] * arvud3[2][3];
        G  = arvud3[0][3] * arvud3[1][2] * arvud3[2][1];
        H  = arvud3[0][1] * arvud3[1][3] * arvud3[2][2];
        Otvet = A + S + D - F -G -H;
        float x2 = Otvet;

        System.out.printf("\n     (%d %d %d )", arvud3[0][3] , arvud3[0][1] , arvud3[0][2]);
        System.out.printf("\n Δ1 = (%d %d %d) = %d + %d + %d - %d -%d -%d = %d", arvud3[1][3] , arvud3[1][1] , arvud3[1][2], A,S,D,F,G,H,Otvet);
        System.out.printf("\n     (%d %d %d )\n", arvud3[2][3] , arvud3[2][1] , arvud3[2][2]);


        A  = arvud3[0][0] * arvud3[1][3] * arvud3[2][2];
        S = arvud3[0][3] * arvud3[1][2] * arvud3[2][0];
        D  = arvud3[0][2] * arvud3[1][0] * arvud3[2][3];
        F  = arvud3[0][2] * arvud3[1][3] * arvud3[2][0];
        G  = arvud3[0][0] * arvud3[1][2] * arvud3[2][3];
        H  = arvud3[0][3] * arvud3[1][0] * arvud3[2][2];
        Otvet = A + S + D - F -G -H;
        float x3 = Otvet;


        System.out.printf("\n     (%d %d %d)", arvud3[0][0] , arvud3[0][3] , arvud3[0][2], arvud3[0][3]);
        System.out.printf("\n Δ2 = (%d %d %d) = %d + %d + %d - %d -%d -%d = %d", arvud3[1][0] , arvud3[1][3] , arvud3[1][2], A,S,D,F,G,H,Otvet);
        System.out.printf("\n     (%d %d %d )\n", arvud3[2][0] , arvud3[2][3] , arvud3[2][2], arvud3[2][3]);


        A  = arvud3[0][0] * arvud3[1][1] * arvud3[2][3];
        S = arvud3[0][1] * arvud3[1][3] * arvud3[2][0];
        D  = arvud3[0][3] * arvud3[1][0] * arvud3[2][1];
        F  = arvud3[0][3] * arvud3[1][1] * arvud3[2][0];
        G  = arvud3[0][0] * arvud3[1][3] * arvud3[2][1];
        H  = arvud3[0][1] * arvud3[1][0] * arvud3[2][3];
        Otvet = A + S + D - F -G -H;
        float x4 = Otvet;


        System.out.printf("\n     (%d %d %d)", arvud3[0][0] , arvud3[0][1] , arvud3[0][3]);
        System.out.printf("\n Δ3 = (%d %d %d) = %d + %d + %d - %d -%d -%d = %d", arvud3[1][0] , arvud3[1][1] ,arvud3[1][3] ,A,S,D,F,G,H,Otvet);
        System.out.printf("\n     (%d %d %d)\n", arvud3[2][0] , arvud3[2][1] , arvud3[2][3]);

        System.out.printf("\n       Δ1      %.0f", x2);
        System.out.printf("\n x1 = ---- =  ------  = %.2f",x2/x1);
        System.out.printf("\n       Δ       %.0f\n", x1);

        System.out.printf("\n       Δ2      %.0f", x3);
        System.out.printf("\n x2 = ---- =  ------  = %.2f",x3/x1);
        System.out.printf("\n       Δ       %.0f\n", x1);

        System.out.printf("\n       Δ3      %.0f", x4);
        System.out.printf("\n x3 = ---- =  ------  = %.2f",x4/x1);
        System.out.printf("\n       Δ       %.0f\n", x1);
    }

}
