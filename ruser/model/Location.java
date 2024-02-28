package com.ruser.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    private Street street;
    private String city;
    private String state;
    private String country;
    private int postcode;
    private Coordinates coordinates;
    private Timezone timezone;
}
