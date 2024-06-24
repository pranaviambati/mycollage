cat <<EOL > src/main/java/com/example/mycollage/MyCollageApplication.java
package com.example.mycollage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyCollageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyCollageApplication.class, args);
    }
}
EOL
