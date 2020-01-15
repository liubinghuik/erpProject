package com.accp.mapper;

import com.accp.domain.Collectionterms;
import com.accp.domain.CollectiontermsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollectiontermsMapper {
    int countByExample(CollectiontermsExample example);

    int deleteByExample(CollectiontermsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Collectionterms record);

    int insertSelective(Collectionterms record);

    List<Collectionterms> selectByExample(CollectiontermsExample example);

    Collectionterms selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Collectionterms record, @Param("example") CollectiontermsExample example);

    int updateByExample(@Param("record") Collectionterms record, @Param("example") CollectiontermsExample example);

    int updateByPrimaryKeySelective(Collectionterms record);

    int updateByPrimaryKey(Collectionterms record);
}