package com.accp.mapper;

import com.accp.domain.Suppliercategory;
import com.accp.domain.SuppliercategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SuppliercategoryMapper {
    int countByExample(SuppliercategoryExample example);

    int deleteByExample(SuppliercategoryExample example);

    int deleteByPrimaryKey(String classid);

    int insert(Suppliercategory record);

    int insertSelective(Suppliercategory record);

    List<Suppliercategory> selectByExample(SuppliercategoryExample example);

    Suppliercategory selectByPrimaryKey(String classid);

    int updateByExampleSelective(@Param("record") Suppliercategory record, @Param("example") SuppliercategoryExample example);

    int updateByExample(@Param("record") Suppliercategory record, @Param("example") SuppliercategoryExample example);

    int updateByPrimaryKeySelective(Suppliercategory record);

    int updateByPrimaryKey(Suppliercategory record);
}