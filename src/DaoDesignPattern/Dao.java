package DaoDesignPattern;

import java.util.List;

public interface Dao<T>{
	public List<T> getAll();
    public T getId(int id);

    void insert(T t);

    void delete(T t);
}

//T is generic class type 
