public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if(food >= n) {
            food -= n;
            return true;
        }
        else System.out.println("Еды втарелке недостаточно.");
        return false;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    public void addFood(int n) {
        food += n;
    }
}
