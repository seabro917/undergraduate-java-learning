package algorithm;
 /*
  * ���������Ĺ���
  * �����������: ����������ԭ��:
  * "��׶ξ��߹��̵����ž������о������������ʣ����۳�ʼ״̬�ͳ�ʼ������Σ�����ǰ���������ɵ�ĳһ״̬���ԣ�
  * �����׶εľ������б��빹�����Ų���."
  * ����������·: 
  * ����: ����ȫ���Ķ�����available, ÿ�����ӱ�������.
  * ����: ÿ�α��ֱ�����������, ÿ�����ӿ����õĶ���.
  * �����һ��֮ǰ, �������������߶��Ѿ������ŵ���, �������Ǵ��������Ƕ���������һ��(�������һ��), Ӧ�ÿ��������ĸ����������Ž�.
  * �����һ��, �޷Ǿ�����ѡ��: װ���߲�װ.
  * ��װ�Ļ�, ���Ǿʹ�����������: ���Ǳ�������(C)һֱ����, ÿ�����ӿ���װ�Ķ���: ��ô��Ȼ��װ, ��ô��ʱ��ֵ����V[i-1, C];
  * װ�Ļ�, ���ǴӺ���������, ���Ǳ�������ÿ������, ��������ÿ��װ�Ķ������Դ�����available������ѡ, ����, ���ǲ�װ֮ǰ����
  * V[i-1,]  ......
  * �� �ȱȰ���д�����﷢���Լ������md
  * ����tmd����
  * �Ӷ�����, �������һ��֮ǰ, �������һ��ҪôװҪô��װ, ��װ����V[i-1, C], װ����Vi+V[i-1, C-Wi]; 
  */
public class KnapSack01 {
    /**
     * �����������ĵݹ麯��
     *
     * @param w        ��Ʒ����������
     * @param v        ��Ʒ�ļ�ֵ����
     * @param index    ��ǰ��ѡ�����Ʒ����
     * @param capacity ��ǰ������Ч����
     * @return ����ֵ
     */
    private static int solveKS(int[] w, int[] v, int index, int capacity) {
        //��׼���������������Ч�����������㣬ֱ�ӷ��ص�ǰ��ֵ0
        if (index < 0 || capacity <= 0)
            return 0;

        //���ŵ�index����Ʒ���ü�ֵ
        int res = solveKS(w, v, index - 1, capacity);
        //�ŵ�index����Ʒ���ü�ֵ��ǰ���ǣ���index����Ʒ���Էŵ��£�
        if (w[index] <= capacity) {
            res = Math.max(res, v[index] + solveKS(w, v, index - 1, capacity - w[index]));
        }
        return res;
    }

    public static int knapSack(int[] w, int[] v, int C) {
        int size = w.length;
        return solveKS(w, v, size - 1, C);
    }

    public static void main(String[] args){
        int[] w = {2,1,3,2};
        int[] v = {12,10,20,15};
        System.out.println(knapSack(w,v,4));
    }
}