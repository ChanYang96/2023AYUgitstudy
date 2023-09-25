public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int square() {
        return this.width * this.height;
    }
    public void show(){
        System.out.println("(" + this.x + ", " + this.y + ") " + "좌표를 가진 " + this.width + " * " + this.height + "의 사각형");
    }
    public boolean contains(Rectangle n){
        if((this.x<n.x) && (this.y<n.y) && (this.x+this.width)>(n.x+n.width) && (this.y+this.height)>(n.y+n.height))
            return true;
        else
            return false;
    }
}
