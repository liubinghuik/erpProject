package com.accp.mapper;

import com.accp.domain.Customercategory;
import com.accp.domain.CustomercategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomercategoryMapper {
    int countByExample(CustomercategoryExample example);

    int deleteByExample(CustomercategoryExample example);

    int deleteByPrimaryKey(String classid);

    int insert(Customercategory record);

    int insertSelective(Customercategory record);

    List<Customercategory> selectByExample(CustomercategoryExample example);

    Customercategory selectByPrimaryKey(String classid);

    int updateByExampleSelective(@Param("record") Customercategory record, @Param("example") CustomercategoryExample example);

    int updateByExample(@Param("record") Customercategory record, @Param("example") CustomercategoryExample example);

    int updateByPrimaryKeySelective(Customercategory record);

    int updateByPrimaryKey(Customercategory record);
}