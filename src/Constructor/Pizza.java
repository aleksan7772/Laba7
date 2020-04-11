package Constructor;

public class Pizza  {
    Circle circle = new Circle(50);
    double basis = circle.radius();
    String name;
    String[] composition; // состав
    int cost;
    {
        basis = circle.getRadiusIsLong();
    }
    public Pizza(String name, String[] composition, int cost) {
        this.name = name;
        this.composition = composition;
        this.cost = cost;
    }

    public Pizza(double basis) {
        this.basis = basis;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public double getBasis() {
        return basis;
    }

    public void setBasis(double basis) {

        this.basis = basis;
    }

    public String[] getComposition() {
        return composition;
    }

    public void setComposition(String[] composition) {
        this.composition = composition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public static String[] fourSeasons() {
        String[] fourSeasons = new String[]{"bacon","ham","salami","cheese","tomato"};
        return fourSeasons;
    }
    public static String[] margarita() {
        String[] margarita = new String[]{"olive oil","basil","tomato sauce","Mozzarella","tomato"};
        return margarita;
    }

}
