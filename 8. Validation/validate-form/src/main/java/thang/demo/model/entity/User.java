package thang.demo.model.entity;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Component
public class User implements Validator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotNull(message = "Not Null")
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @Min(18)
    private int age;
    @Email(message = "Wrong email format")
    private String eMail;

    public User(Integer id, @NotNull(message = "Not Null") String firstName, String lastName, String phoneNumber, @Min(18) int age, @Email(message = "Wrong email format") String eMail) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.eMail = eMail;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        if ((user.firstName.length() <= 5) || (user.firstName.length() >= 45)) {
            errors.rejectValue("firstName", "user.firstName");
        }
        if ((user.lastName.length() <= 5 || user.lastName.length() >= 45)) {
            errors.rejectValue("lastName", "user.lastName");
        }
        if (user.phoneNumber.length() > 11 || user.phoneNumber.length() < 10) {
            errors.rejectValue("phoneNumber", "number.length");
        }
        if (!user.phoneNumber.startsWith("0")) {
            errors.rejectValue("phoneNumber", "number.startsWith");
        }
        if (!user.phoneNumber.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phoneNumber", "number.matches");
        }
    }
}