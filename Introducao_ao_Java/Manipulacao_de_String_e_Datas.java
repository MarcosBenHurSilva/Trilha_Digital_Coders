import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Manipulacao_de_String_e_Datas {
    public static void main(String[] args) {
        // Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.

        String nome = "Marcos";
        //System.out.println(nome.toUpperCase());
        //System.out.println(nome.toLowerCase());
        //System.out.println(nome.length());
        //System.out.println(nome.charAt(3));

        //String nomeOutro = "marcos";
        //System.out.println(nome.equals(nomeOutro));
        //System.out.println(nome.equalsIgnoreCase(nomeOutro));

        // ISO 8601
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >= 5 && agora.getHour() < 12){
            saudacao = "Bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "Boa noite";
        } else {
            saudacao = "Vai dormir";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
