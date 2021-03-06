package com.infotech.entities;

import javax.persistence.*;

@Entity
@Table(name="address_table")
public class Address {

    @Id
    @Column(name="adress_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer addressId;

    @Column(name = "street_name",length=50)
    private String street;
    @Column(name = "city_name",length=50)
    private String city;
    @Column(name = "state_name")
    private String state;
    @Column(name = "pin_code")
    private Long pincode;

    @OneToOne(mappedBy="address")
    private Employee employee;

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public Long getPincode() {
        return pincode;
    }
    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                ", employee=" + employee +
                '}';
    }
}