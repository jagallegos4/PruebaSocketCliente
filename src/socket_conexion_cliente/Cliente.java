/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socket_conexion_cliente;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {

    private Socket socket;

    public Cliente(String host, int port) throws IOException {
        socket = new Socket(host, port);
    }

    public boolean enviarCredenciales(Usuarios usuario) {
        try {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());

            // Enviar el usuario y la contraseña al servidor
            output.writeUTF(usuario.getUser());
            output.writeUTF(usuario.getPassword());

            // Leer la respuesta del servidor
            String message = input.readUTF();
            System.out.println("Mensaje del servidor: " + message);

            output.close();
            input.close();
            socket.close();
            return message.equals("Credenciales válidas!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
