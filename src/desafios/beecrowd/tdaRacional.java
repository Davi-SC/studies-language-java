/*package desafios.beecrowd;

import java.util.Scanner;

public class tdaRacional {

    public static double calcular(String equacao){
        String resultado ;
        float numerador,denominador,numeradorRed,denominadorRed ;
        int n;
        float valores[] = new float[4] ;
        valores[0] = Float.parseFloat(equacao[0]);
        valores[1] = Float.parseFloat(equacao[4]);
        valores[2] = Float.parseFloat(equacao[8]);
        valores[3] = Float.parseFloat(equacao[12]);

        if(equacao[6] == "+"){
            numerador = valores[0]*valores[3]+valores[1]*valores[2];
            denominador = valores[3]*valores[2];

            if(equacao[6] == "+")
            while(true){

            }
            numeradorRed= ;
            denominadorRed = ;
            resultado = ""+numerador+"/"+denominador+"="+numeradorRed+"/"+denominadorRed;
        } else if (equacao[6] == "-") {

        }else if (equacao[6] == "*") {

        }else if (equacao[6] == "/") {

        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for (int i=0;i<n;i++){
            String equacao = input.nextLine();
            calcular(equacao);
        }



    }
}
*/