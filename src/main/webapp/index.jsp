<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.t2009m1helloworld.model.sql_modal.MySqlProductModel" %>
<%@ page import="com.example.t2009m1helloworld.entity.Product" %>
<%@ page import="java.util.List" %>
<%
    MySqlProductModel productModel = new MySqlProductModel();
    List<Product> products = productModel.getAll();
%>
<html>
<jsp:include page="/client/components/head.jsp"/>
<body>
<div class="content-wrapper min-vh-100">
    <div class="container">
        <div class="row">
            <%
                for (Product product : products) {%>
            <div class="col-md-3">
                <div class="card shadow-lg overflow-hidden">
                    <div class="card-body p-0 ">
                        <div style="object-fit: cover;height: 180px" class="w-100 overflow-hidden">
                            <img class="w-100" src="<%=product.getThumbnail()%>" alt="<%=product.getName()%>">
                        </div>
                        <div class="p-2">
                            <div class="mt-3 text-center">
                                <h4 style="
                                min-height: 40px;
                                    display: inline-block;
                                    word-wrap: break-word;
                                    white-space: normal;
                                    overflow: hidden;
                                    display: -webkit-box;
                                    text-overflow: ellipsis;
                                    -webkit-box-orient: vertical;
                                    -webkit-line-clamp: 2;"
                                    class="text-center "><%=product.getName()%>
                                </h4>
                                <h5><%=product.getPrice()%>
                                </h5>
                            </div>
                            <a href="/cart/add?productId=<%=product.getId()%>&quantity=1" class="btn btn-primary w-100">Add to cart</a>
                        </div>

                    </div>
                </div>
            </div>
            <%}%>

        </div>
    </div>
</div>
<jsp:include page="/client/components/scripts.jsp"/>
</body>
</html>