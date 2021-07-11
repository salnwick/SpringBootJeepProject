package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

///Need to figure out the solution without this
@SuppressWarnings("unused")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication(scanBasePackageClasses = {ComponentScanMarker.class})
public class JeepSales {

  public static void main(String[] args) {
    SpringApplication.run(JeepSales.class, args);

  }

}
