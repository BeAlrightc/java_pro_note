package com.xmcu.dao;

import com.xmcu.pojo.Worker;
import org.apache.ibatis.annotations.*;

public interface WorkerMapper {
    //根据Id查询信息
    @Select("select * from tb_worker where id=#{id}")
    Worker selectWorker(int id);
    //向表中插入信息
    @Insert("insert into tb_worker(name,age,sex,worker_id)"
    +"values(#{name},#{age},#{sex},#{worker_id})")
    int insertWorker(Worker worker);
    //更新表中信息
    @Update("update tb_worker set name=#{name},age=#{age},sex=#{sex},worker_id=#{worker_id}where id=#{id}")
    int updateWorker(Worker worker);
    //根据ID删除1表信息
    @Delete("delete from tb_worker where id=#{id}")
    int deleteWorker(int id);
    //param注解
    @Select("select * from tb_worker where id=#{param01} and name=#{param02}")
    Worker selectWorkerByIdAndName(@Param( "param01") int id,@Param("param02")String name);

}
