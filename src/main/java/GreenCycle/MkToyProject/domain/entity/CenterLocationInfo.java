package GreenCycle.MkToyProject.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "CenterLocationInfo")
public class CenterLocationInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "centerId", unique = true, nullable = false)
    private long id;

    @Column
    private double latitude;

    @Column
    private double longitude;

    @Column
    private String address;

}
