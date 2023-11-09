package Intro_a_POO_Java.Animais;

public class Gato {
    static int numeroDeGatos;
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    public Gato(){

    }

    public Gato(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito){
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeGatos ++;
    }

    void comer(){}

    void dormir(){}

    void soar(){
        System.out.println("MIAU MIAU");
    }

    @Override
    public String toString(){
        return "Gato{" +
                "nome='" + nome + '\'' + 
                '}';
    }
}
