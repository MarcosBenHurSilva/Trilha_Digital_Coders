package Intro_a_POO_Java;

import Intro_a_POO_Java.Animais.Cachorro;

public class Métodos {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro();
        // jeito sem 'get' e 'set'
        // cachorro1.nome = "Tobi";
        // cachorro1.cor = "Preto";
        // cachorro1.altura = 25;
        // cachorro1.peso = 10.5;
        // cachorro1.tamanhoDoRabo = 15;
        cachorro1.setNome("Tobi");
        cachorro1.setCor("Preto");
        cachorro1.setAltura(25);
        cachorro1.setPeso(10.5);
        cachorro1.setTamanhoDoRabo(15);

        cachorro1.comer(); // método vazio
        cachorro1.latir();
        cachorro1.pegar(); // não imprime nada
        // System.out.println(cachorro1.nome + " pegou uma " + cachorro1.pegar()); // imprime o retorno do método

        // System.out.println(cachorro1.nome + " está " + cachorro1.interagir("carinho"));
        // System.out.println(cachorro1.nome + " está " + cachorro1.interagir("vai dormir"));
        // System.out.println(cachorro1.nome + " está " + cachorro1.interagir("nada"));
        System.out.println(cachorro1.getNome() + " pegou uma " + cachorro1.pegar()); // imprime o retorno do método
        System.out.println("----------------------------------------------------");
        System.out.println(cachorro1.getNome() + " está " + cachorro1.interagir("carinho"));
        System.out.println(cachorro1.getNome() + " está " + cachorro1.interagir("vai dormir"));
        System.out.println(cachorro1.getNome() + " está " + cachorro1.interagir("pisar na patinha"));
        System.out.println(cachorro1.getNome() + " está " + cachorro1.interagir("nada"));
    }
}
