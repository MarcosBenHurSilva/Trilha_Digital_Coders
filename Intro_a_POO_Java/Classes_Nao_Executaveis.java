package Intro_a_POO_Java;

import Intro_a_POO_Java.Animais.Cachorro;

public class Classes_Nao_Executaveis {
    public static void main(String[] args) {
        
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Tobi";
        cachorro1.cor = "Preto";
        cachorro1.altura = 120;
        cachorro1.peso = 20.5;
        cachorro1.tamanhoDoRabo = 14;

        System.out.println(cachorro1);
    }
}
