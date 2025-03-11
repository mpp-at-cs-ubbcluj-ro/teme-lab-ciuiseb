package ro.mpp.domain;

public class Result extends Entity<Integer>{
    private Integer event;
    private Integer referee;
    private Integer participant;
    private Integer points;
    private Discipline discipline;

    public Result(Integer integer, Integer event, Integer referee, Integer participant, Integer points, Discipline discipline) {
        super(integer);
        this.event = event;
        this.referee = referee;
        this.participant = participant;
        this.points = points;
        this.discipline = discipline;
    }

    public Integer getEvent() {
        return event;
    }

    public void setEvent(Integer event) {
        this.event = event;
    }

    public Integer getReferee() {
        return referee;
    }

    public void setReferee(Integer referee) {
        this.referee = referee;
    }

    public Integer getParticipant() {
        return participant;
    }

    public void setParticipant(Integer participant) {
        this.participant = participant;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }
}
