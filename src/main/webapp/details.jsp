<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 1/1/2022
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
    <link rel="stylesheet" href="details.css">
</head>
<body>
<div class="wrapper">
    <div class="card">
        <div class="product-left">
            <div class="header">
                <h1>Drew House Shirt</h1>
                <h2>Smile Face</h2>
            </div>
            <!--DESCRIPITON / DETAILS-->
            <div class="product-main">
                <div class="focus">
                    <span>Description</span>
                    <span>Details</span>
                </div>
                <p>Lorem, ipsum dolor sit amet consectetur adipisicing elit. Ratione voluptatem quam vel, delectus expedita ullam asperiores laudantium modi. Voluptatum eum cum quis ea modi. Reiciendis asperiores aut beatae odit minima.</p>
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
                    <p>$13.99</p>
                </div>
            </div>
            <!-- ADD TO CART BUTTON -->
            <div class="product-btns">
                <a href="#" class="product-add">Add To Cart</a>
            </div>
        </div>
        <div class="product-right">
            <img src="https://cf.shopee.vn/file/0e8b55d9aaaab93554472b4a61a07e58" alt="">
        </div>
    </div>
</div>
</body>
</html>
