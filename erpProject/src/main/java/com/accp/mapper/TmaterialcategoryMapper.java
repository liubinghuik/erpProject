package com.accp.mapper;

import com.accp.domain.Tmaterialcategory;
import com.accp.domain.TmaterialcategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmaterialcategoryMapper {
    int countByExample(TmaterialcategoryExample example);

    int deleteByExample(TmaterialcategoryExample example);

    int deleteByPrimaryKey(Integer classid);

    int insert(Tmaterialcategory record);

    int insertSelective(Tmaterialcategory record);

    List<Tmaterialcategory> selectByExample(TmaterialcategoryExample example);

    Tmaterialcategory selectByPrimaryKey(Integer classid);

    int updateByExampleSelective(@Param("record") Tmaterialcategory record, @Param("example") TmaterialcategoryExample example);

    int updateByExample(@Param("record") Tmaterialcategory record, @Param("example") TmaterialcategoryExample example);

    int updateByPrimaryKeySelective(Tmaterialcategory record);

    int updateByPrimaryKey(Tmaterialcategory record);
}