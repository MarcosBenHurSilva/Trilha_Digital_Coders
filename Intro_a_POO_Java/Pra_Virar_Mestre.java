package Intro_a_POO_Java;

import Intro_a_POO_Java.Animais.Animal;
import Intro_a_POO_Java.Animais.Cachorro;
import Intro_a_POO_Java.Animais.Gato;
import Intro_a_POO_Java.Animais.Passaro;
import Intro_a_POO_Java.Lojas.Petshop;

public class Pra_Virar_Mestre {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Tobi", "Preto", 20.5);
        Gato gato1 = new Gato("Felix", "Branco", 4.5);
        Animal gato2 = new Gato("Garfield", "Laranja", 8.5);
        Passaro passaro1 = new Passaro("Piu", "Verde", 5.1);
        Petshop petshop = new Petshop();

        //cachorro1.soar();
        // abaixo método soar de gato e passaro
        gato2.soar();
        passaro1.soar();

        /*petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getNome() + " está " + cachorro1.getEstadoDeEspirito());*/

        int inteiro; // int, long, byte default = 0;
        float $$; // float e double default = 0.0;
        boolean $87; // boolean default é false;
        char ch; // char default é vazio;
        String teste; // valor default de qualquer objeto é null;

        double d = 5.5d;
        float f = 3.00f;

        float x = f + (float)d;
        double y = (double)f + d;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        petshop.darBanho(gato1);
        System.out.println(gato1.getNome() + " está " + gato1.getEstadoDeEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getNome() + " está " + cachorro1.getEstadoDeEspirito());

        petshop.deixarNoHotel(passaro1);
        System.out.println(passaro1.getNome() + " está " + passaro1.getEstadoDeEspirito());
    }
}
