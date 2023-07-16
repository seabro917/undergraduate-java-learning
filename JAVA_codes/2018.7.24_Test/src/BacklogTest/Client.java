package BacklogTest;

import java.net.Socket;
public class Client {
 public static void main(String[] args) throws Exception{
  final int length = 100;
  String host = "localhost";
  int port = 1121;
  Socket[] socket = new Socket[length];
  for(int i = 0;i<length;i++){
   socket[i] = new Socket(host,port);
   System.out.println("第"+(i+1)+"次连接成功！");
  }
  Thread.sleep(3000);
  for(int i=0;i<length;i++){
   socket[i].close();
  }
  System.out.println("所有连接都被释放掉了。");
 }
}