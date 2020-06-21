package com.young.service.impl;

import com.young.entity.TypePO;
import com.young.entity.TypePOExample;
import com.young.mapper.TypePOMapper;
import com.young.service.api.TypePOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author young
 * @Description
 * @date 2020-06-21 8:58
 */
@Service
public class TypePOServiceImpl implements TypePOService {

    @Autowired
    private TypePOMapper typePOMapper;

    @Override
    public List<TypePO> getTypePOList() {

        List<TypePO> typePOList = typePOMapper.selectByExample(new TypePOExample());

        return typePOList;

    }
}
