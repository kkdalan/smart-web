package org.smart4j.smartweb.security;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.smart4j.framework.helper.DatabaseHelper;
import org.smart4j.plugin.security.SmartSecurity;

public class AppSecurity implements SmartSecurity {

	@Override
	public String getPassword(String username) {
		String sql = "SELECT password FROM user WHERE username = ? ";
		List<Map<String, Object>> results = DatabaseHelper.executeQuery(sql, username);
		return (String) results.get(0).get("password");
	}

	@Override
	public Set<String> getRoleNameSet(String username) {
		String sql = "SELECT r.role_name FROM user u, user_role ur, role r WHERE u.id = ur.user_id AND r.id = ur.role_id AND u.username = ? ";
		List<Map<String, Object>> results = DatabaseHelper.executeQuery(sql, username);
		Set<String> roleNameSet = new HashSet<String>();
		for (Map<String, Object> result : results) {
			roleNameSet.add((String) result.get("role_name"));
		}
		return roleNameSet;
	}

	@Override
	public Set<String> getPermissionNameSet(String roleName) {
		String sql = "SELECT p.permission_name FROM role r, role_permission rp, permission p WHERE r.id = rp.role_id AND p.id = rp.permission_id AND r.role_name = ? ";
		List<Map<String, Object>> results = DatabaseHelper.executeQuery(sql, roleName);
		Set<String> permissionNameSet = new HashSet<String>();
		for (Map<String, Object> result : results) {
			permissionNameSet.add((String) result.get("permission_name"));
		}
		return permissionNameSet;
	}

}
