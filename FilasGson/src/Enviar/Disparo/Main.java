package Enviar.Disparo;

import Enviar.Config.GerenciadorDeFila.MandaFila;

public class Main {
    public static void main(String[] args) throws Exception {
        String mensagem = MandaFila.controle();
        System.out.println(mensagem);
    }
}
