package com.gstu.server.dao;

import com.gstu.server.model.User;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class UserDAO {
    @Autowired
    ResourceLoader resourceLoader;
    @SneakyThrows
    public List<User> getUsers(){
        Resource resource = resourceLoader.getResource("classpath:names.txt");
        List<String> userNames = Files.readAllLines(resource.getFile().toPath());
        List<User> users = new ArrayList<>();
        Random random = new Random();
        userNames.forEach(userNameLine -> {
            String[] splitName = userNameLine.split("\\s");
            int height = random.ints(150, 200)
                    .findFirst().orElse(170);
            int weight = random.ints(60, 90)
                    .findFirst()
                    .orElse(75);
            users.add(new User(splitName[1], splitName[0], weight, height));
        });
        return users;
    }
}
