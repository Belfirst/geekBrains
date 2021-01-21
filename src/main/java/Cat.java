public class Cat extends Animal {
    private final String name;
    private static int countCat;

    public Cat(String name){
        this.name = name;
        countCat++;
    }

    public static int getCountCat() {
        return countCat;
    }

    @Override
    public void start(int distanceRun, int distanceSwim, int maxDistanceRun, int maxDistanceSwim){
        if(distanceRun <= maxDistanceRun) {
            System.out.println(this.name + " пробежал(а)" + distanceRun + "м");
        } else System.out.println(this.name + " пробежал(а) 200 метров и устал(а)");
        System.out.println("Кошки боятся воды!!!");
    }

}
