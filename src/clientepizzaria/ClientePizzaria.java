package clientepizzaria;

import java.io.IOException;
import java.net.Socket;
import java.io.OutputStream;

public class ClientePizzaria {

    public static void main(String[] args) {

        String mensagem = "olá mundo";
        String enderecoServidor = "localhost"; // Endereço IP do servidor
        int portaServidor = 8080; // Porta do servidor

        try {
            // Conecte-se ao servidor
            Socket socketServidor1 = new Socket(enderecoServidor, portaServidor);
            System.out.println("Conectado ao servidor");

            OutputStream dadosSaida = socketServidor1.getOutputStream();

            byte[] mensagemConvertida = mensagem.getBytes();

            dadosSaida.write(mensagemConvertida);

            dadosSaida.close();
            socketServidor1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
