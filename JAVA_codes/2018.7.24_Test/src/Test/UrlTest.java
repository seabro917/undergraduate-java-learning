package Test;
/**
 * 可以看到最后一行代码每一次显示出本地所使用的端口号是不一样随机的。（好像有那么一丢丢的规律？+1+2这样？）
 */

import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class UrlTest {
    public static void main(String[] args) throws UnknownHostException, IOException {
        URL url = new URL("http://www.szu.edu.cn/");        //深圳大学首页
        try(Socket socket = new Socket(url.getHost(),80)){  //本机与深圳大学服务器连接
            socket.setSoTimeout(6000);                      //超过6秒表示连接超时，防止服务器挂起
            System.out.println(socket.getSoTimeout());  
            System.out.println(socket.isConnected());       //检查连接是否打开      
            System.out.println(socket.getKeepAlive());      //探测服务器是否有活动，只有在socket连接时有用
            System.out.println(socket.isClosed());          //检查连接是否关闭
            System.out.println(socket.toString());          //查看此连接信息
            //与服务器连接
        }
    }
}