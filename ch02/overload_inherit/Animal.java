public class Animal {
    public void say(A a) {
	System.out.println("Animal says: " + a.toString());
    }

    public static void main(String [] args) {
	Animal animal = new Horse();
	animal.say(new A()); // "Animal says: a"
	animal.say(new B()); // "Animal says: b" - not overridden

	Horse horse = new Horse();
	horse.say(new A()); // "Animal says: a"
	horse.say(new B()); // "Horse says: b" - overrloaded
    }
}

class Horse extends Animal {
    public void say(B b) {
	System.out.println("Horse says: " + b.toString());
    }
}

class A {
    public String toString() {
	return "a";
    }
}

class B extends A {
    public String toString() {
	return "b";
    }
}