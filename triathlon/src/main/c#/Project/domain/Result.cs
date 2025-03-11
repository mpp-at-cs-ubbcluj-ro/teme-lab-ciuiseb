namespace Ro.Mpp.Domain
{
    public class Result : Entity<int>
    {
        public int EventId { get; set; }
        public int Referee { get; set; }
        public int Participant { get; set; }
        public int Points { get; set; }
        public Discipline Discipline { get; set; }

        public Result(int id, int eventId, int referee, int participant, int points, Discipline discipline) : base(id)
        {
            EventId = eventId;
            Referee = referee;
            Participant = participant;
            Points = points;
            Discipline = discipline;
        }
    }
}