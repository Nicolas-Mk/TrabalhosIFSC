
package Model.DAO;

import java.util.List;

public interface InterfaceDAO<T> {
    
    public abstract void Create(T objeto);
    
    public abstract List<T> Retrieve();
    public abstract T Retrieve (int parPK);
    public abstract T Retrieve(String parString);
    
    public abstract void Update(T objeto);
    
    public abstract void Delete(T objeto);
}
