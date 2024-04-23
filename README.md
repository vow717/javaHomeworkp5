提供以下可直接使用的User类，直接使用getter/setter方法。
编写测试类主函数，模拟创建5个用户，分属3个不同城市
创建Set集合，添加以上元素对象。思考，为什么使用Set集合？
public class User {
    private int id;
    private String name;
    private String city;

    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    // 省略getter/setter方法
}
2.创建静态方法，传入封装User类型元素的Set集合，转为List集合返回。不同集合类型对象相互转换的简单方式？
3.创建静态方法，传入封装User类型元素的Set集合，以及用户ID，基于迭代器，在集合移除指定ID用户。方法参数？
4.创建静态方法，传入封装User类型元素的Set集合，将集合中元素，以城市名称为键，相同城市用户集合为值，分组传入测试集合，调用测试
