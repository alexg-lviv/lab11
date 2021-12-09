package builder;

import lombok.Builder;
import lombok.ToString;

import java.util.List;

@Builder @ToString
public class User {
    private String firstName;
    private String lastName;
    private List<String> occupations;
    private List<String> genders;
    private int age;
    private int weight;
    private String address;
    private int postIndex;
}
