package GreenCycle.MkToyProject.Domain.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "UserInfo")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId", unique = true, nullable = false)
    private long id;

    @Column
    private String nickname;

}
