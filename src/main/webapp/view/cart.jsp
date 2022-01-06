<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 1/5/2022
  Time: 4:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="
    background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTOjzROjYPEIwkHo0Ok2hIFEIsAw9hQbMc9sA&usqp=CAU');
">
<div>
    <h2 class="checkout"><a href="/home">Back</a></h2>
</div>
<div id='cart'>
    <div class='items'>
        <h1>Shopping Cart</h1>
        <link rel="stylesheet" href="/view/cart.css">
        <ul>
            <li>
                <c:forEach items="${list}" var="p" varStatus="loop">
                    <div class='item'>
                        <div class='description'>
                            <h1>${p.nameProduct}</h1>
                            <button> <a href="/cart?action=delete&id_cart=${p.id}"> Remove </a> </button>
                        </div>

                        <div class='product_quantity'>
                            <div class='quantity_button'>
                                <div class='how_many'>${p.quantity}</div>
                                <div class='add_sub'>
                                    <div class='add'> <button><a href="/cart?action=plus&id_product=${p.idProduct}">+</a> </button> </div>
                                </div>
                                <div class='add_sub'>
                                    <div class='sub'> <button><a href="/cart?action=minus&id_product=${p.idProduct}">-</a></button> </div>
                                </div>
                            </div>
                        </div>
                        <div class='price'> ${p.price} </div>
                    </div>
                </c:forEach>
            </li>
        </ul>


    </div>
    <div class='subTotal'>
        <h1>Subtotal</h1>
        <h1>${requestScope["totalPrice"]}</h1>
        <div>
            <button class='checkout'><a href="/cart?action=payment"> Purchase</a></button>
        </div>
    </div>
</div>
</body>
</html>