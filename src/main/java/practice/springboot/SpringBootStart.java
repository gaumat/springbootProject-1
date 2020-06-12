package practice.springboot;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;





@SpringBootApplication
@EnableAutoConfiguration
public class SpringBootStart 
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringBootStart.class, args); 
    }
    

  
    
}
