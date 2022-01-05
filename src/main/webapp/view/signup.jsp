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
    <link rel="stylesheet" href="/view/csssignup.css">
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
                    <p><span class="fontawesome-user"></span><input type="text" name="Username" value="Email"></p> <!-- JS because of IE support; better: placeholder="Username" -->
                    <p><span class="fontawesome-lock"></span><input type="password" name="Password" value="Password"></p> <!-- JS because of IE support; better: placeholder="Password" -->
                    <p><span class="fontawesome-lock"></span><input type="text" name="phonenumber" value="Phonenumber" ></p>
                    <p><span class="fontawesome-lock"></span><input type="text" name="name" value="Name" ></p>
                    <p><input type="submit" value="Sign Up"></p>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
</html>
