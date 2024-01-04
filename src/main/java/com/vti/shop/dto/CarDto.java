package com.vti.shop.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
public class CarDto {

    private String licensePlate;

    private LocalDate repairDate;

    private String customerName;

    private String catalogs;

    private String carMaker;
}
