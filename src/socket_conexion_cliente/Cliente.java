/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket_conexion_cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author kali
 */
public class Cliente {
    private Socket socket;
    private String username;
    private String password;

    public Cliente(String host, int port, String username, String password) throws IOException {
        socket = new Socket(host, port);
        this.username = username;
        this.password = password;
    }

    public void start() {
        try {
            System.out.println("Conectado al servidor!");

            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());

            // Enviar el usuario y la contraseña al servidor
            output.writeUTF(username);
            output.writeUTF(password);

            // Leer la respuesta del servidor
            String message = input.readUTF();
            System.out.println("Mensaje del servidor: " + message);

            output.close();
            input.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
