class Fox extends Animal {
    private static final int MAX_AGE = 10;

    @Override
    protected int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    public void act() {
        if (isAlive()) {
            incrementAge();
            System.out.println("Fox is hunting. Age: " + age);
        } else {
            System.out.println("Fox has died.");
        }
    }
}
