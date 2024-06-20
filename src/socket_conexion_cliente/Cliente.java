package socket_conexion_cliente;

import java.util.List;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;

public class Cliente {

    private final Socket socket;

    public Cliente(String host, int port) throws IOException {
        socket = new Socket(host, port);
    }

    public boolean enviarCredenciales(Usuarios usuario) {
        try {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());

            // Enviar la acción de login al servidor
            output.writeUTF("login");

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

    public boolean agregarUsuario(Usuarios usuario) {
        try {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());

            // Enviar la acción de agregar usuario al servidor
            output.writeUTF("addUser");

            // Enviar los datos del nuevo usuario al servidor
            output.writeUTF(usuario.getNombre());
            output.writeUTF(usuario.getApellido());
            output.writeUTF(usuario.getCedula());
            output.writeUTF(usuario.getUser());
            output.writeUTF(usuario.getPassword());

            // Leer la respuesta del servidor
            String message = input.readUTF();
            System.out.println("Mensaje del servidor: " + message);

            output.close();
            input.close();
            socket.close();

            return message.equals("Usuario agregado correctamente!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public List<Usuarios> obtenerUsuarios() {

        List<Usuarios> usuarios = new ArrayList<>();

        try {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());

            // Enviar la acción de obtener todos los usuarios al servidor
            output.writeUTF("getAllUsers");

            // Leer la cantidad de usuarios
            int userCount = input.readInt();

            // Leer los datos de cada usuario
            for (int i = 0; i < userCount; i++) {
                int id = input.readInt();
                String nombre = input.readUTF();
                String apellido = input.readUTF();
                String cedula = input.readUTF();
                String user = input.readUTF();
                String password = input.readUTF();

                Usuarios usuario = new Usuarios(0,"", "", "", "", "");
                usuario.setIdUsuario(id);
                usuario.setNombre(nombre);
                usuario.setApellido(apellido);
                usuario.setCedula(cedula);
                usuario.setUser(user);
                usuario.setPassword(password);

                usuarios.add(usuario);
            }

            output.close();
            input.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public boolean eliminarUsuario(int idUsuario) {
        try {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());

            // Enviar la acción de eliminar usuario al servidor
            output.writeUTF("deleteUser");

            // Enviar el ID del usuario a eliminar
            output.writeInt(idUsuario);

            // Leer la respuesta del servidor
            String message = input.readUTF();
            System.out.println("Mensaje del servidor: " + message);

            output.close();
            input.close();
            socket.close();

            return message.equals("Usuario eliminado correctamente!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean agregarTipoCuenta(TipoCuentas tipoCuenta){
        try {
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());
            DataInputStream input = new DataInputStream(socket.getInputStream());

            // Enviar la acción de agregar usuario al servidor
            output.writeUTF("addTipoCuenta");

            // Enviar los datos del nuevo usuario al servidor
            output.write(tipoCuenta.getIdTipo());
            output.writeUTF(tipoCuenta.getNombreTipo());
            
            
            // Leer la respuesta del servidor
            String message = input.readUTF();
            System.out.println("Mensaje del servidor: " + message);

            output.close();
            input.close();
            socket.close();

            return message.equals("Usuario agregado correctamente!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
