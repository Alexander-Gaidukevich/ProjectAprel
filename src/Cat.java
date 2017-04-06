import java.util.Comparator;

public class Cat {
    private String name;
    private String poroda;
    private double weight;
    private String color;
    private String colorEye;

    public Cat(String name, String poroda, double weight, String color, String colorEye) {
        this.name = name;
        this.poroda = poroda;
        this.weight = weight;
        this.color = color;
        this.colorEye = colorEye;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorEye() {
        return colorEye;
    }

    public void setColorEye(String colorEye) {
        this.colorEye = colorEye;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (Double.compare(cat.weight, weight) != 0) return false;
        if (!name.equals(cat.name)) return false;
        if (!poroda.equals(cat.poroda)) return false;
        if (!color.equals(cat.color)) return false;
        return colorEye.equals(cat.colorEye);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + poroda.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + color.hashCode();
        result = 31 * result + colorEye.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", colorEye='" + colorEye + '\'' +
                '}';
    }


}
