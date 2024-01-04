package com.vti.shop.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDate;

@Getter
@Setter
public class AccessoryUpdateForm {

    @NotBlank
    @Length(max = 10)
    private String licensePlate;

    @NotNull
    @PastOrPresent // Quá khứ hoặc hiện tại
    private LocalDate repairDate;

    @NotBlank
    @Length(max = 50)
    private String name;

    @NotNull
    @PositiveOrZero  // Giá phải lớn hơn hoặc = 0
    private Long price;

    @NotBlank
    @Length(max = 50)
    private String statusDamaged;

    @NotBlank
    @Length(max = 50)
    private String repairStatus;
}
