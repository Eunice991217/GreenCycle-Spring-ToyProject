package GreenCycle.MkToyProject.domain.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReviewInfoDto {
    private String userName;
    private String content;
}
