//do-while
//totalVotos01...(variável) 
//totalVotosNulos
//totalVotosApurados

import java.util.Scanner;

public class Votos extends UrnaEletronica {

    public static final String ANSI_RESET = "\033[0m";
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m"; 


    public Votos(){

    }
        int totalVotosApurados = 0;
        int totalVotosValidos = 0;
        int totalVotosNulos = 0;
        int totalVotos01 = 0;
        int totalVotos02 = 0;
        int totalVotos03 = 0;
        int totalVotos04 = 0;
        int totalVotos05 = 0;

   public void resultado() {
        System.out.println(YELLOW_BOLD_BRIGHT + "Resultado da votação: " + ANSI_RESET);
        System.out.println("1ª Candidato - Pablo Marçal: " + totalVotos01 + " votos " + ((totalVotos01 * 100) / totalVotosApurados) + "%");
        System.out.println("2ª Candidato Siqueira Jr. : " + totalVotos02 + " votos " + ((totalVotos02 * 100) / totalVotosApurados) + "%");
        System.out.println("3ª Candidato Lula: " + totalVotos03 + " votos " + ((totalVotos03 * 100) / totalVotosApurados) + "%");
        System.out.println("4ª Candidato Bolsonaro: " + totalVotos04 + " votos " +  ((totalVotos04 * 100) / totalVotosApurados) + "%");
        System.out.println("5ª Candidato Cabo Daciolo: " + totalVotos05 + " votos "  + ((totalVotos05 * 100) / totalVotosApurados) + "%");
        System.out.println("Votos nulos: " + totalVotosNulos + " votos " + ((totalVotosNulos * 100) / totalVotosApurados)+"%");
    }
    public Votos(String voto){
    }

    public void getVotos(){
        Scanner sc = new Scanner(System.in);

        while(totalVotosApurados < 10){
            
            System.out.println(YELLOW_BOLD_BRIGHT + "\nDigite o número do seu candidato: " + ANSI_RESET);
            String voto = sc.nextLine();

            System.out.println(YELLOW_BOLD_BRIGHT + "\nInforme o proximo Candidato:" + ANSI_RESET);

            if (voto.equals("01") || voto.equals("02") || voto.equals("03") || voto.equals("04") || voto.equals("05")) {
                totalVotosValidos++;
            }
            if (!voto.equals("01") && !voto.equals("02") && !voto.equals("03") && !voto.equals("04") && !voto.equals("05")) {
                totalVotosNulos++;
            }
            if (voto.equals("01")) {
                totalVotos01++;
            } 
            else if (voto.equals("02")) {
                totalVotos02++;
            } 
            else if (voto.equals("03")) {
                totalVotos03++;
            } 
            else if (voto.equals("04")) {
                totalVotos04++;
            } 
            else if (voto.equals("05")) {
                totalVotos05++;
            }
            totalVotosApurados++;
            }
           
        }
}
