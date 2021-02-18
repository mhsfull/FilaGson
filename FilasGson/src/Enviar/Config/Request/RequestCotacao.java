package Enviar.Config.Request;

import Enviar.Config.Classes.LinkRequest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class RequestCotacao {

    public static String cotacao() throws Exception {
        LinkRequest UrlEntrada = new LinkRequest();
        URL Criacaolink = new URL(UrlEntrada.getUrlCotacao());
        URLConnection connection = Criacaolink.openConnection();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String RequestFeita = buffer.readLine();
        return RequestFeita;
    }
}
