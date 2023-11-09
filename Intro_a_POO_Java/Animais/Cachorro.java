package Intro_a_POO_Java.Animais;

public class Cachorro {
    // atributos

    // public não precisa de get e set
    // public String nome;
    // public String cor;
    // public int altura;
    // public double peso;
    // public int tamanhoDoRabo;
    // public String estadoDeEspirito;

    //private precisa de get e set
    static int numeroDeCachorros;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;
    
    // construtores
    // construtor padrão
    public Cachorro (){

    }
    // construtores adicionados
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }

    // métodos
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public int getAltura(){
        return this.altura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }

    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    public int getTamanhoDoRabo(){
        return this.tamanhoDoRabo;
    }
    public void setTamanhoDoRabo(int tamanhoDoRabo){
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    // public String getEstadoDeEspirito(){
    //     return this.estadoDeEspirito;
    // }
    // public void setEstadoDeEspirito(String estadoDeEspirito){
    //     this.estadoDeEspirito = estadoDeEspirito;
    // }

    public static int getNumeroDeCachorros(){
        return numeroDeCachorros;
    }
    public static void setNumeroDeCachorros(int numeroDeCachorros){
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

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

    @Override
    public String toString(){
        return "Cachorro{" +
                "nome='" + nome + '\'' + 
                '}';
    }

}
