Day 2 P30-P38

1.运算符（+ - * / %）

```java
        //+
        System.out.println(3 + 2);//5
        //-
        System.out.println(5 - 1);//4
        //* (shift + 数字8)
        System.out.println(7 * 9);//63

        //在代码中，如果有小数参与计算，结果有可能不精确的。

        System.out.println(10 / 2);//5
        System.out.println(10 / 3);//3
        System.out.println(10.0 / 3);//3.3333333333333335

        //取模，取余。实际上也是做除法运算，只不过得到的是余数而已。
        System.out.println(10 % 2);//0
        System.out.println(10 % 3);//1

        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number = sc2.nextInt();

        int a = number % 10;
        int b = ( number / 10 ) % 10;
        int c = ( number / 100 ) % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b+c);

        int a = 12;
        int b = 13;
        double c = 10.0;
        System.out.println(a+c);
        System.out.println(a);
```

2.类型转换

​	1)隐式转换（小=>大，byte、short、char => int）;

​	2)强制转换：

​	目标数据类型 变量名 = （目标数据类型）数据；

​	 E:   byte result = (byte)(b1 + b2);

3.字符串的+操作

​	1.拼接，从左到右

​	E:   "123"+"456" => "123456"

​	E：1 + 99 +"年" => "100年"

​	E：1 + 99 +"年"  + 1 + 2 => "100年12"

​	2.字符加数字

​	int a = 1 + 'a'   => ASCII码值相加  //98

4.自增自减（++a(先加后用) a++(先用后加) a-- --a）

5.赋值运算符、关系运算符

6.逻辑运算符（&  |  ^  !）

7.短路逻辑运算符（&& ||）

8.三元运算符

```java
        Scanner sc1 = new Scanner(System.in);
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();
        if(num1 >num2){
            System.out.println("成功");
        }
        else{
            System.out.println("失败");
        }


        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入第二个数字");
        int num2 = sc2.nextInt();

        boolean result = num1 == 6 || num2 == 6 || (num1+num2) % 6 == 0;

        System.out.println(result);


        int a = 165,b = 150,c = 210;
        int result = a>b?a:b;
        result = result>c?result:c;
        System.out.println(result);
        int re2 = max(a,b);
        re2 = max(re2,c);
        System.out.println(re2);
```



task1

```java
public class task1 {
    public static void main(String[] args) {
        double father = 177;
        double mother = 165;
        double son = (father + mother) * 1.08 / 2;
        double daughter = (father * 0.923 + mother) / 2;
        System.out.println("儿子预计身高" + son + "厘米");
        System.out.println("女儿预计身高" + daughter + "厘米");
    }
}
```



task2

```java
public class task2 {
    public static void main(String[] args) {
        int red = 21;
        int green = 24;
        red = red * 2 + 3;
        green *= 2;
        System.out.println(red == green);
    }
}

```



task3

```java
public class task3 {
    public static void main(String[] args) {
        double money1 = 24 + 8 + 3;
        money1 = (money1 >= 30 ? money1 * 0.8 : money1);
        double money2 = 16 + 8 + 3;
        double money = money1 < money2 ? money1 : money2;
        System.out.println(money);
    }
}

```

