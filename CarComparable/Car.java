public class Car implements Comparable<Car> {

    private String name;
    private String type;
    private int horsePower;

    public Car(String name, String type, int horsePower) {
        this.name = name;
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Car o) {
        if (getHorsePower() != o.getHorsePower()) {
            return getHorsePower() - o.getHorsePower();
        }

        if (!getType().equals(o.getType())) {
            return getType().compareTo(o.getType());
        }

        return getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %d%n", getName(), getType(), getHorsePower());
    }

    

}