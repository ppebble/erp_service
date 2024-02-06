package com.erp.init.service;

import com.erp.init.dto.InitDataDto;
import com.erp.init.dto.response.InitDataResponse;
import com.erp.init.entity.InitDataEntity;
import com.erp.init.repository.InitDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InitDataServiceImpl implements InitDataService{
    private final InitDataRepository initDataRepository;

    @Transactional(readOnly = true)

    public List<InitDataDto> init(){
        List<InitDataEntity> initData = initDataRepository.findLicense();

    return initData.stream()
                .map(InitDataDto::toInitDataDto).collect(Collectors.toList());
    }


}
