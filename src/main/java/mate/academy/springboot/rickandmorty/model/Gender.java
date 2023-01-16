package mate.academy.springboot.rickandmorty.model;

 enum Gender {
    MALE("Male"),
    FEMALE("Female"),
    GENDERLESS("Genderless"),
    UNKNOWN("unknown");

    private String value;
    Gender(String value) {
        this.value = value;
    }
}

