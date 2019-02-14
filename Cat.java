class Cat {
    private String name = "";
    private int appetite = 0;
    boolean isFill;

    Cat (String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isFill = false;
    }

    void eat(Plate plate){
        if (plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            isFill = true;
        }
    }

    void info() {
        System.out.println(String.format("Кот %s, аппетит %d", name, appetite));
    }
}
