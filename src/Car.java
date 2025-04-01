public class Car {
    private Integer id;
    private String plate;
    private String brand;
    private Integer year;
    private Double price;

    public Car() {}

    public Car(Integer id, String plate, String brand, Integer year, Double price) {
        this.id = id;
        this.plate = plate;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    
    public Car(String plate, String brand, Integer year, Double price) {
        this.plate = plate;
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    // public Integer getId() {
    //     return this.id;
    // }

    // public void setId(Integer id) {
    //     this = this.id;
    // }


    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }
}
