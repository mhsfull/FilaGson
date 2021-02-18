package Enviar.Config.CriadorObjeto;

import Enviar.Config.Classes.Moedas;
import Enviar.Config.Request.RequestCotacao;
import com.google.gson.Gson;

public class CotacaoObjetos {

    public static Object ObjetoCriado() throws Exception {
        String cota = RequestCotacao.cotacao();
        Gson InitGsonDolar = new Gson();
        Moedas Obj= InitGsonDolar.fromJson(cota, Moedas.class);
        return Obj;






    }
}
