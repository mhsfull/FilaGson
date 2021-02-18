package Enviar.Config.GerenciadorDeFila;

import Enviar.Config.Classes.ListaMoedas;
import Enviar.Config.CriadorMensagem.GeradorMensagem;
import Enviar.Config.Fila.MandaRabbitMq;

import java.util.ArrayList;

public class MandaFila {
    public static String controle() throws Exception{
        ArrayList<String> Lista = ListaMoedas.getLista();
        for(Integer i=0;i<=(Lista.size()-1);i++){
            String name = Lista.get(i);
            String mensagem = GeradorMensagem.mensageiro(name);
            MandaRabbitMq.fila(mensagem, name);
        }
        String resposta = "Mensagens enviadas";
        return resposta;
    }
}
