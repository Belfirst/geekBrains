public class Dog extends Animal {
    private final String name;
    private static int countDog;


    public Dog(String name) {
        this.name = name;
        countDog++;
    }

    public static int getCountDog() {
        return countDog;
    }

    @Override
    public void start(int distanceRun, int distanceSwim, int maxDistanceRun, int maxDistanceSwim){
        if(distanceRun <= maxDistanceRun) {
            System.out.println(this.name + " пробежал(а)" + distanceRun + "м");
        } else System.out.println(this.name + " пробежал(а) 500 метров и устал(а)");
        if(distanceSwim <= maxDistanceSwim) {
            System.out.println(this.name + " пробежал(а)" + distanceSwim + "м");
        } else System.out.println(this.name + " проплыл(а) 10 метров и устал(а)");
    }

}
