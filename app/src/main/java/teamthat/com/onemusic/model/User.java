package teamthat.com.onemusic.model;

/**
 * Created by ASUS on 11/1/2016.
 */
public class User {
    String id;
    String name;
    String username;
    String password;
    String birthday;
    String address;
    String gender;
    String phone;
    String level;
    String email;
    String vip;
    String image;

    public User() {
    }

    public User(String id, String name, String username, String password, String birthday, String address, String gender, String phone, String level, String email, String vip, String image) {

        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
        this.phone = phone;
        this.level = level;
        this.email = email;
        this.vip = vip;
        this.image = image;

    }


    public String getId() {

        return this.id;
    }

    public void setId(String id) {
        this.id = id;

    }

    public String getName() {
        return  this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLevel() {
        return this.level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVip() {
        return this.vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
