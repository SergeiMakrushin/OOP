public class Flower {
    private String flowerColor;

    private String flowerName;
    private String country;
    private double cost;
    int lifeSpan;

    double s = Math.pow(10, 3);

    Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor != null || !flowerColor.isEmpty() || !flowerColor.isBlank()) {
            this.flowerColor = flowerColor;
        } else {
            this.flowerColor = "белый";
        }
        this.flowerName = flowerName;

        if (country != null || !country.isEmpty() || !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "России";
        }

        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = Math.ceil(cost * s) / s;
        }


        if (lifeSpan == 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = Math.abs(lifeSpan);
        }


    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return flowerName + ", цвет " + flowerColor + ", из " + country + ", стоимость штуки " + cost + " рублей, срок стояния " + lifeSpan + " дня.";
    }
}
