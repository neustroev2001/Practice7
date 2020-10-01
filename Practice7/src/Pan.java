public class Pan  extends  Dish{
    int radius;
    int deep;
    double volume;

    public Pan(int radius, int deep) {
        this.radius = radius;
        this.deep = deep;
    }

    @Override
    public void calcVolume() {
        volume =  radius* deep* 10;
    }

    public void makePasta(){
        System.out.println("Pasta is ready");
    }
}