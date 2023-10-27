package update;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws Exception {
        while(true) {
            if (args.length != 2) {
                System.out.print("Syntax: EchoClient <serverIP><serverPort>");
                return;

            }
            InetAddress serverIP = InetAddress.getByName(args[0]);
            int serverPort = Integer.parseInt(args[1]);

            //read message from user
            while (true) {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter Date to get the date info, enter Time to get the time info");
                String userMessage = keyboard.nextLine();
                DatagramSocket socket = new DatagramSocket();
                if (userMessage.equals("Date")) {
                    DatagramPacket request = new DatagramPacket(userMessage.getBytes(),
                            userMessage.getBytes().length,
                            serverIP,
                            serverPort);
                    socket.send(request);
                } else if (userMessage.equals("Time")) {
                    DatagramPacket request = new DatagramPacket(userMessage.getBytes(),
                            userMessage.getBytes().length,
                            serverIP,
                            serverPort);
                    socket.send(request);
                } else {
                    DatagramPacket request = new DatagramPacket(userMessage.getBytes(),
                            userMessage.getBytes().length,
                            serverIP,
                            serverPort);
                    socket.send(request);


                }
                // receive and process the server reply
                DatagramPacket reply = new DatagramPacket(new byte[1024], 1024);
                socket.receive(reply);
                byte[] serverMessage = Arrays.copyOf(reply.getData(), reply.getLength());
                System.out.println(new String(serverMessage));
                socket.close();
            }
        }
    }
}
