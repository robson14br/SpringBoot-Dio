package dio.dio_spring_security_jwt.security;

import java.sql.Date;
import java.util.List;

import io.jsonwebtoken.lang.Arrays;

public class JWTObject {
    @SuppressWarnings("unused")
    private String subject; //nome do usuario
    @SuppressWarnings("unused")
    private Date issuedAt; //data de criação do token
    @SuppressWarnings("unused")
    private Date expiration; // data de expiração do token
    @SuppressWarnings("unused")
    private List<String> roles; //perfis de acesso
    
 
    
    public void setSubject(String subject) {
        this.subject = subject;
    }



    public void setIssuedAt(java.util.Date date) {
        this.issuedAt = date;
    }



    public void setExpiration(java.util.Date date) {
        this.expiration = date;
    }



    public void setRoles(List<String> roles) {
        this.roles = roles;
    }



    public String getSubject() {
        return subject;
    }



    public Date getIssuedAt() {
        return issuedAt;
    }



    public Date getExpiration() {
        return expiration;
    }



    public List<String> getRoles() {
        return roles;
    }



    public void setRoles(String... roles){
        this.roles = Arrays.asList(roles);
    }



    public void setIssuedAt(java.util.Date issuedAt2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIssuedAt'");
    }



    public void setExpiration(java.util.Date expiration2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setExpiration'");
    }
}