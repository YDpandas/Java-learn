DAY 3 P39-P47

1.分支：if-else if-else; switch;

```java
        boolean flag = true;
        if(flag){
            System.out.println("flag的值为true");
        }
//*****
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量");
        int wine = sc.nextInt();
        if(wine > 2){
        System.out.println("小伙子，不错哟！！");
//*****
        int number = 10;
        switch (number) {
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }
//*****
        int number = 10;
        switch (number){
            case 1:
                System.out.println("number的值为1");
                break;
            case 10:
                System.out.println("number的值为10");
                // break;
            case 20:
                System.out.println("number的值为20");
                break;
            default:
                System.out.println("number的值不是1,10或者20");
                // break;
        }
```

2.循环：for;while;do...while;

```java
        for (int i = 1; i <= 10 ; i++){
            System.out.println("HelloWorld");
        }

        int i = 1;
        while(i <= 100){
            System.out.println(i);
            i++;
        }

		//求1-100之间的偶数和

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0){
                sum = sum + i;
            }
            
        /* 需求：键盘录入两个数字，表示一个范围。
        统计这个范围中。
        既能被3整除，又能被5整除数字有多少个？*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请录入一个数字表示范围的结束");
        int end = sc.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
            //对每一个数字进行判断，统计有多少个满足要求的数字
            if (i % 3 == 0 && i % 5 == 0) {
               // System.out.println(i);
                count++;
            }
        }

```



task1

```java
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数：");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int j = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int k = sc.nextInt();

        int min;

        if( i < j && i < k){
            min = i;
        }else if( j < i && j < k){
            min = j;
        }else{
            min = k;
        }

        System.out.println("最小值是" + min);
    }
}
```

