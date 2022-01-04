<%--
  Created by IntelliJ IDEA.
  User: 84374
  Date: 12/30/2021
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title> SAKMADIK </title>
    <link rel="stylesheet" href="csshome.css">
</head>
<body><a id="home-link" href="#">&nbsp;</a>
<div id="wrapper">
    <div class="panel-top">
        <div class="center clearfix">
            <div class="social">
                <a href="https://www.facebook.com/tranxuan.dat.1" class="s-fb">&nbsp;</a>
                <a href="https://www.facebook.com/tranxuan.dat.1" class="s-dribble">&nbsp;</a>
                <a href="https://www.facebook.com/tranxuan.dat.1" class="s-tw">&nbsp;</a>
                <a href="https://www.facebook.com/tranxuan.dat.1" class="s-mail">&nbsp;</a>
                <a href="https://www.facebook.com/tranxuan.dat.1" class="s-vimeo">&nbsp;</a>
            </div>
            <div class="basket">
                <a href="/view/cart.jsp"><span> CART </span></a>
            </div>
            <div class="login">
                <a href="/view/login.jsp"> LOGIN </a>
                <span>/</span>
                <a href="/view/signup.jsp"> SIGN UP </a>
            </div>
        </div>
    </div>

    <div id="header" class="center clearfix">
        <div id="logo" class="left">
            <a href="#">
                <img src="https://scontent.fhan3-2.fna.fbcdn.net/v/t1.6435-9/117229425_674141463187030_4941209283882753123_n.jpg?_nc_cat=107&ccb=1-5&_nc_sid=09cbfe&_nc_ohc=UiCFfubFppgAX9f0JrR&_nc_ht=scontent.fhan3-2.fna&oh=00_AT_g8usbIlZ18vNs0iCxzXlbEXbT6fGR5S1NGVo5CSir7g&oe=61F40071" height="60" width="61" alt="">
                <span> SakMaDik Streetwear </span>
            </a>
        </div>
        <ul class="nav right clearfix">
            <li class="active"><a href="/view/home.jsp"> HOME </a></li>
            <li><a href="#"> FEATURED </a></li>
            <li><a href="#"> MAN STYLE </a></li>
            <li><a href="#"> WOMAN STYLE </a></li>
            <li><a href="https://www.businessoffashion.com/news/"> FASHION NEWS </a></li>
            <li><a href="https://www.facebook.com/tranxuan.dat.1"> CONTACT US </a></li>
        </ul>
    </div>
    <div id="home">
        <div class="home-bg">
            <div class="center">
                <a href="" class="link-home"></a>
                <h2 class="title-home">
                    SaMaDik - Fashion may fade, but style lasts forever </h2>
                <ul class="breadcrumbds clearfix">
                    <li><a href="/view/home.jsp">Home</a><span class="sp">&raquo;</span></li>
                    <li><a href="#">Shop</a><span class="sp">&raquo;</span></li>
                    <li><span> “To be irreplaceable, you must always be different” </span></li>
                </ul>
            </div>
        </div>
    </div>

    <div class="sorting center clearfix">
        <ul class="s-category clearfix">
            <li class="active"><a href="/view/home.jsp">ALL</a></li>
            <li><a href="/view/tshirthome.jsp"> T-SHIRT </a></li>
            <li><a href="/view/sweaterhome.jsp"> SWEATER </a></li>
            <li><a href="/view/jackethome.jsp"> JACKET </a></li>
            <li><a href="/view/jeanhome.jsp"> JEANS </a></li>
            <li><a href="/view/othershome.jsp"> OTHERS </a></li>
        </ul>

        <div class="s-list">
            <a href="#" class="ic-squares">&nbsp;</a>
            <a href="#" class="ic-list">&nbsp;</a>
        </div>

        <div class="sel-sorting">
            <span>Sort by: </span>
            <select name="" id="">
                <option value="Alphabetically"> PRICE FROM LOW TO HIGH </option>
                <option value="Alphabetically"> PRICE FROM HIGH TO LOW </option>
            </select>
        </div>
    </div>


    <div class="middle clearfix center">
        <div class="sidebar">

            <h4 class="s-title">Search our products <span class="s-title-br"></span></h4>

            <form action="#" class="s-search">
                <input type="text" placeholder="Search..."/>
                <input type="submit" value="" />
            </form>

            <br>
            <br>

            <h4 class="s-title">Best Sellers <span class="s-title-br"></span></h4>

            <br>
            <br>

            <div class="s-products">
                <div class="s-products-item clearfix">
                    <div class="s-products-img">
                        <a href="details.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSsYiduiVprpfIkkYqF1J6Cd8biBh2-ClgMqQ&usqp=CAU" alt=""></a>
                    </div>
                    <div class="s-products-info">
                        <h6><a href="/view/details.jsp"> Bape Purple Hodie </a></h6>
                        <div class="rate">
                            <div style="width: 80%;"></div>
                        </div>
                        <span class="comments"><i class="ic-comment"></i> 99 people bought </span>
                    </div>
                </div>

                <div class="s-products-item clearfix">
                    <div class="s-products-img">
                        <a href="/view/details.jsp"><img src="https://cf.shopee.vn/file/0e8b55d9aaaab93554472b4a61a07e58" alt=""></a>
                    </div>
                    <div class="s-products-info">
                        <h6><a href="/view/details.jsp"> Drew House Shirt </a></h6>
                        <div class="rate">
                            <div style="width: 80%;"></div>
                        </div>
                        <span class="comments"><i class="ic-comment"></i> 99 people bought </span>
                    </div>
                </div>
            </div>

            <br>
            <br>

            <h4 class="s-title"> Our Categories <span class="s-title-br"></span></h4>

            <ul class="cat-list">
                <li><a href="/view/tshirthome.jsp"> T-SHIRT </a><span>(5)</span></li>
                <li><a href="/view/sweaterhome.jsp"> SWEATER </a><span>(3)</span></li>
                <li><a href="/view/jackethome.jsp"> JACKET </a><span>(8)</span></li>
                <li><a href="/view/jeanhome.jsp"> JEANS </a><span>(12)</span></li>
                <li><a href="/view/othershome.jsp"> OTHERS </a><span>(7)</span></li>
            </ul>

        </div>

        <div class="content">
            <div class="product-catalog clearfix">
                <div class="products">
                    <div class="p-img">
                        <span class="sale">Sale</span>
                        <a href="/view/details.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmORtYC8-4fWWWB82XSoynuEc4jaZd29zoGA&usqp=CAU" height="220" width="220" alt=""></a>
                    </div>
                    <div class="p-footer">
                        <h6><a href="/view/details.jsp"> LVuitton Bag </a>

                            <div class="rate">
                                <div style="width: 80%;"></div>
                            </div>

                            <p><strong>Lorem ipsum</strong> dolor sit amet an
                                adipiscing elit, sed diam nonu.</p>

                            <div class="p-footer-price clearfix">
                                <span class="price"> $14.99 </span>
                                <span class="price-new"> $9.99 </span>
                                <a href="/view/cart.jsp" class="right add-cart"> Add to cart </a>
                            </div>
                        </h6>
                    </div>
                </div>


                <div class="products">
                    <div class="p-img">
                        <a href="/view/details.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQpxB4Ex9mMtMtZ85-HxAWs0YL2nHLHcyeFag&usqp=CAU" height="220" width="220" alt=""></a>
                    </div>
                    <div class="p-footer">
                        <h6><a href="/view/details.jsp"> Adidas Bag </a></h6>

                        <div class="rate">
                            <div style="width: 80%;"></div>
                        </div>

                        <p><strong>Lorem ipsum</strong> dolor sit amet an
                            adipiscing elit, sed diam nonu.</p>

                        <div class="p-footer-price clearfix">
                            <span class="price-old">$11.99</span>
                            <a href="/view/cart.jsp" class="right add-cart">Add to cart</a>
                        </div>
                    </div>
                </div>

                <div class="products">
                    <div class="p-img">
                        <a href="/view/details.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ5J91oB3rdZ9sij8NiIQNfpI6E4ufW6THX3g&usqp=CAU" height="220" width="220" alt=""></a>
                    </div>
                    <div class="p-footer">
                        <h6><a href="/view/details.jsp"> Coverse 70s White </a></h6>

                        <div class="rate">
                            <div style="width: 80%;"></div>
                        </div>

                        <p><strong>Lorem ipsum</strong> dolor sit amet an
                            adipiscing elit, sed diam nonu.</p>

                        <div class="p-footer-price clearfix">
                            <span class="price-old">$17.99</span>
                            <a href="/view/cart.jsp" class="right add-cart">Add to cart</a>
                        </div>
                    </div>
                </div>

                <div class="products">
                    <div class="p-img">
                        <span class="sale">Sale</span>
                        <a href="/view/details.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8mQwjz_Altw9j7SPxjGPtOEqd5aAjM6QV6g&usqp=CAU" height="220" width="220" alt=""></a>
                    </div>
                    <div class="p-footer">
                        <h6><a href="/view/details.jsp"> Nike Jordan 1 </a></h6>

                        <div class="rate">
                            <div style="width: 80%;"></div>
                        </div>

                        <p><strong>Lorem ipsum</strong> dolor sit amet an
                            adipiscing elit, sed diam nonu.</p>

                        <div class="p-footer-price clearfix">
                            <span class="price">$14.99</span>
                            <span class="price-new">$8.99</span>
                            <a href="/view/cart.jsp" class="right add-cart">Add to cart</a>
                        </div>
                    </div>
                </div>

                <div class="products">
                    <div class="p-img">
                        <a href="/view/details.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQxy7CaeEdPR5hsVfdU_jLRTpXPKj2mHxMVBw&usqp=CAU" height="220" width="220" alt=""></a>
                    </div>
                    <div class="p-footer">
                        <h6><a href="/view/details.jsp"> Adidas StanSmith </a></h6>

                        <div class="rate">
                            <div style="width: 80%;"></div>
                        </div>

                        <p><strong>Lorem ipsum</strong> dolor sit amet an
                            adipiscing elit, sed diam nonu.</p>

                        <div class="p-footer-price clearfix">
                            <span class="price-old">$17.99</span>
                            <a href="/view/cart.jsp" class="right add-cart">Add to cart</a>
                        </div>
                    </div>
                </div>

                <div class="products">
                    <div class="p-img">
                        <a href="/view/details.jsp"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTMfXp7IZH4Vcaw0mlj5D1KVc3UY4Dwoq-vtA&usqp=CAU" height="220" width="220" alt=""></a>
                    </div>
                    <div class="p-footer">
                        <h6><a href="/view/details.jsp"> LVuitton Jeans </a></h6>

                        <div class="rate">
                            <div style="width: 80%;"></div>
                        </div>

                        <p><strong>Lorem ipsum</strong> dolor sit amet an
                            adipiscing elit, sed diam nonu.</p>

                        <div class="p-footer-price clearfix">
                            <span class="price-old">$23.59</span>
                            <a href="/view/cart.jsp" class="right add-cart">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>

            <br>
            <br>
            <br>

            <div class="pagination">
                <ul class="clearfix">
                    <li class="active"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">&raquo;</a></li>
                </ul>
            </div>

        </div>
    </div>

