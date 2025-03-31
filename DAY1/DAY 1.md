DAY 1   视频P1-P29

1.Java的安装及配置&IDEA 的安装与配置

2.HelloWorld

```java
public class Main//与类名相同 
{
	//主入口
    public static void main(String[] args) {
    //输出
        System.out.println("Hello, World!");
    }
}
```

3.基本知识（字面量/转义符/关键字/类型/标识符）

```
Eg:
整数：byte-1字节 short-2 int-4 long-8 float-4 double-8 char-2 boolean-1 
	字符串 String
```

4.键盘录入

```java
//导包
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //创建对象
        Scanner sc = new Scanner(System.in);
        //记录输入的文本到变量中
        int i = sc.nextInt();
        System.out.println(i);
    }
}
```

