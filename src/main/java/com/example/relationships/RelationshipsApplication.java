package com.example.relationships;

import com.example.relationships.manytomany.entity.Course;
import com.example.relationships.manytomany.entity.Student;
import com.example.relationships.manytomany.repository.CourseRepository;
import com.example.relationships.onetomany.entity.DistrictBi;
import com.example.relationships.onetomany.entity.DistrictUni;
import com.example.relationships.onetomany.entity.ProvinceBi;
import com.example.relationships.onetomany.entity.ProvinceUni;
import com.example.relationships.onetomany.repository.ProvinceBiRepository;
import com.example.relationships.onetomany.repository.ProvinceUniRepository;
import com.example.relationships.onetoone.entity.Address;
import com.example.relationships.onetoone.entity.User;
import com.example.relationships.onetoone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RelationshipsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RelationshipsApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;
    @Autowired
    ProvinceUniRepository provinceUniRepository;
    @Autowired
    ProvinceBiRepository provinceBiRepository;
    @Autowired
    CourseRepository courseRepository;

    @Override
    public void run(String... args) throws Exception {

        //OneToOne
        {
//            Address address = new Address(5, "çatalca2");
//
//            User user = new User(2, "Görkem", address);
//            address.setUser(user);
//            userRepository.save(user);

        }



//********************************************************************************
        //OneToMany - Unidirectional
        {
//            DistrictUni district1 = new DistrictUni(1,"Çatalca");
//            DistrictUni district2 = new DistrictUni(2,"Kağıthane");
//            DistrictUni district3 = new DistrictUni(3,"Beylikdüzü");
//            List<DistrictUni> districts1 = new ArrayList<>();
//            districts1.add(district1);
//            districts1.add(district2);
//            districts1.add(district3);
//
//            DistrictUni district4 = new DistrictUni(4,"Süleymanpaşa");
//            DistrictUni district5 = new DistrictUni(5,"Çorlu");
//            DistrictUni district6 = new DistrictUni(6,"Malkara");
//            List<DistrictUni> districts2 = new ArrayList<>();
//            districts2.add(district4);
//            districts2.add(district5);
//            districts2.add(district6);
//
//            ProvinceUni province1 = new ProvinceUni(1,"İstanbul",districts1);
//            ProvinceUni province2 = new ProvinceUni(2,"Tekirdağ",districts2);
//            provinceUniRepository.save(province1);
//            provinceUniRepository.save(province2);

        }



//********************************************************************************
        //OneToMany - Bidirectional
        {

//            ProvinceBi province1 = new ProvinceBi(1,"İstanbul");
//            ProvinceBi province2 = new ProvinceBi(2,"Tekirdağ");
//
//
//            DistrictBi district1 = new DistrictBi(1,"Çatalca",province1);
//            DistrictBi district2 = new DistrictBi(2,"Kağıthane",province1);
//            DistrictBi district3 = new DistrictBi(3,"Beylikdüzü",province1);
//
//
//
//            DistrictBi district4 = new DistrictBi(4,"Süleymanpaşa",province2);
//            DistrictBi district5 = new DistrictBi(5,"Çorlu",province2);
//            DistrictBi district6 = new DistrictBi(6,"Malkara",province2);
//
//            List<DistrictBi> districts1=new ArrayList<>();
//            districts1.add(district1);
//            districts1.add(district2);
//            districts1.add(district3);
//
//
//            List<DistrictBi> districts2=new ArrayList<>();
//            districts2.add(district4);
//            districts2.add(district5);
//            districts2.add(district6);
//
//
//            province1.setDistricts(districts1);
//            province2.setDistricts(districts2);
//
//
//
//            provinceBiRepository.save(province1);
//            provinceBiRepository.save(province2);

        }


//********************************************************************************
        //ManyToMany
        {
            Student student1=new Student("Görkem");
            Student student2=new Student("Selen");
            Student student3=new Student("Nil");
            Student student4=new Student("Zeynep");
            Student student5=new Student("Utku");
            Student student6=new Student("Eren");

            Course course1= new Course("Matematik");
            Course course2= new Course("Türkçe");

            //matematik kursuna öğrenci ekle
            course1.getStudentList().add(student1);
            course1.getStudentList().add(student2);
            course1.getStudentList().add(student3);
            course1.getStudentList().add(student4);
            //türkçe kursuna öğrenci ekle
            course2.getStudentList().add(student3);
            course2.getStudentList().add(student4);
            course2.getStudentList().add(student5);
            course2.getStudentList().add(student6);
            //matematik kursu alan öğrencilerin kurs listesine matematik kursunu ekle
            student1.getCourseList().add(course1);
            student2.getCourseList().add(course1);
            student3.getCourseList().add(course1);
            student4.getCourseList().add(course1);
            //türkçe kursu alan öğrencilerin kurs listesine türkçe kursunu ekle
            student3.getCourseList().add(course2);
            student4.getCourseList().add(course2);
            student5.getCourseList().add(course2);
            student6.getCourseList().add(course2);

            courseRepository.save(course1);
            courseRepository.save(course2);


        }


    }
}
