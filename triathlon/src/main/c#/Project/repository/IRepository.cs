using System;
using System.Collections.Generic;
using Ro.Mpp.Domain;

namespace Ro.Mpp.Repository
{
    public interface IRepository<ID, E> where E : Entity<ID>
    {
        /// <summary>
        /// Finds the entity by its ID.
        /// </summary>
        /// <param name="id">The ID of the entity to be returned. ID must not be null.</param>
        /// <returns>An <see cref="Optional"/> encapsulating the entity with the given ID.</returns>
        /// <exception cref="ArgumentException">Thrown if the ID is null.</exception>
        Optional<E> FindOne(ID id);

        /// <summary>
        /// Finds all entities.
        /// </summary>
        /// <returns>All entities.</returns>
        IEnumerable<E> FindAll();

        /// <summary>
        /// Saves the given entity.
        /// </summary>
        /// <param name="entity">The entity must not be null.</param>
        /// <returns>An <see cref="Optional"/> - null if the entity was saved, otherwise the entity (id already exists).</returns>
        /// <exception cref="ArgumentException">Thrown if the given entity is null.</exception>
        Optional<E> Save(E entity);

        /// <summary>
        /// Deletes the entity with the specified ID.
        /// </summary>
        /// <param name="id">ID must not be null.</param>
        /// <returns>An <see cref="Optional"/> - null if there is no entity with the given ID, otherwise the removed entity.</returns>
        /// <exception cref="ArgumentException">Thrown if the ID is null.</exception>
        Optional<E> Delete(ID id);

        /// <summary>
        /// Updates the given entity.
        /// </summary>
        /// <param name="entity">The entity must not be null.</param>
        /// <returns>An <see cref="Optional"/> - null if the entity was updated, otherwise (e.g. id does not exist) returns the entity.</returns>
        /// <exception cref="ArgumentException">Thrown if the given entity is null.</exception>
        Optional<E> Update(E entity);
    }

    public class Optional<T>
    {
        public T Value { get; }
        public bool HasValue { get; }

        public Optional(T value)
        {
            Value = value;
            HasValue = value != null;
        }

        public static Optional<T> Empty() => new Optional<T>(default(T));
    }
}
