package ro.mpp.domain;

public class Event extends Entity<Integer>{
    private String name;
    private Integer referee;

    public Event(Integer integer, String name, Integer referee) {
        super(integer);
        this.name = name;
        this.referee = referee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReferee() {
        return referee;
    }

    public void setReferee(Integer referee) {
        this.referee = referee;
    }
}
