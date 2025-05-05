package Box;

class Box {
    private int width;
    private int height;
    private int depth;

    public Box(int width, int depth, int height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }
    public int getWidth() {
        return width;
    }
    @Override
    public String toString(){
        return "Box{"+"width=" + width +", height=" + height + ", depth=" + depth +'}';
    }
}
