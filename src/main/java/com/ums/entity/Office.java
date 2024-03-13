package com.ums.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ums.dto.UserDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name="Office")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Office extends Base{

    @NotEmpty
    @Column(unique = true)
    private String officeName;

    @NotEmpty
    private String region;


  @OneToMany(mappedBy = "office", cascade = CascadeType.ALL)
  @JsonIgnore
  private List<OfficeBranch> officeBranches;
}