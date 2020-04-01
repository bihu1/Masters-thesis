package pl.bihuniak.reactive8mr.visit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disease {
    @Id
    private Integer id;
    private String name;
}