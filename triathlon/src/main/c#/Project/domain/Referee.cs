namespace Ro.Mpp.Domain
{
    public class Referee : Entity<int>
    {
        public string Name { get; set; }
        public string Username { get; set; }
        public string Password { get; set; }

        public Referee(int id, string name, string username, string password) : base(id)
        {
            Name = name;
            Username = username;
            Password = password;
        }
    }
}