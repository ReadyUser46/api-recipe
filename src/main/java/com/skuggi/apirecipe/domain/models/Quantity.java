package com.skuggi.apirecipe.domain.models;

import com.mrrobot.domain.enums.MeasurementUnit;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "quantities")
public class Quantity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_quantity")
    private int quantityId;

    @Column(name = "quantity")
    private float quantity;

    @Column(name = "unit")
    @Enumerated(EnumType.STRING)
    private MeasurementUnit measurementUnit;


}
