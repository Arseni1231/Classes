package org.example;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null && !surname.isEmpty()) {
            this.surname = surname;
        } else {
            throw new IllegalArgumentException("Surname cannot be empty");
        }
    }


    @Override
    public String toString() {
        return name + " " + surname;
    }
}




