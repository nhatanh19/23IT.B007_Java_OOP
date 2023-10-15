public class Author {
    String name, email;
    char gender;

    Author(String name , String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }


    String getName(){
        return name;
    }
    String getEmail(){
        return email;
    }
    void setEmail(String email){
        this.email = email;
    }
    char getGender(){
        return gender;
    }
    @Override
    public String toString(){
        return "Author [name="+name+",email="+email+",gender="+gender+"]";
    }
}
