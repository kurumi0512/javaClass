public class GuessingGame {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 5) + 1;

        if (args.length == 0 || args[0].equalsIgnoreCase("help")) {
            System.out.println("程式用法: java GuessingGame [1-5 數字]");
            return;
        } 
        else if (!args[0].matches("\\d+")) { // 確保輸入是數字
            System.out.println("猜測內容需為數字");
        } 
        else {
            int guess = Integer.parseInt(args[0]);

            if (guess >= 1 && guess <= 5) { // 確保數字在 1~5 之間
                if (guess == randomNum) {
                    System.out.println("恭喜猜對了!");
                } 
                else {
                    System.out.printf("猜錯了! 答案是 %d%n", randomNum);
                }
            } 
            else {
                System.out.println("猜測數字需為 1~5!");
            }
        }
    }
}

       