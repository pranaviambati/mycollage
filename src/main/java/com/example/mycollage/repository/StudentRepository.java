cat <<EOL > mycollage/src/main/java/com/example/mycollage/repository/StudentRepository.java
package com.example.mycollage.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.mycollage.model.Student;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByNameContainingIgnoreCase(String name);
}
EOL
