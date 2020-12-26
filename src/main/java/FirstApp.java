import java.util.Scanner;
public class FirstApp {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        Задача №2
//--------------------------------------------------------------------------
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String randomWord = getRandomWord(words);
        boolean play = true;
        while (play) {
            System.out.println("Введите слово.");
            play = playGame(randomWord);
        }
    }
//
//      Задача №1
//-----------------------------------------------------------------------------
//        int play = 1;
//        while(play == 1){
//            playGame(3);
//            System.out.println("Повторить игру еще раз? 1 - да / 0 - нет.");
//            play = getNumber(0, 1);
//            scanner.close();
//        }
//    }
//
//    public static int getNumber(int min, int max){
//        int num;
//        do {
//            System.out.println("Введите число от " + min + " до " + max);
//            num = scanner.nextInt();
//        } while (num < min || num > max);
//        return num;
//    }
//
//    public static void playGame(int count){
//        int num;
//        int remains = count;
//        int numRandom = (int) (Math.random() * 10);
//
//        for (int i = 0; i < count; i++ ) {
//
//            num = getNumber(0, 10);
//            --remains;
//            if(num == numRandom){
//                System.out.println("Победа!!!");
//                break;
//            } else if(remains == 0){
//                System.out.println("Игра окончена. Загаданое число " + numRandom);
//                break;
//            } else if(num > numRandom){
//                System.out.println("Загаданое число меньше. Осталось попыток " + remains);
//            } else {
//                System.out.println("Загаданое число больше. Осталось попыток " + remains);
//            }
//        }
//
//    }
//--------------------------------------------------------
//    Задача №2

    public static String getRandomWord (String[] words){
        int num = (int)(Math.random() * words.length);
        return words[num];
    }

    public static boolean playGame(String randomWord){
        char a,b;
        String word = scanner.nextLine();

        if(randomWord.equals(word)){
            System.out.println("Победа!!!");
            return false;
        } else {
            int lengthArras;
            if(word.length() > randomWord.length()) lengthArras = randomWord.length();
            else lengthArras = word.length();

            for (int i = 0; i < lengthArras; i++){
                a = word.charAt(i);
                b = randomWord.charAt(i);
                if(a == b) {
                    System.out.print(a);
                } else System.out.print("#");
            }
            for(int i = 0; i < 15 - lengthArras; i++){
                System.out.print("#");
            }
            System.out.println("");
            System.out.println("Не верно");
        }
        return true;
    }

}
