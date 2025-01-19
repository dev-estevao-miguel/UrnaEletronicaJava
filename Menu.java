public class Menu{
    
    public static final String ANSI_RESET = "\033[0m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m"; 
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m";
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";
    public static final String ORANGE_BACKGROUND = "\033[38;5;208m";

    public Menu(){
        System.out.println(YELLOW_BOLD_BRIGHT + "\nBem-vindo ao dia de Eleição" + ANSI_RESET);
        System.out.println(YELLOW_BOLD_BRIGHT   + "Escolha um candidato votar:" + ANSI_RESET);
        System.out.println();

        System.out.println(YELLOW_BOLD_BRIGHT + "Digite: " + GREEN_BOLD_BRIGHT + "01" + " - " + "Pablo Marçal" + GREEN_BOLD_BRIGHT + " - " + " Partido Leva Cadeirada " + ANSI_RESET);

        System.out.println(YELLOW_BOLD_BRIGHT + "Digite: " + GREEN_BOLD_BRIGHT + "02" + " - " + "Siqueira Jr." + WHITE_BOLD_BRIGHT + " - " + " Partido dar Cadeirada " + ANSI_RESET);

        System.out.println(YELLOW_BOLD_BRIGHT + "Digite: " + GREEN_BOLD_BRIGHT + "03" + " - " + "Lula" + BLUE_BOLD_BRIGHT + " - " + " Partido dos Trabalhadores " + ANSI_RESET);

        System.out.println(YELLOW_BOLD_BRIGHT + "Digite: " + GREEN_BOLD_BRIGHT + "04" + " - " + "Jair Bolsonaro" + PURPLE_BOLD_BRIGHT + " - " + " Partido Metralha ladão " + ANSI_RESET);

        System.out.println(YELLOW_BOLD_BRIGHT + "Digite: " + GREEN_BOLD_BRIGHT + "05" + " - " + "Cabo Daciolo" + RED_BOLD_BRIGHT + " - " + " Partido de Outro Planeta " + ANSI_RESET);

    }
      
}