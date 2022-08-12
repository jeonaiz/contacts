package kg.megacom.contacts.services.impl;

import kg.megacom.contacts.dao.ContactRepository;
import kg.megacom.contacts.models.Contact;
import kg.megacom.contacts.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;


    public List<Contact> findByActive(boolean active) {
        return contactRepository.findAll();
    }


    public Contact save(Contact contact) {


        if (contactRepository.existsByPhoneNumber(contact.getPhoneNumber())){
            throw new RuntimeException("Такой контакт уже есть!");
        }


        contact.setAddDate(new Date());
        contact.setActive(true);
        return contactRepository.save(contact);
    }

    @Override
    public Contact findById(Long id) {
        return null;
    }
}

