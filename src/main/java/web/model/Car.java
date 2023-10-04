package web.model;

public class Car {

    private Long id;
    private String model;
    private String series;
    private int cost;

    public Car() {
    }

    public Car(Long id, String model, String series, int cost) {
        this.id = id;
        this.model = model;
        this.series = series;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
