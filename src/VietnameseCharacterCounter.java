import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VietnameseCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi chữ cái Latin: ");
        String inputString = scanner.nextLine();
        int result = countVietnameseCharacters(inputString);
        System.out.println("Số lượng chữ cái Tiếng Việt có thể tạo thành trong chuỗi là: " + result);
    }

    public static int countVietnameseCharacters(String inputString) {
        Map<String, String> vietnameseCharacters = new HashMap<>();
        vietnameseCharacters.put("aw", "ă");
        vietnameseCharacters.put("aa", "â");
        vietnameseCharacters.put("dd", "đ");
        vietnameseCharacters.put("ee", "ê");
        vietnameseCharacters.put("oo", "ô");
        vietnameseCharacters.put("ow", "ơ");
        vietnameseCharacters.put("uw", "ư");
        vietnameseCharacters.put("w", "ư");
        int count = 0;
        int i = 0;
        while (i < inputString.length() - 1) {
            String substring = inputString.substring(i, i + 2);
            if (vietnameseCharacters.containsKey(substring)) {
                count++;
                i += 2;
            } else {
                i++;
            }
        }
        return count;
    }
}