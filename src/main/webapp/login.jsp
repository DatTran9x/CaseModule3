<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 12/29/2021
  Time: 10:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
      <link rel="stylesheet" href="csslogin.css">
  </head>
  <body>
  <div>
      <h1 id="welcome">Welcome!</h1>
  </div>
  <div class="container">
      <div class="Form-fields">
          <div id="login">
              <form method="post">
                  <fieldset class="clearfix">
                      <p><span class="fontawesome-user"></span><input type="text" value="Username" onBlur="if(this.value == '') this.value = 'Username'" onFocus="if(this.value == 'Username') this.value = ''" required></p>
                      <p><span class="fontawesome-lock"></span><input type="password"  value="Password" onBlur="if(this.value == '') this.value = 'Password'" onFocus="if(this.value == 'Password') this.value = ''" required></p>
                      <p><input type="submit" value="Sign In"></p>
                  </fieldset>
              </form>
              <p>Not a member ? <a href="/signup.jsp" class="blue">Sign up now</a><span class="fontawesome-arrow-right"></span></p>
          </div>
      </div>
  </div>
  </body>
</html>
