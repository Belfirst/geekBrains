public class Animal {
    private static int count;

    public Animal() {
        count++;
    }

    public void run(int distance){
        System.out.println("Неизвестное животное пробежало " + distance + "м");
    }

    public void swim(int distance){
        System.out.println("Неизвестное животное проплыло " + distance + "м");
    }

    public int getCount() {
        return count;
    }
}
