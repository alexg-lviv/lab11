package builder;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testToString() {
        User user = User.builder().age(10).firstName("Elon").lastName("Musk").address("Kozelnytska2E").build();
        Assertions.assertEquals("User(firstName=Elon, lastName=Musk, occupations=null, genders=null, age=10, weight=0, address=Kozelnytska2E, postIndex=0)", user.toString());
    }
}