import java.util.Scanner;

class AddTwoNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter two values:");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println("Addition:"+(a+b)+"\nSubstraction:"+(a-b)+"\nMultiplication:"+(a*b)+"\nDivision:"+(a/b)+"\nModular Division:"+(a%b));
    }
}
