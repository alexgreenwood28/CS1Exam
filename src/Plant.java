public class Plant {
    int numWeeksOld;
    String color;
    boolean isEdible;


    public Plant(int numWeeksOld,String color,boolean isEdible ){
        this.numWeeksOld=numWeeksOld;
        this.color=color;
        this.isEdible=isEdible;
    }
    public void printInfo(){
        System.out.println("This plant is "+numWeeksOld+" weeks old. Its color is "+ color+" and it is "+isEdible+" that it is edible.");
    }
}
