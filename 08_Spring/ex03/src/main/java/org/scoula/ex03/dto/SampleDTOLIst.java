package org.scoula.ex03.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SampleDTOLIst {
    private List<SampleDTO> list;

    public SampleDTOLIst() {
        list = new ArrayList<>();
    }
}
