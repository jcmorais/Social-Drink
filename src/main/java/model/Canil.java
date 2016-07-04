package model;

/**
 * Created by carlosmorais on 02/07/16.
 */
public class Canil {
    private int id;
    private String name;
    private String address;
    private String description;
    private String schedule;
    private String email;
    private int phone;
    private long opening_date;
    private String city;
    private Double lat;
    private Double lng;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public long getOpening_date() {
        return opening_date;
    }

    public void setOpening_date(long opening_date) {
        this.opening_date = opening_date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Canil{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", description='" + description + '\'' +
                ", schedule='" + schedule + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", opening_date=" + opening_date +
                ", city='" + city + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
