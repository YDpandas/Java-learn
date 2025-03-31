Day 4 P48-53

1.两道力扣（9/23）

T9：回文数

```java
    //方式1：不将数字转变为字符串进行对比
    public boolean isPalindrome1(int x) {
        boolean bool = false;
        if(x < 0) return false;
        int num = 0,temp = x,ge;
        while(temp != 0){
            ge = temp % 10;
            num = num * 10 + ge;
            temp = temp / 10;
        }
        if(num == x){
            bool = true;
        }
        return bool;
    }

    //方式2：将输入的数字转换为字符串进行对比
    public boolean isPalindrome2(int x){
        if(x < 0){
            return false;
        }
        String str = Integer.toString(x);
        int left,right;
        left = 0;
        right = str.length() - 1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
```

T23：两数相除

```java
//用了long（自己的）

    public int divide(int dividend, int divisor) {
        long count = 0;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(dividend == 0){
            return 0;
        }
        long dividendLong = Math.abs((long)dividend);
        long divisorLong = Math.abs((long)divisor);
        if((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)){
            while (dividendLong >= divisorLong) {
                long temp = divisorLong;
                long multiple = 1;
            while (dividendLong >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            count += multiple;
            dividendLong -= temp;
            }

        }
        else{
            while (dividendLong >= divisorLong) {
                long temp = divisorLong;
                long multiple = 1;
            while (dividendLong >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            count += multiple;
            dividendLong -= temp;
            }
            count = -count;
        }

        if (count > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (count < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) count;
        }
    }


//官方解法（二分查找）   （没太看懂）
	public int divide(int dividend, int divisor) {
        // 考虑被除数为最小值的情况
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == 1) {
                return Integer.MIN_VALUE;
            }
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        // 考虑除数为最小值的情况
        if (divisor == Integer.MIN_VALUE) {
            return dividend == Integer.MIN_VALUE ? 1 : 0;
        }
        // 考虑被除数为 0 的情况
        if (dividend == 0) {
            return 0;
        }

        // 一般情况，使用二分查找
        // 将所有的正数取相反数，这样就只需要考虑一种情况
        boolean rev = false;
        if (dividend > 0) {
            dividend = -dividend;
            rev = !rev;
        }
        if (divisor > 0) {
            divisor = -divisor;
            rev = !rev;
        }

        int left = 1, right = Integer.MAX_VALUE, ans = 0;
        while (left <= right) {
            // 注意溢出，并且不能使用除法
            int mid = left + ((right - left) >> 1);
            boolean check = quickAdd(divisor, mid, dividend);
            if (check) {
                ans = mid;
                // 注意溢出
                if (mid == Integer.MAX_VALUE) {
                    break;
                }
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return rev ? -ans : ans;
    }

    // 快速乘
    public boolean quickAdd(int y, int z, int x) {
        // x 和 y 是负数，z 是正数
        // 需要判断 z * y >= x 是否成立
        int result = 0, add = y;
        while (z != 0) {
            if ((z & 1) != 0) {
                // 需要保证 result + add >= x
                if (result < x - add) {
                    return false;
                }
                result += add;
            }
            if (z != 1) {
                // 需要保证 add + add >= x
                if (add < x - add) {
                    return false;
                }
                add += add;
            }
            // 不能使用除法
            z >>= 1;
        }
        return true;
    }
```

2.无限循环，跳转控制

1)  for,while,do...while的无限循环

```java
//for格式的无限循环
        /*for(;;){
            System.out.println("学习");
        }*/

        //while格式的无限循环
        /*while(true){
            System.out.println("学习");
        }*/

        //注意事项
        //无限循环的下面不能再写其他代码了，因为循环永远停不下来，那么下面的代码永远执行不到
```

2）continue;  break

3.练习

1）逢七过

```java
    public static void main(String[] args) {
        int num,ge,shi;
        for(int i = 1;i < 100; i++){
            ge = i % 10;
            shi = i / 10;
            if (ge == 7 || shi == 7 || i % 7 == 0) {
                System.out.println("过");
            }
            else {
                System.out.println(i);
            }
        }
        System.out.println("100");
    }
```

2）求平方根

```java
    public static int sqrt(int x) {
        if (x < 0) {
            System.out.println("不存在实根");
            return -1;
        } else if (x == 0) {
            return 0;
        }
        int i;
        for (i = 1; i <= x; i++) {
            if (i * i == x) {
                return i;
            } else if (i * i > x) {
                return i - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = sqrt(x);
        System.out.println(result);
    }
```

3.求质数

```java
    public static void main(String[] args) {
        System.out.println("请输入要判断的数");
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        boolean bool = false;
        for(int i = 2;i<=Math.sqrt(x);i++){
            if(x % i != 0) {
                bool = true;
            }
            else{
                bool = false;
                break;
            }
        }
        if(x == 1 || x == 2 || x == 3){
            bool = true;
        }
        if(bool){
            System.out.println("是质数");
        }
        else {
            System.out.println("不是质数");
        }
    }
```

4.猜数字

```java
    public static void main(String[] args) {
        boolean again = false;
        do {
            Random r = new Random();
            int num = r.nextInt(100) + 1;
            Scanner sc = new Scanner(System.in);
            System.out.println("猜数字吧！(1-100)");
            int guess = sc.nextInt();
            boolean bool = false;
            if (guess > num) {
                System.out.println("大了");
            } else if (guess < num) {
                System.out.println("小了");
            } else {
                System.out.println("答对了!");
                bool = true;
            }
            for (int i = 2; i < 6; i++) {
                if (bool) {
                    break;
                }
                System.out.println("第" + i + "次尝试");
                guess = sc.nextInt();
                if (guess > num) {
                    System.out.println("大了");
                } else if (guess < num) {
                    System.out.println("小了");
                } else {
                    System.out.println("答对了!");
                    bool = true;
                    break;
                }
            }
            if (bool) {
                System.out.println("恭喜！要再来一次吗？（输入Y/N)");
            } else {
                System.out.println("失败了...要再来一次吗？（输入Y/N)");
            }
            String choice = sc.next();
            if (Objects.equals(choice, "Y") || Objects.equals(choice, "y")) {
                again = true;
            } else {
                again = false;
            }
        } while (again);
    }
```

