import java.util.Random;
import java.util.Scanner;

public class FirstApp {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOT_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X  = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();
    public static int count = DOT_TO_WIN;

    public static void main(String[] args) {
        initMap();
        printMap();
        while(true) {
            hummanStep();
            printMap();
            if(checkWin(DOT_X)) {
                System.out.println("Win Humman");
                break;
            }

            if(isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            iaStep();
            printMap();
            if(checkWin(DOT_O)) {
                System.out.println("Win ia");
                break;
            }

            if(isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра окончина");
    }

    public static void initMap(){
        map = new char [SIZE][SIZE];
        for (int i = 0; i < SIZE ;i++ ) {
            for (int j = 0; j < SIZE;j++){
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {

        for(int i = 0; i <= SIZE; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i = 0; i < SIZE; i++){
            System.out.print(i + 1 + " ");
            for(int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hummanStep(){
        int x,y;

        do{
            System.out.println("Enter X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!isValid(x, y)); map[y][x] = DOT_X;

    }

    public static boolean isValid(int x, int y) {
        if(x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if(map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void randStep(){
        int x,y;

        do{
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);

        } while (!isValid(x, y)); map[y][x] = DOT_O;

    }

    public static boolean checkWin(char symb) {
        int countHorizontal = 0;
        int countVertical = 0;
        int countDiagLeft = 0;
        int countDiagRight = 0;
        char horizontal = ' ';
        char vertical = ' ';
        char diagLeft = ' ';
        char diagRight = ' ';



        for(int i = 0; i < SIZE; i++){
            if(map[i][i] == symb && (diagLeft == symb || diagLeft == ' ')) countDiagLeft++;
            diagLeft = map[i][i];
            if(map[i][SIZE - i - 1] == symb && (diagRight == symb || diagRight == ' ')) countDiagRight++;
            diagRight = map[i][SIZE - i - 1];
            for(int j = 0; j < SIZE; j++) {
                if(map[i][j] == symb && (horizontal == symb || horizontal == ' ')) countHorizontal++;
                horizontal = map[i][j];

                if(map[j][i] == symb && (vertical == symb || vertical == ' ')) countVertical++;
                vertical = map[j][i];
                if(countHorizontal == DOT_TO_WIN || countVertical == DOT_TO_WIN) return true;

            }

            if(countDiagRight == DOT_TO_WIN || countDiagLeft == DOT_TO_WIN) return true;
            countVertical = 0;
            countHorizontal = 0;
            horizontal = ' ';
            vertical = ' ';

        }
        return false;
    }


    public static boolean isMapFull() {
        for(int i = 0; i< SIZE;i ++ ) {
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void iaStep() {
        int countHorizontal = 0;
        int countVertical = 0;
        int countXHorizontal = 0;
        int countXVertical = 0;
        int countDiagLeft = 0;
        int countDiagRight = 0;
        int countXDiagLeft = 0;
        int countXDiagRight = 0;
        int count = DOT_TO_WIN;
        boolean state = false;

        if(map[1][1] == DOT_EMPTY) {
            map[1][1] = DOT_O;
            state = true;
        }

        for(int i = 0; i < SIZE;  i++){
            if(map[i][i] == DOT_X) countDiagLeft++;
            if(map[i][SIZE - i - 1] == DOT_X) countDiagRight++;
            if(map[i][i] == DOT_X) countXDiagLeft++;
            if(map[i][SIZE - i - 1] == DOT_X) countXDiagRight++;

        }

        if(countDiagLeft == count) {
            for(int i = 0; i < SIZE; i++){
                if(map[i][i] == DOT_EMPTY) {
                    map[i][i] = DOT_O;
                    state = true;
                    break;
                }
            }
        }

        if(countDiagRight == count) {
            for(int i = 0; i < SIZE; i++){
                if(map[i][SIZE - i - 1] == DOT_EMPTY) {
                    map[i][SIZE - i - 1] = DOT_O;
                    state = true;
                    break;
                }
            }
        }

        if(countXDiagLeft == count - 1) {
            for(int i = 0; i < SIZE; i++){
                if(map[i][i] == DOT_EMPTY) {
                    map[i][i] = DOT_O;
                    state = true;
                    break;
                }
            }
        }

        if(countXDiagRight == count - 1) {
            for(int i = 0; i < SIZE; i++){
                if(map[i][SIZE - i - 1] == DOT_EMPTY) {
                    map[i][SIZE - i - 1] = DOT_O;
                    state = true;
                    break;
                }
            }
        }

        countXDiagLeft = 0;
        countXDiagRight = 0;


        for(int i = 0; i < SIZE; i++){
            if(state == true) break;
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_X) countXHorizontal++;
                if(map[j][i] == DOT_X) countXVertical++;
            }

            if(countXHorizontal == count - 1){
                for(int j = 0; j < SIZE; j++){
                    if(map[i][j] == DOT_EMPTY) {
                        map[i][j] = DOT_O;
                        state = true;
                        break;
                    }
                }
            } else if(countXVertical == count - 1) {
                for(int j = 0; j < SIZE; j++){
                    if(map[j][i] == DOT_EMPTY) {
                        map[j][i] = DOT_O;
                        state = true;
                        break;
                    }
                }

            }
            countXHorizontal = 0;
            countXVertical = 0;
            if(state == true) break;
        }


        for(int i = 0; i < SIZE; i++){
            if(state == true) break;

            for(int j = 0; j < SIZE; j++) {
                if(map[i][j] == DOT_EMPTY || map[i][j] == DOT_O) countHorizontal++;
                if(map[j][i] == DOT_EMPTY || map[j][i] == DOT_O) countVertical++;

            }

            if(countHorizontal == count) {
                for(int j = 0; j < SIZE; j++){
                    if(map[i][j] == DOT_EMPTY) {
                        map[i][j] = DOT_O;
                        state = true;
                        break;
                    }
                }

            } else if(countVertical == count){
                for(int j = 0; j < SIZE; j++){
                    if(map[j][i] == DOT_EMPTY) {
                        map[j][i] = DOT_O;
                        state = true;
                        break;
                    }
                }
            }
            countHorizontal = 0;
            countVertical = 0;
            if(state == true) break;
        }
        if(state == false) {
            randStep();
        }

    }

}
