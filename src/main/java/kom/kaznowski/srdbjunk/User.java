package kom.kaznowski.srdbjunk;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    public String name;
    public String id;

}
