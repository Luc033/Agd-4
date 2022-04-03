/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoscovid;

/**
 *
 * @author morta
 */import java.util.Scanner;

public class CasosCovidSudeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leitor = new Scanner (System.in);
        String Regiao;
        double CasosRegiao;
        double CasosBrasil;
        double PercentualRegiao;
        
        System.out.println("Este programa lhe informa sobre a relação percentual dos casos de covid-19 do Brasil.");

        System.out.println("Digite a quantidade de casos de covid-19 no Brasil.");
        CasosBrasil = leitor.nextInt();

        System.out.println("Digite a região para prosseguir.");
        Regiao = leitor.next();

        System.out.println("Agora o número de casos de covid-19.");
        CasosRegiao = leitor.nextInt();

        PercentualRegiao = ((CasosRegiao/CasosBrasil)*100);

        System.out.println("No Brasil temos " + CasosBrasil + " casos de covid-19. Mas apenas em " + Regiao +" temos " + CasosRegiao + ", isto representa " + PercentualRegiao + "% de casos no Brasil.");
    }
    
}
