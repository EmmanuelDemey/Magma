package fr.insee.rmes.model.datasets;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Id {
    private String id;

    public Id(String id) {
        this.id=id;
    }

    @Override
    public String toString() {
        return id ;
    }
}
