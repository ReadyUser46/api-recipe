package com.skuggi.apirecipe.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum MeasurementUnit {

    GR("gramo", "g"),
    GRS("gramos", "g"),
    KG("kilogramo", "kg"),
    UD("unidad", "ud"),
    UDS("unidades", "uds");

    final String name;
    final String abrev;


}
