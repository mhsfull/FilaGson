package Enviar.Config.Classes;

import java.util.ArrayList;


public class ListaMoedas {
    private static ArrayList<String> Lista;

    public static ArrayList<String> getLista() {
        ArrayList<String> Lista = new ArrayList<String>();
        Lista.add("USD");
        Lista.add("EUR");
        Lista.add("ETH");
        Lista.add("BTC");
        return Lista;
    }
}
