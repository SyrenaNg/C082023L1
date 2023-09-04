import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class C082023L1 {
    public static void main(String[] args) {
        System.out.println("Hello Loc!");

        int myFirstVariable;
        myFirstVariable = 1;
        System.out.println("myFirstVariable");
        String name = "Loc";
        System.out.print(name);
        int myNumber = 2;
        byte myByte = 1;
        // boolean myBoolean = true;
        int a = 3;
        int b = 5;
        //char x;
        //int y;
        int result = myNumber + b;
        // System.out.println(y = result);
        System.out.println(myByte);
        System.out.println(a + "+" + b + "x");

    }

    //Người dùng nhập vào thì :
    static class DienTichHCN {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào chiều dài của hình chữ nhật:");
            double length = scanner.nextDouble();
            System.out.println("Nhập vào chiều rộng của hình chữ nhật:");
            double width = scanner.nextDouble();
            double area = length * width;
            System.out.println("Diện tích hình chữ nhật là:" + area);
        }
    }

    public static class GiaiPhuongTrinhBac1 {
        public static void main(String[] args) {
            int aNumber, bNumber;
            double nghiem;
            Scanner scanner = new Scanner(System.in);
            //5
            System.out.println("Nhập vào số a:");
            aNumber = scanner.nextInt();
            //2
            System.out.println("Nhập vào số b:");
            bNumber = scanner.nextInt();
            System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
            if (aNumber == 0) {
                if (bNumber == 0) {
                    System.out.println("Phương trình này có vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                nghiem = (double) -bNumber / aNumber;
                System.out.println("Phương trình có nghiệm x = " + nghiem + ".");
            }
        }
    }


    public static class bai2 {
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0 && i % 5 == 0) {
                    System.out.println(i);
                }
            }
        }

    }

    public static class bai1 {
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }

        }
    }
    public static class ba3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Weight: ");
            float Weight = sc.nextFloat();
            System.out.println("Height: ");
            float Height = sc.nextFloat();
            float BMI = Weight / (Height * Height);
            System.out.println("BMI" + BMI);


        }

    }
    public static class bai4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Cho so: ");
            int number = sc.nextInt();
            int giaithua = 1;
            for (int i = 1; i <= number; i++) {
                giaithua = giaithua * i;
            }
            System.out.println("Giaithua: " + giaithua);
        }
    }
}