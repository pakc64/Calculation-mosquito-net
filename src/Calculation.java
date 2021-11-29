public class Calculation {
    private int width, height, section;

    public Calculation(int width, int height, int section) {
        this.width = width;
        this.height = height;
        this.section = section;
    }

    public int widthCalc() {

        switch (section) {
            case (0):
                width = 0;
                break;
            case (1):
                width = width - 70;
                break;
            case (2):
                width = (width / section) - 50;
                break;
            default:
                width = (width / section) - 20;
        }
        return width;
    }

    public int heightCalc() {
        height = height - 70;
        return height;
    }
}
