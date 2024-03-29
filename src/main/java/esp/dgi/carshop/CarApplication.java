package esp.dgi.carshop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@SpringBootApplication
public class CarApplication {

    private static final Logger logger = LoggerFactory.getLogger(CarApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
        logger.info("Car app started ! Goto http://localhost:8081/dic_student_name");
    }
}
@RestController
@RequestMapping(value = "/dic_student_name")
class CarController{
    @Value("${fullname:Elhadji Ousamne SOW}")
    private String fullname;
    @GetMapping
    public String getFullname(){
        return "work done by "+this.fullname+" !";
    }

}
