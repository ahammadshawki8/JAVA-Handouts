public class Interface {
    public static void main(String[] args) {
        Fly doggy = new Dog();
        Bird bird = new Bird();
        Airplane airplane = new Airplane();

        System.out.println(doggy.fly());
        System.out.println(((Dog) doggy).makeSound());

        System.out.println(bird.fly());
        System.out.println(bird.makeSound());

        System.out.println(airplane.fly());
    }
}
