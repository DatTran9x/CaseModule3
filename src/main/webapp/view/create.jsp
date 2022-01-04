<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 1/1/2022
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new product</title>
    <link rel="stylesheet" href="/view/createecss.css">
</head>
<body>
<form action="/home?action=addProduct" method="post">
<div class="wrapper">
    <div class="card">
        <div class="product-left">
            <div class="header">
                <p>NAME PRODUCT</p>
                <br>
                <input type="text" name="name">
                <br><br>
                <p>TYPE</p>
                <br>
                <input type="text" name="type">
                <br><br>
                <p>CATEGORY</p>
                <br>
                <select name="category">
                    <option value="" name="category">T-SHIRT</option>
                    <option value="" name="category">SWEATER</option>
                    <option value="" name="category">JACKET</option>
                    <option value="" name="category">JEANS</option>
                    <option value="" name="category">OTHERS</option>
                </select>
            </div>
            <br><br>
            <!--DESCRIPITON / DETAILS-->
            <div class="product-main">
                <div class="focus">
                    <span>Description</span>
                    <span>Details</span>
                </div>
                <textarea name="description" id="details" cols="15" rows="5"></textarea>
            </div>
            <br><br>
            <!--CHOOSE PRODUCT DETAILS-->
            <div class="product-details">
                <div>
                    <div>
                        <p>SIZE</p>
                    </div>
                    <br>
                    <select>
                        <option>L</option>
                        <option>XL</option>
                        <option>XXL</option>
                    </select>
                </div>

                <br><br>

                <!--PRODUCT TOTAL-->
                <div class="product-total">
                    <h3> Price </h3>
                    <input type="text" name="price">
                </div>
            </div>

            <div class="product-btns">
                <input type="submit"> Create </input>
            </div>
        </div>
        //sua cai nay
        <div class="product-right">
            <img src="https://cf.shopee.vn/file/0e8b55d9aaaab93554472b4a61a07e58" alt="">
        </div>
    </div>
</div>
</form>
</body>
</html>
