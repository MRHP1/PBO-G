abstract class Animal {
    protected int age;
    protected boolean alive;

    public Animal() {
        age = 0;
        alive = true;
    }

    public void incrementAge() {
        age++;
        if (age > getMaxAge()) {
            alive = false;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public abstract void act();
    protected abstract int getMaxAge();
}
