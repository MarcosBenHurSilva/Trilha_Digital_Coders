package Intro_a_POO_Java;

import Intro_a_POO_Java.Animais.Cachorro;
import Intro_a_POO_Java.Animais.Gato;
import Intro_a_POO_Java.Animais.Passaro;
import Intro_a_POO_Java.Lojas.Petshop;

public class Polimorfismo {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Tobi", "Preto", 20.5);

        Gato gato1 = new Gato("Felix", "Branco", 4.5);

        Passaro passaro1 = new Passaro("Piu", "Verde", 5.1);

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getNome() + " está " + cachorro1.getEstadoDeEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getNome() + " está " + gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getNome() + " está " + cachorro1.getEstadoDeEspirito());

        petshop.deixarNoHotel(passaro1);
        System.out.println(passaro1.getNome() + " está " + passaro1.getEstadoDeEspirito());
    }
}
