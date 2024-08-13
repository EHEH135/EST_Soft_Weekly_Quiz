# 문제 접근 방법
주어진 수가 두개밖에 없기 때문에 문자열로 변환 후 연결하고 비교하는 방법이 적합하다고 생각했습니다.
재사용성을 위해 합쳐서 String으로 반환하는 함수 combine,
비교하여 Integer로 반환을 하는 compare 함수를 구현하였습니다.

```java

    static int compare(String a, String b){
        if(Integer.parseInt(a) > Integer.parseInt(b)){
            return Integer.parseInt(a);
        }
        return Integer.parseInt(b);
    }
    static String combine(int a, int b){
        String tmpA = Integer.toString(a);
        String tmpB = Integer.toString(b);

        return (tmpA + tmpB);
    }

```