package kg.megacom.contacts.controllers;

import kg.megacom.contacts.models.Contact;
import kg.megacom.contacts.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;


    @PostMapping("/add")
    public Contact save(@RequestBody Contact contact){
        return contactService.save(contact);
    }
}

