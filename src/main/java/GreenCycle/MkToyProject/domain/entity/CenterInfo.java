package GreenCycle.MkToyProject.domain.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Builder;
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

    @JsonIgnore
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
