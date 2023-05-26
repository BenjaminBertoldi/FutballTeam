package club;

public class Field  {
    private int lennght;
    private int width;

    public Field(int lennght, int width) {
        this.lennght = lennght;
        this.width = width;
    }

    public int getLennght() {
        return lennght;
    }

    public void setLennght(int lennght) {
        this.lennght = lennght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Field Dimension:\n" +
                "Lenght: " + lennght + " Meters\n" +
                "Width: " + width + " Meters"
                ;
    }

}

