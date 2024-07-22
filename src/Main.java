public class Main {
  private String model;
  private String colour;
  private Double price;
  private Boolean isAutomatic;

  public Main(String model, String colour, Double price, Boolean isAutomatic) {
      this.model = model;
      this.colour = colour;
      this.price = price;
      this.isAutomatic = isAutomatic;
  }
  public String GetModel(){
      return model;
    }
    public String GetColour(){
      return colour;
    }
    public Double GetPrice(){
      return price;
    }
    public Boolean isAutomatic(){
      return isAutomatic;
    }

   static Main car1 = new Main("Kia","White",50.000,true);
  static Main car2 = new Main("Tesla","Black",35.000,true);
  public static void main(String[] args) {
      System.out.println("========================");
  System.out.println("First car: ");
  System.out.println(car1.model);
  System.out.println(car1.colour);
  System.out.println(car1.price);
  System.out.println(car1.isAutomatic);

System.out.println("========================");

  System.out.println("Second car: ");
      System.out.println(car2.model);
      System.out.println(car2.colour);
      System.out.println(car2.price);
      System.out.println(car2.isAutomatic);


  }
}
