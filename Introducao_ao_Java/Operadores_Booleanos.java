public class Operadores_Booleanos {
    public static void main(String[] args) {
        // write your code here
        boolean fimDeSemana = false;
        boolean fazendoSol = true;
        // boolean vamosAPraia = fimDeSemana && fazendoSol;
        // System.out.println(vamosAPraia);
        // Operador ternário (x ? y : z)
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
        System.out.println("-----------------------------------");       
        if(fimDeSemana && fazendoSol) {
            System.out.println("Vamos a praia!");
        } else {
            System.out.println("Ficar em casa.");
        }
        System.out.println("-----------------------------------");
        if(fimDeSemana || fazendoSol) {
            System.out.println("Vamos a praia!");
        } else {
            System.out.println("Ficar em casa.");
        }
        System.out.println("-----------------------------------");
        
        // Tabela verdade

        // Operador && (AND)
        // true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador || (OR)
        // true || true = true
        // true || false = true
        // false || true = true
        // false || false = false
               
    }
}
