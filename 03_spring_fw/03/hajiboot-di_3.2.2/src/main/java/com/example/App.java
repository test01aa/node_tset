package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class App {
//public class App implements CommandLineRunner {
//    @Autowired
//    CustomerRepository customerRepository;
//
//    @Override
//    public void run(String... strings) throws Exception {
//        // データ追加
//        Customer created = customerRepository.save(new Customer(null, "Sugio", "Deki"));
//        System.out.println(created + " is created!");
//        // データ表示
////        customerRepository.findAll()
////                .forEach(System.out::println);
//        customerRepository.findAllOrderByName()
//        .forEach(System.out::println);
//    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
