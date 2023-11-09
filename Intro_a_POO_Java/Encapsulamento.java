package Intro_a_POO_Java;

import Intro_a_POO_Java.Animais.Cachorro;

public class Encapsulamento {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Kika", "Marrom", 25, 15, 3, "nada");

        cachorro1.setNome("Tobi");
        cachorro1.setCor("Preto");
        cachorro1.setAltura(25);
        cachorro1.setPeso(10.5);
        cachorro1.setTamanhoDoRabo(15);

        cachorro1.comer(); // método vazio
        cachorro1.latir();
        cachorro1.pegar(); // não imprime nada
        System.out.println(cachorro1.getNome() + " pegou uma " + cachorro1.pegar()); // imprime o retorno do método
        System.out.println("----------------------------------------------------");
        System.out.println(cachorro1.getNome() + " está " + cachorro1.interagir("carinho"));
        System.out.println(cachorro1.getNome() + " está " + cachorro1.interagir("vai dormir"));
        System.out.println(cachorro1.getNome() + " está " + cachorro1.interagir("pisar na patinha"));
        System.out.println(cachorro1.getNome() + " está " + cachorro1.interagir("nada"));
        System.out.println("----------------------------------------------------");
        System.out.println(cachorro2.getNome() + " pegou uma " + cachorro1.pegar()); // imprime o retorno do método
        System.out.println(cachorro2.getNome() + " está " + cachorro2.interagir("nada"));
    }
}
