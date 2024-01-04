package com.vti.shop.service;

import com.vti.shop.dto.AccessoryDto;
import com.vti.shop.entity.Accessory;
import com.vti.shop.form.AccessoryCreateForm;
import com.vti.shop.form.AccessoryUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AccessoryService {
    Page<AccessoryDto> findAll(Pageable pageable);

    AccessoryDto create(AccessoryCreateForm form);

    AccessoryDto update(AccessoryUpdateForm form, Long id);

    void deleteById(Long id);
}
