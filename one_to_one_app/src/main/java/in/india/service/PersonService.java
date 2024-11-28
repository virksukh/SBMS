package in.india.service;
import in.india.entities.Passport;
import in.india.entities.Person;
import in.india.repo.PassportRepo;
import in.india.repo.PersonRepo;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class PersonService {
    private PersonRepo personRepo;
    private PassportRepo passportRepo;

    public PersonService(PersonRepo personRepo, PassportRepo passportRepo) {
        this.personRepo = personRepo;
        this.passportRepo = passportRepo;
    }

    public void savePersonWithPassport() {
        Passport passport = new Passport();
        passport.setPassportNumber("LHK786");
        passport.setPassportIssueDate(LocalDate.now());
        passport.setPassportExpiryDate(LocalDate.now().plusYears(10));

        Person person = new Person();
        person.setName("sukh");
        person.setGender("male");

        // associate entities
        person.setPassport(passport);
        passport.setPerson(person);

        // save person
        personRepo.save(person);
    }
}