</div>



<div id="footer">
    <a href="#home-link" class="home-link">&nbsp;</a>
    <div class="center clearfix">
        <div class="f-about">
            <h5 class="f-title"> Little about us </h5>
            <p><b> SakMaDik </b> fashion brand leading the trendfashion brand leading the trend.
                We give you the value of style.
                <b> SakMaDik </b> It's not just fashion, it's a way of life. </p>
            <h5 class="f-title"> Connect with us </h5>
            <div class="f-social">
                <a href="" class="s-fb">&nbsp;</a>
                <a href="" class="s-tw">&nbsp;</a>
                <a href="" class="s-dribble">&nbsp;</a>
                <a href="" class="s-digg">&nbsp;</a>
                <a href="" class="s-mail">&nbsp;</a>
            </div>
        </div>
        <div class="f-archives">
            <h5 class="f-title">Our Archives</h5>
            <ul class="f-list">
                <li><a href="#">December 2021</a></li>
                <li><a href="#">Jun 2021</a></li>
                <li><a href="#">January 2020</a></li>
                <li><a href="#">December 2019</a></li>
            </ul>
        </div>
        <div class="f-populars">
            <h5 class="f-title"> Our Trending </h5>
            <div class="s-products-item clearfix">
                <div class="s-products-img">
                    <a href="#"><img src="https://cf.shopee.vn/file/ee1cf0aae0d36a1f24cc248e66a0c8f4" alt=""></a>
                </div>
                <div class="s-products-info">
                    <h6><a href="#"> Drew House for the summer vibe  </a></h6>
                    <span class="comments"><i class="ic-comment-white"></i> 69 comments</span>
                </div>
            </div>

            <div class="s-products-item clearfix">
                <div class="s-products-img">
                    <a href="#"><img src="https://cdn.cliqueinc.com/posts/284945/spring-jacket-trends-284945-1579285134572-main.700x0c.jpg" alt=""></a>
                </div>
                <div class="s-products-info">
                    <h6><a href="#"> Not only for men </a></h6>
                    <span class="comments"><i class="ic-comment-white"></i> 69 comments</span>
                </div>
            </div>
        </div>
        <div class="f-search">
            <h5 class="f-title"> Search our Site </h5>
            <form action="#">
                <input type="text" class="f-search-inp" placeholder="Enter Search..." />
            </form>
            <h5 class="f-title"> Hash Tag </h5>
            <a href="#" class="tags"> #Drew House </a>
            <a href="#" class="tags"> #Bape </a>
            <a href="#" class="tags"> #Jacket </a>
            <a href="#" class="tags"> #Crop Top </a>
            <a href="#" class="tags"> #90's </a>
        </div>
    </div>
    <div class="footer-bottom">
        <div class="center">
            <a href="/view/home.jsp"> Home </a>
            <a href="#"> Portfolio </a>
            <a href="#"> Sitemap </a>
            <a href="#"> Contact </a>
            <p class="right"> SaMaDik @2021 by PremiumCoding | All Rights Reserved </p>
        </div>
    </div>
</div>
</body>
</html>
