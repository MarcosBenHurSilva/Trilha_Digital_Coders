package Intro_a_POO_Java.Animais;

public class Cachorro {

    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;
    public String estadoDeEspirito;

    public void comer(){
       
    }

    public void latir(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "bolinha";
    }

    public String interagir(String acao){
        
        switch (acao) {
            case "carinho": this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir": this.estadoDeEspirito = "bravo";
                break;
            case "pisar na patinha": this.estadoDeEspirito = "triste";
                break;
            default: this.estadoDeEspirito = "neutro";
                break;
        }
        return this.estadoDeEspirito;
        
        // if (acao.equals("carinho")){
        //     this.estadoDeEspirito = "feliz!:D";            
        // } else if(acao.equals("vai dormir")){
        //     this.estadoDeEspirito = "bravo!>:(";
        // } else if(acao.equals("pisar na patinha")){
        //     this.estadoDeEspirito = "triste";
        // }else {
        //     this.estadoDeEspirito = "neutro!:p";
        // }
        // return estadoDeEspirito;
    }
}
