package wad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliveApplication {

    public static void main(String[] args) {
        SpringApplication.run(AliveApplication.class, args);
    }

    public static String githubUrl() {
        return "https://github.com/laimikko1/wepa";
    }

    public static String travisUrl() {
        return "https://travis-ci.org/laimikko1/wepa/builds/310027619";
    }

    public static String herokuUrl() {
        return "https://wepanelonen.herokuapp.com";
    }
}
