public class Dog extends Animal {
    private final String name;
    private static int countDog;


    public Dog(String name) {
        this.name = name;
        countDog++;
    }

    @Override
    public int getCount() {
        return countDog;
    }

    @Override
    public void run(int distance){
        if(distance <= 500) {
            System.out.println(this.name + " пробежал(а)" + distance + "м");
        } else System.out.println(this.name + " пробежал(а) 500 метров и устал(а)");
    }

    @Override
    public void swim(int distance){
        if(distance <= 10) {
            System.out.println(this.name + " пробежал(а)" + distance + "м");
        } else System.out.println(this.name + " проплыл(а) 10 метров и устал(а)");
    }
}
