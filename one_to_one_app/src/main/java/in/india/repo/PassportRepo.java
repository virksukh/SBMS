package in.india.repo;
import in.india.entities.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
