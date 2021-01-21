public class Animal {
    private static int count;

    public Animal() {
        count++;
    }

    public void start(int distanceRun, int distanceSwim, int maxDistanceRun, int maxDistanceSwim){
        System.out.println("Неизвестное животное пробежало " + distanceRun + "м");
        System.out.println("Неизвестное животное проплыло " + distanceSwim + "м");
    }

    public static int getCount() {
        return count;
    }
}
