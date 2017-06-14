package edu.teldir.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Anton German &lt;AGerman@luxoft.com&gt;
 * @version 1.0 27.04.12
 */
public class MyUserDetailsService implements UserDetailsService {
    private String username;
    private String password;
    private Collection<String> roles;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (username == null || !username.equals(this.username)) {
            throw new UsernameNotFoundException("No user found: " + username);
        }

        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>(roles.size());
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(role));
        }

        return new User(this.username, this.password, authorities);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Collection<String> roles) {
        this.roles = roles;
    }
}
