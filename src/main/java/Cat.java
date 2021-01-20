public class Cat extends Animal {
    private final String name;
    private static int countCat;

    public Cat(String name){
        this.name = name;
        countCat++;
    }

    @Override
    public int getCount() {
        return countCat;
    }

    @Override
    public void run(int distance){
        if(distance <= 200) {
            System.out.println(this.name + " пробежал(а)" + distance + "м");
        } else System.out.println(this.name + " пробежал(а) 200 метров и устал(а)");
    }

    @Override
    public void swim(int distance){
        System.out.println("Кошки боятся воды!!!");
    }
}
