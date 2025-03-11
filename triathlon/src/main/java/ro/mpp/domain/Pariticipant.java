package ro.mpp.domain;

public class Pariticipant extends Entity<Integer>{
    private String name;

    public Pariticipant(Integer integer, String name) {
        super(integer);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
