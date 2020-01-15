package com.accp.mapper;

import com.accp.domain.Tadvancesdetail;
import com.accp.domain.TadvancesdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TadvancesdetailMapper {
    int countByExample(TadvancesdetailExample example);

    int deleteByExample(TadvancesdetailExample example);

    int deleteByPrimaryKey(Integer lineno);

    int insert(Tadvancesdetail record);

    int insertSelective(Tadvancesdetail record);

    List<Tadvancesdetail> selectByExample(TadvancesdetailExample example);

    Tadvancesdetail selectByPrimaryKey(Integer lineno);

    int updateByExampleSelective(@Param("record") Tadvancesdetail record, @Param("example") TadvancesdetailExample example);

    int updateByExample(@Param("record") Tadvancesdetail record, @Param("example") TadvancesdetailExample example);

    int updateByPrimaryKeySelective(Tadvancesdetail record);

    int updateByPrimaryKey(Tadvancesdetail record);
}