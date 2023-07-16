public class Test
{
    public static void main(String args[]) throws java.io.IOException  //抛出IO异常
    {  
        System.out.print("输入多行字符串，每行以回车换行符结束，输入流以Ctrl+Z结束：");
        int i=0;
        while ((i=System.in.read())!=-1)                   //等待键盘输入，-1表示标准输入流结束，从标准输入流中读取一个字节
        {
            System.out.print((char)i+"("+i+") ");          //分别以字符和编码方式显示，以Ctrl+Z结束的一行字符串读不到?
            if (i==10)                                     //回车符的ASCII编码
               System.out.print("\nInput：");
        }
        System.out.print(i+" ");                           //-1,以Ctrl+Z结束的一行字符串读不到?
//        System.in.close();                               	//关闭标准输入流
   }
}