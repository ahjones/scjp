class Thrower implements IThrower {
    public void doThing() {
	throw new Exception();
    }
}

interface IThrower {
    void doThing() throws Exception;
}