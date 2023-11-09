package Intro_a_POO_Java;

import Intro_a_POO_Java.Animais.Cachorro;

public class Heranca {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Tobi", "Preto", 17, 20.5, 12, "nada");
        System.out.println(cachorro1.getNumeroDeCachorros());
        Cachorro cachorro2 = new Cachorro("Kika", "Marron", 10, 12.5, 5, "nada");
        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());
    }
}
