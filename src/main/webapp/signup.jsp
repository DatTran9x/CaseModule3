<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 12/30/2021
  Time: 8:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign up</title>
    <link rel="stylesheet" href="csssignup.css">
</head>
<body>
<div>
    <h1 id="welcome">Please Sign Up</h1>
</div>
<div class="container">
    <div class="Form-fields">
        <div id="login">
            <form method="post">
                <fieldset class="clearfix">
                    <p><span class="fontawesome-user"></span><input type="text" value="Username" onBlur="if(this.value == '') this.value = 'Username'" onFocus="if(this.value == 'Username') this.value = ''" required></p> <!-- JS because of IE support; better: placeholder="Username" -->
                    <p><span class="fontawesome-lock"></span><input type="password"  value="Password" onBlur="if(this.value == '') this.value = 'Password'" onFocus="if(this.value == 'Password') this.value = ''" required></p> <!-- JS because of IE support; better: placeholder="Password" -->
                    <p><input type="submit" value="Sign Up"></p>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
</html>
