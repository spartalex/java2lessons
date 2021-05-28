package lesson6.socketexamples;

import javax.crypto.spec.PSource;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerApp {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(1234)) {
            System.out.println("Сервер запущен, ожидаем подключение!");
            Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился!");
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());

            while (true) {
                String data = dataInputStream.readUTF();
                if (data.equals("end")) break;
                System.out.println("Получили сообщение от клиента: " + data);
                dataOutputStream.writeUTF("Отправляем сообщение: " + data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
