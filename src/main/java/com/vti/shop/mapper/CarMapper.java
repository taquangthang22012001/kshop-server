package com.vti.shop.mapper;

import com.vti.shop.dto.CarDto;
import com.vti.shop.entity.Car;
import com.vti.shop.form.CarCreateForm;
import com.vti.shop.form.CarUpdateForm;

public class CarMapper {
    public static Car map(CarCreateForm form) {
         var car = new Car();
         var pk = new Car.PrimaryKey();
         pk.setLicense_plate(form.getLicensePlate());
         pk.setRepairDate(form.getRepairDate());
         car.setPk(pk);
         car.setCustomerName(form.getCustomerName());
         car.setCatalogs(form.getCatalogs());
         car.setCarMaker(form.getCarMaker());
         return car;
    }

    public static CarDto map(Car car) {
        var dto = new CarDto();
        var pk = car.getPk();
        dto.setLicensePlate(pk.getLicense_plate());
        dto.setRepairDate(pk.getRepairDate());
        dto.setCustomerName(car.getCustomerName());
        dto.setCatalogs(car.getCatalogs());
        dto.setCarMaker(car.getCarMaker());
        return dto;
    }

    public static void map(CarUpdateForm form, Car car) {
        car.setCustomerName(form.getCustomerName());
        car.setCatalogs(form.getCatalogs());
        car.setCarMaker(form.getCarMaker());
    }
}
