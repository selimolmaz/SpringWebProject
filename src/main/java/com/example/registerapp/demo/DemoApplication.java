package com.example.registerapp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.registerapp.demo.repository.UserRepository")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

/* 1
 * UserDTO sınıfını oluşturduk: Kullanıcının adı, soyadı, e-posta ve şifre
 * bilgilerini içeren bir veri transfer nesnesi.
 * 2
 * UserRepository sınıfını oluşturduk: JPARepository sınıfını genişleten bir
 * arayüz. Bu, veritabanı işlemlerini gerçekleştirmek için kullanacağımız CRUD
 * işlevlerini içeriyor.
 * UserService arayüzünü oluşturduk: Bu arayüz, UserServiceImpl sınıfında
 * tanımladığımız tüm işlevleri içeriyor.
 * 3
 * UserServiceImpl sınıfını oluşturduk: Bu sınıf, UserService arayüzünde
 * tanımlanan tüm işlevleri uygular. Ayrıca, UserRepository sınıfını kullanarak
 * veritabanı işlemlerini gerçekleştirir.
 * 4
 * UserController sınıfını oluşturduk: Bu sınıf, HTTP isteklerini işlemek için
 * kullanacağımız REST API'larını içerir. Ayrıca, UserService sınıfını
 * kullanarak kullanıcı işlemlerini gerçekleştirir.
 * 
 * Bu değişiklikler, Spring Boot tabanlı bir web uygulamasında temel bir CRUD
 * işlevselliği sağlar.
 */