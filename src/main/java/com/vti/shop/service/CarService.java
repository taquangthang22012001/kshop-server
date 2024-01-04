package com.vti.shop.service;

import com.vti.shop.dto.CarDto;
import com.vti.shop.entity.Car;
import com.vti.shop.form.CarCreateForm;
import com.vti.shop.form.CarUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CarService {
   Page<CarDto> findAll(Pageable pageable);

   CarDto create(CarCreateForm form);

   CarDto update(CarUpdateForm form);

   void deleteById(Car.PrimaryKey id);
}
