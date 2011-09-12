enum CoffeeSize {
    BIG(8), HUGE(10), OVERWHELMING(16) {
	public String getLidCode() { 
	    return "A";
	}
    };

    CoffeeSize(int ounces) {
	this.ounces = ounces;
    }

    private int ounces;

    public int getOunces() {
	return ounces;
    }

    public String getLidCode() {
	return "B";
    }
}
	