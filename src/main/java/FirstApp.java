public class FirstApp {

    public static void main(String[] args) {



        Animal dogBobic = new Animal();
        Cat dogB = new Cat("B");
        Cat catGolf = new Cat("Golf");
        Dog dogRex = new Dog("Rex");

        dogB.run(200);
        dogB.swim(20);

        dogBobic.run(200);
        dogBobic.swim(20);

        catGolf.run(400);
        catGolf.swim(50);

        dogRex.run(300);
        dogRex.swim(40);

        System.out.println("Созданных животных " + dogBobic.getCount());
        System.out.println("Созданных котов " + catGolf.getCount());
        System.out.println("Созданных собак " + dogRex.getCount());
    }
}
