package service;

import dao.RoleDAO;
import model.Role;

import java.util.List;

public class RoleService {
    static List<Role> roleList = RoleDAO.findAll();

    public List<Role> findAllRole() {
        return roleList = RoleDAO.findAll();
    }
}
