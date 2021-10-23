/**
 * Project name(项目名称)：泛型
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/23
 * Time(创建时间)： 20:41
 * Version(版本): 1.0
 * Description(描述)：  Java 集合有个缺点，就是把一个对象“丢进”集合里之后，集合就会“忘记”这个对象的数据类型，当再次取出该对象时，
 * 该对象的编译类型就变成了 Object 类型（其运行时类型没变）。
 * Java 集合之所以被设计成这样，是因为集合的设计者不知道我们会用集合来保存什么类型的对象，所以他们把集合设计成能保存任何类型的对象，
 * 只要求具有很好的通用性，但这样做带来如下两个问题：
 * 集合对元素类型没有任何限制，这样可能引发一些问题。例如，想创建一个只能保存 Dog 对象的集合，但程序也可以轻易地将 Cat 对象“丢”进去，所以可能引发异常。
 * 由于把对象“丢进”集合时，集合丢失了对象的状态信息，集合只知道它盛装的是 Object，因此取出集合元素后通常还需要进行强制类型转换。
 * 这种强制类型转换既增加了编程的复杂度，也可能引发 ClassCastException 异常。
 * 所以为了解决上述问题，从 Java 1.5 开始提供了泛型。泛型可以在编译的时候检查类型安全，并且所有的强制转换都是自动和隐式的，提高了代码的重用率
 * 除了可以定义泛型集合之外，还可以直接限定泛型类的类型参数。语法格式如下：
 * public class class_name<data_type1,data_type2,…>{}
 * 其中，class_name 表示类的名称，data_ type1 等表示类型参数。Java 泛型支持声明一个以上的类型参数，只需要将类型用逗号隔开即可。
 * 泛型类一般用于类中的属性类型不确定的情况下。在声明属性时，使用下面的语句：
 * private data_type1 property_name1;
 * private data_type2 property_name2;
 */

public class Student<T1, T2, T3>
{
    public Student()
    {

    }

    public Student(T1 name, T2 sex, T3 age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    private T1 name;
    private T2 sex;
    private T3 age;

    public T1 getName()
    {
        return name;
    }

    public void setName(T1 name)
    {
        this.name = name;
    }

    public T2 getSex()
    {
        return sex;
    }

    public void setSex(T2 sex)
    {
        this.sex = sex;
    }

    public T3 getAge()
    {
        return age;
    }

    public void setAge(T3 age)
    {
        this.age = age;
    }

    public static void main(String[] args)
    {
        Student<String, String, Integer> stu1 = new Student<>("张三", "男", 18);
        System.out.println(stu1.getName());
        System.out.println(stu1.getSex());
        System.out.println(stu1.getAge());
        Student<String, Boolean, Integer> stu2 = new Student<>();
        stu2.setName("李四");
        stu2.setSex(true);
        stu2.setAge(19);
        System.out.println(stu2.getName());
        if (stu2.getSex())
        {
            System.out.println("男");
        }
        else
        {
            System.out.println("女");
        }
        System.out.println(stu2.getAge());
    }
}
