<%--
  Created by IntelliJ IDEA.
  User: ducnv
  Date: 31/05/2022
  Time: 09:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/admin/components/head.jsp"/>
<body>
<div class="container-scroller">
    <jsp:include page="/admin/components/navbar.jsp"/>
    <div class="container-fluid page-body-wrapper">
        <jsp:include page="/admin/components/sidebar.jsp"/>
        <div class="main-panel">
            <div class="content-wrapper">
                <div class="row">
                    <div class="col-md-6 m-auto">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="card-title">Default form</h4>
                                <p class="card-description">
                                    Basic form layout
                                </p>
                                <form action="/product" method="post" class="forms-sample">
                                    <div class="form-group">
                                        <label for="exampleInputUsername1">Title</label>
                                        <input type="text" class="form-control" id="exampleInputUsername1" placeholder="Title">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Thumbnail</label>
                                        <input type="text" class="form-control" id="exampleInputEmail1" placeholder="Thumbnail">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Price</label>
                                        <input type="number" class="form-control" id="exampleInputPassword1" placeholder="Price">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputConfirmPassword1">Quantity</label>
                                        <input type="number" class="form-control" id="exampleInputConfirmPassword1" placeholder="Quantity">
                                    </div>
                                    <div class="form-group">
                                        <label for="description">Description</label>
                                        <textarea class="form-control" id="description" name="desc" rows="4"></textarea>
                                    </div>
                                    <div class="form-group">
                                        <label for="details">Details</label>
                                        <textarea class="form-control" id="details" name="details" rows="4"></textarea>
                                    </div>
                                    <button type="submit" class="btn btn-primary mr-2">Submit</button>
                                </form>
                            </div>
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
