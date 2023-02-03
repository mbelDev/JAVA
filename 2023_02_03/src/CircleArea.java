import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        final double PI = 3.14;
        double radius = 10;
        double result;
        String hoguResearch;
        Scanner sc = new Scanner(System.in);
        System.out.println("반지름의 길이를 입력하세요");
        radius = sc.nextDouble();
        result = radius * radius * PI;
        System.out.println((int)(result));
        
        Scanner hogu = new Scanner(System.in);
        System.out.println("이름, 도시, 나이, 체중, 결혼 유무를 빈칸으로 분리하여 입력하시오");
        String name = hogu.next();
        String city = hogu.next();
        int age = hogu.nextInt();
        double weight = hogu.nextDouble();
        String merry = hogu.next();
        hoguResearch = ("이름 : "+name+" 거주지 : "+city+" 나이 : "+age+"살 몸무게 : "+weight+"Kg 결혼 유무 : "+merry);
        System.out.println(hoguResearch);
        sc.close();
        hogu.close();
    }
}