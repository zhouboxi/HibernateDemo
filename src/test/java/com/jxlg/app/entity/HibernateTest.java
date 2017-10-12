package com.jxlg.app.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("all")

public class HibernateTest {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    @Before
    public  void init(){
        sessionFactory=new Configuration().configure().buildSessionFactory();
        session = sessionFactory.openSession();
        transaction = session.beginTransaction();
    }
    @Test//多对一
    public void testManyToOne(){
        User user = new User();
        user.setName("Tom");
        user.setBirthday(new Date(System.currentTimeMillis()));

        Address address1 = new Address();
        address1.setAddress("北京");
        address1.setUser(user);

        Address address2 = new Address();
        address2.setAddress("上海");
        address2.setUser(user);

        session.save(address1);
        session.save(address2);

    }
    @Test//单向一对多
    public void testOneToMany(){
        Man man = new Man();
        man.setName("男人");
        Set<Girl> girls=new HashSet<Girl>();
        Girl girl1 = new Girl();
        Girl girl2 = new Girl();
        girl1.setName("女人1");
        girl2.setName("女人2");
        girls.add(girl1);
        girls.add(girl2);
        man.setGirls(girls);
        session.save(man);
    }

    @Test//双向一对多
    public void testOneToMany2(){
        People people = new People();
        people.setName("老王");
        Animal animal1 = new Animal();
        animal1.setName("哈士奇");
        animal1.setPeople(people);
        Animal animal2 = new Animal();
        animal2.setName("土狗");
        animal2.setPeople(people);
        HashSet<Animal> animals = new HashSet<Animal>();
        animals.add(animal1);
        animals.add(animal2);
        people.setAnimals(animals);
        session.save(people);
    }
    @Test//双向一对多 由多的一方删除
    public void testOneToMany2Delete(){
        Animal animal = session.get(Animal.class, "8a831c465f108bf8015f108bfb450001");
        session.delete(animal);
    }

    @Test//双向一对多从多的一方查询一会懒加载
    public void testLazyotm(){
        Animal animal = session.get(Animal.class, "8a831c465f10563a015f10563f9a0001");
        System.out.println(animal);
        System.out.println(animal.getPeople());
        System.out.println(animal.getPeople().getName());
    }
    @Test//多对多
    public void testManyToMany(){
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        teacher1.setName("俊哥哥");
        teacher2.setName("阿三");
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        student1.setName("涛哥");
        student2.setName("阿伟");
        student3.setName("海鑫");
        student4.setName("阿柯");
        Set<Student> students1=new HashSet<Student>();
        students1.add(student1);
        students1.add(student2);
        Set<Student> students2=new HashSet<Student>();
        students2.add(student3);
        students2.add(student4);
        Set<Teacher> teachers=new HashSet<Teacher>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teacher1.setStudents(students1);
        teacher2.setStudents(students2);
        session.save(teacher1);
        session.save(teacher2);
    }

    @After
    public  void destroy(){
        transaction.commit();
        session.close();
    }

}