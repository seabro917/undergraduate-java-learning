package GenericTest;
/**
 * 泛型类的泛型数据类型在类被使用的时候确定 ---> 所以类中的静态变量不可以定义成泛型，因为静态变量不是在使用时确定，而是在编译时
 * 就已经确定 （全局变量也是）
 * 同理，泛型接口中只有接口中的方法可以定义为泛型方法，因为接口中的变量只有全局和静态变量。
 * 泛型方法只能访问传入对象的信息，而不能修改传入的对象的信息，因为和上面一样，泛型方法的泛型类型只有在方法被调用即使用的时候
 * 才能确定，而要想修改传入对象的信息，那么数据类型必须给定。
 * 
 * 父类为泛型类
 * 1、属性
 * 2、方法
 * 
 * 
 * 要么子类和父类同时擦除，要么子类大于等于父类的类型
 * 不能子类擦除，父类泛型
 * 1、属性类型
 *  父类中，随父类而定
 *  子类中，随子类而定
 * 2、方法重写
 *  随父类而定
 *  
 *  没有泛型数组
 *  泛型数组只能声明不能使用
 *  一种解决办法是：可以在方法的返回值里声明返回泛型数组，在方法return里面进行强转。
 * @author 海哥昨晚没吃饭
 *
 */

public abstract class Father<T,T1> {
	T name;
	public abstract void test(T t);

}

/**
 * 子类声明为指定具体类型
 * 属性类型为具体类型
 * 方法的类型也为具体类型
 * @author 海哥昨晚没吃饭
 */
class Child1 extends Father<String,Integer> // 子类这里声明时指定了具体类型
{
	String t2;

	@Override
	public void test(String t) { //重写方法中泛型随父类而定
		
	} 
}

/**
 * 子类也为泛型类,类型在使用时确定
 * 子类的泛型父类保持一致（顺序可以调换） （父类有的泛型子类必须都有，但不仅局限于）
 * @author 海哥昨晚没吃饭
 */
class Child2<T1,T3,T> extends Father<T,T1> //子类的泛型可以大于父类
{
	T1 t2;
	T t4;
	
	@Override
	public void test(T t) {  //重写方法中泛型随父类而定
		
	}
}
/**
 * 子类为泛型类，父类不指定泛型-->泛型的擦除
 * 泛型的擦除使用Object替换
 * @author 海哥昨晚没吃饭
 */
class Child3<T1,T> extends Father  //子类的泛型可以大于父类
{
	T1 name2;//这个name2是子类自己的属性，在调用该类的时候，使用的时候指定类型。
	         //而父类中那个‘name’的变量的属性被擦除成Object类。

	@Override
	public void test(Object t) {  //重写方法中泛型随父类而定 这里父类泛型被擦除 所以是Object类
		//this.name被擦除成Object类型
	}
	
}
/**
 * 子类和父类同时擦除
 * @author 海哥昨晚没吃饭
 */
class Child4 extends Father
{
	
	@Override
	public void test(Object t) {
		//this.name被擦除成Object类型
	}
	
}
/**
 * 错误：子类擦除，父类使用泛型。
 * @author 海哥昨晚没吃饭
class Child5 extends Father<T t1>
{
	
	@Override
	public void test(Object t) {
	}
}
*/