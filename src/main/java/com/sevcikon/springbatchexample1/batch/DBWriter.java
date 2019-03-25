package com.sevcikon.springbatchexample1.batch;

import com.sevcikon.springbatchexample1.model.User;
import com.sevcikon.springbatchexample1.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void write(List<? extends User> users) throws Exception {

            userRepository.save(users);

    }
}
