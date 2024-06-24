cat <<EOL > mycollage/src/main/java/com/example/mycollage/ServletInitializer.java
package com.example.mycollage;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MyCollageApplication.class);
    }
}
EOL
