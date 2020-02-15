package com.dl.niubike1.pojo;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "logs")
public class Log {
    @Id
    private String id;

    private Date time;

    private String openid;

    private Double latitude;

    private Double longitude;
}
