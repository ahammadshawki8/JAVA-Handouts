public interface Fly {
    public String fly();
}


class Dog implements Fly {
    public String fly() {
        return "I can't fly!";
    }

    public String makeSound() {
        return "Woof! Woof!";
    }
}


class Bird implements Fly {
    public String fly() {
        return "I can fly!";
    }

    public String makeSound() {
        return "Chirp! Chirp!";
    }
}

class Airplane implements Fly {
    public String fly() {
        return "I can fly at high speed!";
    }
}