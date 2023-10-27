package tcp;
import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Arrays;
import java.util.Scanner;
public class tcp_Client {

        public static void main(String[] args) throws Exception{
            if (args.length != 2){
                System.out.println(
                        "Syntax: tcp_echo.TCPEchoClient <ServerIP> <ServerPort>");
                return;
            }

            int serverPort = Integer.parseInt(args[1]);

            Scanner keyboard = new Scanner(System.in);
            String message = keyboard.nextLine();

            ByteBuffer buffer = ByteBuffer.wrap(message.getBytes());

            SocketChannel channel = SocketChannel.open();
            channel.connect(new InetSocketAddress(args[0], serverPort));
            //write the buffer content into the TCP channel
            channel.write(buffer);

            System.out.println(channel);
            buffer.clear();
            int bytesRead = channel.read(buffer);
            buffer.flip();
            byte[] reply = new byte[bytesRead];
            buffer.get(reply);
            String replyMessage = new String(reply);
            System.out.println("Server reply: " + replyMessage);
        }
    }

