package pl.sda.javaldz6.project.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Hotel {

    @Id
    @GeneratedValue
    private Long hotelId;

    private String name;
    private Double standard;
    private String description;
    @ManyToOne
    @JoinColumn(name = "cityId", nullable = false)
    private City cityId;
}
