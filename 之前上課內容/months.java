public class months {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("請輸入月份:");
        int month = scanner.nextInt();
        int days = 0;

        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                System.out.print("輸入年:");
                int y = scanner.nextInt();
                if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                    days = 29; // 閏年
                } else {
                    days = 28; // 平年
                }
                break; // 別忘了這裡也要加 break
            default:
                // 非法月份，保持 days 為 0
                break;
        }

        // 統一在這裡檢查輸出
        if(days != 0) {
            System.out.println(month + "月有" + days + "天");
        } else {
            System.out.println("月份輸入錯誤: " + month);
        }
    }
}