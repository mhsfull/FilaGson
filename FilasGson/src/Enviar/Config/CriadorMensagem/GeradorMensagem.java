package Enviar.Config.CriadorMensagem;

import Enviar.Config.CriadorObjeto.CotacaoObjetos;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class GeradorMensagem {


    public static String mensageiro(String Coin) throws Exception {

        Object ObjetoCotacao = CotacaoObjetos.ObjetoCriado();
        Gson gson = new Gson();
        JsonObject x = new Gson().fromJson(gson.toJson(ObjetoCotacao), JsonObject.class);
        JsonElement name = x.getAsJsonObject(Coin).get("name");
        JsonElement codein = x.getAsJsonObject(Coin).get("codein");
        JsonElement bid = x.getAsJsonObject(Coin).get("bid");
        JsonElement ask = x.getAsJsonObject(Coin).get("ask");
        JsonElement create_date = x.getAsJsonObject(Coin).get("create_date");
        String info = ("Boa tarde a moeda :"+name+"o valor de venda é:"+codein+bid+" e valor da " +
                "compra é :"+codein+ask+" as informações " +
                "foram atualizadas as :"+create_date).replace('"', ' ');
        return info;

    }
}
