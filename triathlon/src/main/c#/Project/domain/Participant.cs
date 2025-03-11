namespace Ro.Mpp.Domain
{
    public class Participant : Entity<int>
    {
        public string Name { get; set; }

        public Participant(int id, string name) : base(id)
        {
            Name = name;
        }
    }
}