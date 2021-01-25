public class FirstApp {
    public static void main(String[] args) {

        Cat[] catArray;
        catArray = new Cat[5];
        catArray[0] = new Cat("Barsik",10);
        catArray[1] = new Cat("Fat",15);
        catArray[2] = new Cat("Little",5);
        catArray[3] = new Cat("Slow",10);
        catArray[4] = new Cat("Looser",10);

        Plate plate = new Plate(45);
        plate.info();
        for (Cat cat : catArray) {
            cat.eat(plate);
        }
        plate.info();
        plate.addFood(45);
        plate.info();
        for (Cat cat : catArray) {
            cat.eat(plate);
        }
        plate.info();
    }
}
