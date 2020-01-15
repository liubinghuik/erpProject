package com.accp.mapper;

import com.accp.domain.Supplieraddress;
import com.accp.domain.SupplieraddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplieraddressMapper {
    int countByExample(SupplieraddressExample example);

    int deleteByExample(SupplieraddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Supplieraddress record);

    int insertSelective(Supplieraddress record);

    List<Supplieraddress> selectByExample(SupplieraddressExample example);

    Supplieraddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Supplieraddress record, @Param("example") SupplieraddressExample example);

    int updateByExample(@Param("record") Supplieraddress record, @Param("example") SupplieraddressExample example);

    int updateByPrimaryKeySelective(Supplieraddress record);

    int updateByPrimaryKey(Supplieraddress record);
}