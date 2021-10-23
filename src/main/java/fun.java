/**
 * Project name(项目名称)：泛型
 * Package(包名): PACKAGE_NAME
 * Class(类名): Add
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/23
 * Time(创建时间)： 21:36
 * Version(版本): 1.0
 * Description(描述)： 定义泛型方法的语法格式如下：
 * [访问权限修饰符] [static] [final] <类型参数列表> 返回值类型 方法名([形式参数列表])
 * public static <T> List find(Class<T> cs,int userId){}
 * 一般来说编写 Java 泛型方法，其返回值类型至少有一个参数类型应该是泛型，而且类型应该是一致的，如果只有返回值类型或参数类型之一使用了泛型，
 * 那么这个泛型方法的使用就被限制了。
 */

public class fun
{
    public static <T> void display(T a1, T a2)
    {
        System.out.println(a1+" "+a2);
    }

    public static void main(String[] args)
    {
        fun.display("4",5);
    }
}
