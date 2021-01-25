public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
        if(satiety)
        System.out.println(name + " сыт(а)");
        else System.out.println(name + " голоден(а)");
    }
}
