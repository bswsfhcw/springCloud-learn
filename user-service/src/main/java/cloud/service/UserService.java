package cloud.service;


import cloud.domain.User;

import java.util.List;

/**
 * @author  bswsf
 */
public interface UserService {
    void create(User user);

    User getUser(Long id);

    void update(User user);

    void delete(Long id);

    User getByUsername(String username);

    List<User> getUserByIds(List<Long> ids);
}
