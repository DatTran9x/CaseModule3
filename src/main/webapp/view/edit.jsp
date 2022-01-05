<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 1/1/2022
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EDIT</title>
    <link rel="stylesheet" href="/view/editcss.css">
</head>
<body>
<div class="wrapper">
    <div class="card">
        <div class="product-left">
            <div class="header">
                <p>NAME PRODUCT</p>
                <br>
                <input type="text">
                <br><br>
                <p>TYPE</p>
                <br>
                <input type="text">
                <br><br>
                <p>CATEGORY</p>
                <br>
                <select>
                    <option value="">T-SHIRT</option>
                    <option value="">SWEATER</option>
                    <option value="">JACKET</option>
                    <option value="">JEANS</option>
                    <option value="">OTHERS</option>
                </select>
            </div>
            <br><br>
            <!--DESCRIPITON / DETAILS-->
            <div class="product-main">
                <div class="focus">
                    <span>Description</span>
                    <span>Details</span>
                </div>
                <textarea name="text" id="details" cols="15" rows="5"></textarea>
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
                    <h3>Price</h3>
                    <input type="text">
                </div>
            </div>
            
            <div class="product-btns">
                <a href="/admin?action=editProduct" class="product-add"> Edit </a>
            </div>
        </div>
        <div class="product-right">
            <img src="https://cf.shopee.vn/file/0e8b55d9aaaab93554472b4a61a07e58" alt="">
        </div>
    </div>
</div>
</body>
</html>
