<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 1/1/2022
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Details</title>
    <link rel="stylesheet" href="/view/details.css">
</head>
<body>
<h2 class="checkout"><a href="/home">Back</a></h2>
<div class="wrapper">
        <div class="card">
            <div class="product-left">
                <div class="header">
                    <h1>${requestScope["list"].name}</h1>
                </div>
                <!--DESCRIPITON / DETAILS-->
                <div class="product-main">
                    <div class="focus">
                        <span>Description</span>
                        <span>Details</span>
                    </div>
                    <p>${requestScope["list"].motasp}</p>
                </div>
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
                        <h3>Price</h3>
                        <p>${requestScope["list"].price}</p>
                    </div>
                </div>
                <!-- ADD TO CART BUTTON -->
                <div class="product-btns">
                    <a href="/home?action=addProductToCart&id_product=${requestScope["list"].id}" class="product-add">Add To Cart</a>
                </div>
            </div>
            <div class="product-right">
                <img src="${requestScope["list"].img}" alt="">
            </div>
        </div>
</div>
</body>
</html>
