namespace Ro.Mpp.Domain
{
    public class Event : Entity<int>
    {
        public string Name { get; set; }
        public int Referee { get; set; }

        public Event(int id, string name, int referee) : base(id)
        {
            Name = name;
            Referee = referee;
        }
    }
}