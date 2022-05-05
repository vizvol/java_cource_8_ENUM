public enum Season {
    winter("white"),
    Spring("green"),
    summer("blue"),
    autumn("yellow");

    private String color;

    private Season(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}



