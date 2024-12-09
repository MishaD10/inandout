
static class Food {
    String name;
    double price;
    String category;

    public Food(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayInfo() {
        System.out.println(name + " - $" + price);
    }
}
}    