package GreenCycle.MkToyProject.Domain.Entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "CenterInfo")
public class CenterInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detailId", unique = true, nullable = false)
    private long detailId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "centerId")
    private CenterLocationInfo centerLocationInfo;

    @Column
    private String startTime;

    @Column
    private String endTime;

    @Column
    private String admin;

    @Column
    private String number;

    @Column
    private String name;

    @Column
    private String location;

    @Column
    private String items;

}
