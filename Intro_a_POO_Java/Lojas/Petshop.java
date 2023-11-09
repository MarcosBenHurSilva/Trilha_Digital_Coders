package Intro_a_POO_Java.Lojas;

import Intro_a_POO_Java.Animais.Animal;
import Intro_a_POO_Java.Animais.Cachorro;

public class Petshop {
    
    public void darBanho(Animal animal){
        animal.setEstadoDeEspirito("Limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoDeEspirito("Tosado");
    }

    public void deixarNoHotel(Animal animal){
        animal.setEstadoDeEspirito("com saudades");
    }
}
