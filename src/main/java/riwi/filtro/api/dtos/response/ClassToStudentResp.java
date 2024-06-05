package riwi.filtro.api.dtos.response;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassToStudentResp {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime created_at;
    private Boolean active;
    private List<LessonToClassResp> lessons;
}
