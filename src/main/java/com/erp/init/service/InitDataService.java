package com.erp.init.service;

import com.erp.init.dto.InitDataDto;
import com.erp.init.dto.response.InitDataResponse;

import java.util.List;

public interface InitDataService {
    List<InitDataDto> init();
}
