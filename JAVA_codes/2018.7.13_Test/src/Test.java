public class Test
{
    public static void main(String args[]) throws java.io.IOException  //�׳�IO�쳣
    {  
        System.out.print("��������ַ�����ÿ���Իس����з���������������Ctrl+Z������");
        int i=0;
        while ((i=System.in.read())!=-1)                   //�ȴ��������룬-1��ʾ��׼�������������ӱ�׼�������ж�ȡһ���ֽ�
        {
            System.out.print((char)i+"("+i+") ");          //�ֱ����ַ��ͱ��뷽ʽ��ʾ����Ctrl+Z������һ���ַ���������?
            if (i==10)                                     //�س�����ASCII����
               System.out.print("\nInput��");
        }
        System.out.print(i+" ");                           //-1,��Ctrl+Z������һ���ַ���������?
//        System.in.close();                               	//�رձ�׼������
   }
}