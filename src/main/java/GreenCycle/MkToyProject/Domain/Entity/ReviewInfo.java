package GreenCycle.MkToyProject.Domain.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "ReviewInfo")
public class ReviewInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reviewId", unique = true, nullable = false)
    private long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "detailId")
    private CenterInfo centerInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private UserInfo userInfo;

    @Column
    private String userName;

    @Column
    private String content;


}
