public class ScannerExample {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("請輸入第一個整數");
        int num1 = scanner.nextInt();

        System.out.println("請輸入第二個整數");
        int num2 = scanner.nextInt(); // 修正拼字錯誤

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // 輸出更清楚

        scanner.close(); // 記得關閉 Scanner
    }
}
