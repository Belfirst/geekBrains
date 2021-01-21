public class FirstApp {

    public static void main(String[] args) {



        Animal dogBob = new Animal();
        Cat dogB = new Cat("B");
        Cat catGolf = new Cat("Golf");
        Dog dogRex = new Dog("Rex");

        dogB.start(200,20, 500, 10);
        dogBob.start(200,20,500,10);
        catGolf.start(400,50,200,0);
        dogRex.start(300,40,500,10);

        System.out.println("Созданных животных " + Animal.getCount());
        System.out.println("Созданных котов " + Cat.getCountCat());
        System.out.println("Созданных собак " + Dog.getCountDog());
    }
}
