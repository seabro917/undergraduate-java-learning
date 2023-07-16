package BacklogTest;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {
 private int port = 1121;
 private ServerSocket serverSocket;

 public Server() throws Exception{
  serverSocket = new ServerSocket(port,3);
  System.out.println("����������!");
 }
 public void service(){
  while(true){
   Socket socket = null;
   try {
    socket = serverSocket.accept();
    System.out.println("New connection accepted "+
      socket.getInetAddress()+":"+socket.getPort());
   } catch (IOException e) {
    e.printStackTrace();
   }finally{
    if(socket!=null){
     try {
      socket.close();
     } catch (IOException e) {
      e.printStackTrace();
     }
    }
   }
  }
 }

 public static void main(String[] args) throws Exception{
  Server server = new Server();
  Thread.sleep(7000);
  server.service();
 }
} 