package tcp;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class tcp_Server {
    public static void main(String[] args) throws Exception {
        ServerSocketChannel welcomeChannel =
                ServerSocketChannel.open();
        welcomeChannel.socket().bind(new InetSocketAddress(3000));

        while(true) {
            SocketChannel serveChannel = welcomeChannel.accept();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            //read from the channel into the buffer
            serveChannel.read(buffer);
            int bytesRead = serveChannel.read(buffer);
            buffer.flip();
            byte[] a = new byte[bytesRead];
            buffer.get(a);
            System.out.println(new String(a));
            buffer.rewind();
            //read from the buffer and write into the TCP channel
            serveChannel.write(buffer);
            serveChannel.close();
        }
    }
}










