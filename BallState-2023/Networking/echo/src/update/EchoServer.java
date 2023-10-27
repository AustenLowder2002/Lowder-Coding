package update;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class EchoServer {
    public static void main(String[] args) throws Exception {
        while(true) {
        DatagramSocket serverSocket = new DatagramSocket(3000);
        DatagramPacket clientRequest = new DatagramPacket(new byte[1024], 1024);
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatDates = now.format(formatDate);
        String formatTimes = now.format(formatTime);
        String invalidReply = "Invalid reply";

        serverSocket.receive(clientRequest);
        InetAddress clientIP = clientRequest.getAddress();
        int clientPort = clientRequest.getPort();
        String request = new String(clientRequest.getData(), 0, clientRequest.getLength());
        System.out.println(request);

            if(request.equals("Time")){
                byte[] content = Arrays.copyOf(formatTimes.getBytes(), formatTimes.length());
                DatagramPacket serverReply = new DatagramPacket(content, content.length, clientIP, clientPort);
                serverSocket.send(serverReply);

            }else if(request.equals("Date")){
                byte[] content = Arrays.copyOf(formatDates.getBytes(), formatDates.length());
                DatagramPacket serverReply = new DatagramPacket(content, content.length, clientIP, clientPort);
                serverSocket.send(serverReply);
            }else{
                byte[] content = Arrays.copyOf(invalidReply.getBytes(), invalidReply.length());
                DatagramPacket serverReply = new DatagramPacket(content, content.length, clientIP, clientPort);
                serverSocket.send(serverReply);
            }
            serverSocket.close();
        }
    }
}
