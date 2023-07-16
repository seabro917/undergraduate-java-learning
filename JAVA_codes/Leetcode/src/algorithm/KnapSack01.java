package algorithm;
 /*
  * 横向和纵向的过程
  * 可以这样理解: 根据最优性原理:
  * "多阶段决策过程的最优决策序列具有这样的性质：不论初始状态和初始决策如何，对于前面决策所造成的某一状态而言，
  * 其后各阶段的决策序列必须构成最优策略."
  * 所以有两条路: 
  * 横向: 保持全部的东西都available, 每次增加背包容量.
  * 纵向: 每次保持背包容量不变, 每次增加可以拿的东西.
  * 在最后一步之前, 上述这两个决策都已经是最优的了, 所以我们从这两个角度来进行下一步(来到最后一步), 应该看这两个哪个给我们最优解.
  * 到最后一步, 无非就两个选择: 装或者不装.
  * 不装的话, 我们就从纵向来考虑: 考虑背包容量(C)一直不变, 每次增加可以装的东西: 那么既然不装, 这么此时价值就是V[i-1, C];
  * 装的话, 我们从横向来考虑, 考虑背包容量每次增加, 但是我们每次装的东西可以从所有available的里面选, 这样, 我们不装之前就是
  * V[i-1,]  ......
  * 草 比比半天写到这里发现自己想错了md
  * 反正tmd就是
  * 从顶向下, 考虑最后一步之前, 反正最后一步要么装要么不装, 不装就是V[i-1, C], 装就是Vi+V[i-1, C-Wi]; 
  */
public class KnapSack01 {
    /**
     * 解决背包问题的递归函数
     *
     * @param w        物品的重量数组
     * @param v        物品的价值数组
     * @param index    当前待选择的物品索引
     * @param capacity 当前背包有效容量
     * @return 最大价值
     */
    private static int solveKS(int[] w, int[] v, int index, int capacity) {
        //基准条件：如果索引无效或者容量不足，直接返回当前价值0
        if (index < 0 || capacity <= 0)
            return 0;

        //不放第index个物品所得价值
        int res = solveKS(w, v, index - 1, capacity);
        //放第index个物品所得价值（前提是：第index个物品可以放得下）
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