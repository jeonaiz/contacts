package kg.megacom.contacts.models;


import com.fasterxml.jackson.annotation.JsonFormat;
import kg.megacom.contacts.models.enums.Category;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "contacts")

public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;
    String surname;
    String phoneNumber;
    String email;
    String company;
    @JsonFormat(pattern = "dd.MM.yyyy hh:mm:ss")
    Date addDate;
    boolean active;

    @Enumerated(value = EnumType.STRING)
    Category category;

}
