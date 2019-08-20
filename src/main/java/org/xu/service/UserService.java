package org.xu.service;

import org.springframework.stereotype.Service;
import org.xu.entity.User;

import java.util.List;

public interface UserService {
    void insert(User user);
    List<User> QueryAll();
}
