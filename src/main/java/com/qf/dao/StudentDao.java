package com.qf.dao;

import com.qf.bean.Grade;
import com.qf.bean.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import javax.jws.WebService;
import java.util.List;

public interface StudentDao extends Repository<Student,Integer> {
    //根据学生id查询学生信息(包含年级信息)
    public Student findBySid(int sid);

    //现在有一个年级名称，需要查询出该年级的学生信息
    //public List<Student>  findByGrade_Cname(String cname);

    @Query("FROM Student s where   s.grade.cname=:gradename")
    public List<Student>  findgradename(@Param("gradename") String cname);

    //根据学生的id或姓名进行查询
   // public List<Student> findBySidOrSname(int sid,String sname);
   // @Query(value = "from Student where sid=?1 or sname=?2")
   // public List<Student> findstudents(int sid,String sname);

 //  @Query("from  Student  where sid=:stuid or sname=:stuname")
 //  public List<Student> findstudents(@Param("stuid") int sid,@Param("stuname") String sname);

    @Query(value = "select * from student where sid=?1 or sname=?2",nativeQuery = true)
    public List<Student> findstudents(@Param("stuid") int sid,@Param("stuname") String sname);

    //根据学生id删除学生信息
    @Modifying
    @Query("delete  from Student where sid=?1")
    public int delete(int sid);
}
