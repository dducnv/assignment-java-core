<%--
  Created by IntelliJ IDEA.
  User: ducnv
  Date: 31/05/2022
  Time: 09:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.t2009m1helloworld.entity.Category" %>
<%@ page import="com.example.t2009m1helloworld.model.MySqlCategoryModel" %>
<%@ page import="com.example.t2009m1helloworld.entity.Product" %>
<html>
<jsp:include page="/admin/components/head.jsp"/>

<body>
<div class="container-scroller">
    <jsp:include page="/admin/components/navbar.jsp"/>
    <div class="container-fluid page-body-wrapper">
        <jsp:include page="/admin/components/sidebar.jsp"/>
        <div class="main-panel">

            <div class="content-wrapper">
                <div class="card">
                    <div class="card-body">
                        <h4 class="card-title">Basic Table</h4>
                        <p class="card-description">
                            Add class <code>.table</code>
                        </p>
                        <div class="table-responsive">
                            <table class="table">
                                <thead>
                                <tr>
                                    <th>id</th>
                                    <th>Title</th>
                                    <th>Thumbnail</th>
                                    <th>Quantity</th>
                                    <th>Price</th>
                                    <th>Category</th>
                                    <th>Description</th>
                                    <th>Details</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <%
                                    List<Product> products = (ArrayList<Product>) request.getAttribute("products");
                                    for (Product product : products) {%>
                                <tr>
                                    <td><%=product.getId()%>
                                    </td>
                                    <td><%=product.getTitle()%>
                                    </td>
                                    <td>
                                        <div style="width: 100px;height: 100px;object-fit: cover">
                                            <img style="width: 100%;height: 100%" src="<%=product.getThumbnail()%>"/>
                                        </div>

                                    </td>
                                    <td><%=product.getQuantity()%>
                                    </td>
                                    <td><%=product.getPrice()%>
                                    </td>
                                    <td><%=product.getCategoryId()%>
                                    </td>
                                    <td><%=product.getDescription()%>
                                    </td>
                                    <td><%=product.getDetails()%>
                                    </td>
                                    <td>
                                        <div class="btn-group" role="group" aria-label="Basic example">
                                            <button type="button" class="btn btn-outline-warning">edit</button>
                                            <button type="button" class="btn btn-outline-danger">delete</button>
                                        </div>
                                    </td>
                                </tr>
                                <%}%>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="/admin/components/scripts.jsp"/>
</body>
</html>
