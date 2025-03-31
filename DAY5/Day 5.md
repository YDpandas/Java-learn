Day 5

1.数组的基础，定义，创建，更改，动态创建，基本问题；

```java
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int result = 0;
        System.out.println(arr1[2]);
        for (int j : arr1) {
            System.out.println(j);
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
            result += i;
        }
        System.out.println(result);

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] % 2 == 0){
                arr1[i] /= 2;
            }else{
                arr1[i] *= 2;
            }
            System.out.println(arr1[i]);
        }


        System.out.println("输入数组长度：");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr1 = new String[n];
        System.out.println(arr1.length);

```

2.数组的输入

```java
//数组的输入

        //字符串转
        System.out.println("请输入几个数并用逗号隔开：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] arr  = str.split(",");
        int[] b = new int[arr.length];
        for(int j = 0; j<b.length;j++) {
            b[j] = Integer.parseInt(arr[j]);
            System.out.println(b[j]+" ");
        }

        //或者循环输入
        System.out.println("请输入3个数字，并用空格隔开");
        Scanner sc1 = new Scanner(System.in);
        int[] arr1 = new int[3];
        for (int k = 0; k < 3; k++) {
            arr1[k] = sc.nextInt();
        }
        System.out.println(arr1[2]);
```

3.练习：

1）求最值

```java
        int[] arr2 = {33,5,22,44,555};
        int result = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i] > result){
                result = arr2[i + 1];
            }
        }
        System.out.println("最大值为：" + result);
```

