class Rabbit extends Animal {
    private static final int MAX_AGE = 5;

    @Override
    protected int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    public void act() {
        if (isAlive()) {
            incrementAge();
            System.out.println("Rabbit is hopping. Age: " + age);
        } else {
            System.out.println("Rabbit has died.");
        }
    }
}
