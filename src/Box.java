public class Box {
    int x;
    int y;
    int z;

    Box() {}

    Box(int x,int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void print() {
        System.out.println(x + " " + y + " " + z);
    }
}
