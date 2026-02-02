public class Greenhouse {
   String name;
   boolean sprinklersOn;
   int numberOfFlowers;
   int randomInt;
   String veggie;
   double randomNum;
   int size;

   public Greenhouse(){
       System.out.println("Hello World! Good luck on your exams!");
       name="Planting Parameters at the CSG";
       sprinklersOn=true;
       numberOfFlowers=31;
       System.out.println("Welcome to "+name+ "! It is "+sprinklersOn+" that we are watering plants right now. We have "+numberOfFlowers+" flowers!");
       numberOfFlowers=200;
       System.out.println("Welcome to "+name+ "! It is "+sprinklersOn+" that we are watering plants right now. We have "+numberOfFlowers+" flowers!");
       randomReplant();
       veggieOfTheDay("cucumber");
       countFlowers();
       changeTemperature();
       Plant kimPlant=new Plant(3, "orange",true);
       kimPlant.printInfo();
       Plant myPlant=new Plant(9, "blue",false);
       myPlant.printInfo();
       starTriangle(5);
       perimeterTriangle(7);
   }
   public void randomReplant(){
       randomInt=(int) (Math.random()*15);
       System.out.println("We are replanting "+randomInt+" vegetables today!");
   }
   public void veggieOfTheDay(String veggie){
       System.out.println("Today's chosen veggie is "+veggie+".");
   }
   public void countFlowers(){
       for(int i=2;i<=6;i=i+1){
           System.out.println(i);
       }
       for(int i=20;i<=110;i=i+30){
           System.out.println(i);
       }
       for (int i=8;i>=0;i=i-1){
           System.out.print(i+",");
       }
   }
   public void changeTemperature(){
       randomNum=Math.random();
       if (randomNum<0.25){
           System.out.println("The temperature has decreased by 2 degrees");
       }
       else if(randomNum<0.5){
           System.out.println("The temperature has decreased by 1 degree.");
       }
       else if(randomNum<0.75){
           System.out.println("The temperature has increased by 1 degree.");
       }
       else if(randomNum<1){
           System.out.println("The temperature has increased by 2 degrees");
       }
   }
   public void starTriangle(int size) {
       this.size=size;
       if(size<=3) {
           System.out.println("*");
           System.out.println("**");
           System.out.println("***");
       }
       else if (size<=5){
           System.out.println("*");
           System.out.println("**");
           System.out.println("***");
           System.out.println("****");
           System.out.println("*****");
       }
       else if(size<=7){
           System.out.println("*");
           System.out.println("**");
           System.out.println("***");
           System.out.println("****");
           System.out.println("*****");
           System.out.println("******");
           System.out.println("*******");
       }
   }
   public void perimeterTriangle(int size){
       this.size=size;
       if(size<=3) {
           System.out.println("-");
           System.out.println("--");
           System.out.println("---");
       }
       else if (size<=5){
           System.out.println("-");
           System.out.println("--");
           System.out.println("-*-");
           System.out.println("-**-");
           System.out.println("-----");
       }
       else if(size<=7) {
           System.out.println("-");
           System.out.println("--");
           System.out.println("-*-");
           System.out.println("-**-");
           System.out.println("-***-");
           System.out.println("-****-");
           System.out.println("-------");
       }
   }
    public static void main(String[] args) {
        Greenhouse greenhouse=new Greenhouse();
    }
}
