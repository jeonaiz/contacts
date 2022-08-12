package kg.megacom.contacts.services;

import kg.megacom.contacts.models.Contact;
import kg.megacom.contacts.services.base.CrudMethods;

import java.util.List;

public interface ContactService extends CrudMethods<Contact, Long> {

    List<Contact> findByActive(boolean active);


}

