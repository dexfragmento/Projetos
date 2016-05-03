
package com.acnwebadmin.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Filipe Gomes
 */
@XmlRootElement
public class LoginDto
{

   private String login;
   private String senha;

   public String getLogin()
   {
      return login;
   }

   public void setLogin(String login)
   {
      this.login = login;
   }

   public String getSenha()
   {
      return senha;
   }

   public void setSenha(String senha)
   {
      this.senha = senha;
   }

}
