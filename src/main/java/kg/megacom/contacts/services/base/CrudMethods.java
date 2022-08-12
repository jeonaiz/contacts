package kg.megacom.contacts.services.base;

public interface CrudMethods<T, S> {



    T save(T t);
    T findById(S id);


}
