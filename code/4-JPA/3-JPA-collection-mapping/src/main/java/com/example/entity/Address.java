package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class Address {
    @Column(name="addr_type")
    @Enumerated(EnumType.STRING)
    public AddressType addressType;
    public String city;
    public String country;
}
