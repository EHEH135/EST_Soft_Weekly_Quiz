# 문제 접근 방법
a⊕b 연산자는 a 숫자에 b 숫자를 붙인 결과 값입니다.
따라서 compare함수 안에서 형변환을 통해 ⊕연산을 같게 해주고, 다시 형 변환을 통해 두 계산값중 큰 값을 반환하게 하였습니다.

```java
    static int compare(int a, int b){
        int calc1;
        int calc2;
        
        calc1 = Integer.parseInt(Integer.toString(a) +  Integer.toString(b));
        calc2 = 2 * a * b;

        if(calc1 > calc2){
            return calc1;
        }
        return calc2;
    }
```