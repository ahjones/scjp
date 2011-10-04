class Creature {
    public String getName() {
	return "bob";
    }
}

interface Dragon {
    int getName();
}

class Imp extends Creature implements Dragon {
    public int getName() {
	return 2;
    }
}