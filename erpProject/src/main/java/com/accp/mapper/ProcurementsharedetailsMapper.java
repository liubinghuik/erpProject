package com.accp.mapper;

import com.accp.domain.Procurementsharedetails;
import com.accp.domain.ProcurementsharedetailsExample;
import com.accp.domain.ProcurementsharedetailsKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcurementsharedetailsMapper {
    int countByExample(ProcurementsharedetailsExample example);

    int deleteByExample(ProcurementsharedetailsExample example);

    int deleteByPrimaryKey(ProcurementsharedetailsKey key);

    int insert(Procurementsharedetails record);

    int insertSelective(Procurementsharedetails record);

    List<Procurementsharedetails> selectByExample(ProcurementsharedetailsExample example);

    Procurementsharedetails selectByPrimaryKey(ProcurementsharedetailsKey key);

    int updateByExampleSelective(@Param("record") Procurementsharedetails record, @Param("example") ProcurementsharedetailsExample example);

    int updateByExample(@Param("record") Procurementsharedetails record, @Param("example") ProcurementsharedetailsExample example);

    int updateByPrimaryKeySelective(Procurementsharedetails record);

    int updateByPrimaryKey(Procurementsharedetails record);
}