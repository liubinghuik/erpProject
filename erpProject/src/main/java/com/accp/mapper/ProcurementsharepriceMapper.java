package com.accp.mapper;

import com.accp.domain.Procurementshareprice;
import com.accp.domain.ProcurementsharepriceExample;
import com.accp.domain.ProcurementsharepriceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcurementsharepriceMapper {
    int countByExample(ProcurementsharepriceExample example);

    int deleteByExample(ProcurementsharepriceExample example);

    int deleteByPrimaryKey(ProcurementsharepriceKey key);

    int insert(Procurementshareprice record);

    int insertSelective(Procurementshareprice record);

    List<Procurementshareprice> selectByExample(ProcurementsharepriceExample example);

    Procurementshareprice selectByPrimaryKey(ProcurementsharepriceKey key);

    int updateByExampleSelective(@Param("record") Procurementshareprice record, @Param("example") ProcurementsharepriceExample example);

    int updateByExample(@Param("record") Procurementshareprice record, @Param("example") ProcurementsharepriceExample example);

    int updateByPrimaryKeySelective(Procurementshareprice record);

    int updateByPrimaryKey(Procurementshareprice record);
}