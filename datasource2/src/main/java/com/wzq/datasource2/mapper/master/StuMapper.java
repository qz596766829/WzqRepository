package com.wzq.datasource2.mapper.master;


import com.wzq.datasource2.entity.master.Stu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author virus_plus
 * @since 2019-06-29
 */
@Mapper
public interface StuMapper {

    List<Stu> getAllStu();
}
