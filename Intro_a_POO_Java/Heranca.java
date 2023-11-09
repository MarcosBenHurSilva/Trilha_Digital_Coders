package Intro_a_POO_Java;

import Intro_a_POO_Java.Animais.Cachorro;
import Intro_a_POO_Java.Animais.Gato;
import Intro_a_POO_Java.Animais.Passaro;


public class Heranca {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Tobi", "Preto", 20.5);

        Gato gato1 = new Gato("Felix", "Branco", 4.5);

        Passaro passaro1 = new Passaro("Piu", "Verde", 5.1);

        cachorro1.soar();

        gato1.soar();

        passaro1.soar();
    }
}
