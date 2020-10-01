public class HomeDog extends Dog{
    private String name = "Dog";

    public HomeDog(String name) {
        this.name = name;
        home();
    }

    public void Dog_at_home(){
        System.out.println(name);
    }

    @Override
    public void home() {
    }
}
