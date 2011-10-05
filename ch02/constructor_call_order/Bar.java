class Foo {
    public Foo() {
	System.out.println("Foo: noargs");
    }

    public Foo(String s) {
	System.out.println("Foo: " + s);
    }
}

class Bar extends Foo {
    public Bar() {
	super("bar");
	System.out.println("Bar: no arg constructor");
    }

    public Bar(String s) {
	this();
	System.out.println("Bar: " + s);
    }

    public static void main(String[] args) {
	Bar b = new Bar("main");
    }
}