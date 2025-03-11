namespace Ro.Mpp.Domain
{
    public abstract class Entity<ID>
    {
        public ID Id { get; private set; }

        protected Entity(ID id)
        {
            Id = id;
        }
    }
}