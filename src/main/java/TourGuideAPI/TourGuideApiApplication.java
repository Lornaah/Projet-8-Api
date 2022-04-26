package TourGuideAPI;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication(scanBasePackages = { "gpsUtil" })
public class TourGuideApiApplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SpringApplication.run(TourGuideApiApplication.class, args);
	}

}
