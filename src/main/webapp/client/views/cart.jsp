<%@ page import="com.example.t2009m1helloworld.util.ShoppingCartHelper" %>
<%@ page import="com.example.t2009m1helloworld.entity.Cart" %>
<%@ page import="com.example.t2009m1helloworld.entity.CartItem" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ShoppingCartHelper cartHelper = new ShoppingCartHelper(request);
    Cart cart = cartHelper.getCart();
%>
<html>
<jsp:include page="/client/components/head.jsp"/>
<body>
<div class="content-wrapper min-vh-100">
    <div class="container">
        <div class="card">
            <div class="card-body">
                <h4 class="card-title">Bordered table</h4>
                <p class="card-description">
                    Add class <code>.table-bordered</code>
                </p>
                <div class="table-responsive pt-3">
                    <table class="table table-bordered">
                        <thead>
                        <tr>
                            <th>
                                #
                            </th>
                            <th>
                                Thumbnail
                            </th>
                            <th>
                                Product name
                            </th>
                            <th>
                                Price
                            </th>
                            <th>
                                Quantity
                            </th>
                            <th>
                            </th>
                        </tr>
                        </thead>
                        <tbody>
                        <% for (CartItem item : cart.getListItem()) { %>
                        <tr>
                            <td>
                                <%= item.getProductId() %>
                            </td>
                            <td>
                                <img src="<%= item.getProductThumbnail() %>" alt="product" width="50" height="50">
                            </td>
                            <td>
                                <%= item.getProductName() %>
                            </td>
                            <td>
                                <%= item.getUnitPrice() %>
                            </td>
                            <td>
                                <%= item.getQuantity() %>
                            </td>
                        </tr>
                        <% } %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/client/components/scripts.jsp"/>
</body>
</html>
