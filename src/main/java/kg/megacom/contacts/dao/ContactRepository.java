package kg.megacom.contacts.dao;

import kg.megacom.contacts.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    Contact findByPhoneNumber(String phoneNumber);

    int countByPhoneNumber(String phoneNumber);

    boolean existsByPhoneNumber(String phoneNumber);


}
