package com.dl.niubike1.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "bike")
public class Bike {

    @Id
    private String id;

    private int status;

    private String qrCode;

    private Double latitude;

    private Double longitude;
}
