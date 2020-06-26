package app.bar.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Bar {
    private int id;
    private String name;
}
