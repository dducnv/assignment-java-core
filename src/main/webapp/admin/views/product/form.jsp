<%@ page import="com.example.t2009m1helloworld.model.sql_modal.MySqlCategoryModel" %>
<%@ page import="com.example.t2009m1helloworld.entity.Category" %>
<%@ page import="java.util.List" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/admin/components/head.jsp"/>
<%
    MySqlCategoryModel categoryModal = new MySqlCategoryModel();
    List<Category> categories = categoryModal.getAll();
%>
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
                                        <input type="text" class="form-control" name="name" id="exampleInputUsername1"
                                               placeholder="Title">
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Thumbnail</label>
                                        <input type="text" class="form-control" name="thumbnail" id="exampleInputEmail1"
                                               placeholder="Thumbnail">
                                    </div>
                                    <div class="row">
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="exampleInputPassword1">Price</label>
                                                <input type="number" class="form-control" name="price"
                                                       id="exampleInputPassword1" placeholder="Price">
                                            </div>
                                        </div>
                                        <div class="col-md-6">
                                            <div class="form-group">
                                                <label for="exampleInputConfirmPassword1">Quantity</label>
                                                <input type="number" class="form-control" name="quantity"
                                                       id="exampleInputConfirmPassword1" placeholder="Quantity">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label>Single select box using select 2</label>
                                        <select name="category_id" class="js-example-basic-single w-100">
                                            <%
                                                for (Category category : categories) {%>
                                            <option value="<%=category.getId()%>"><%=category.getName()%>
                                            </option>
                                            <%
                                                }
                                            %>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <label for="description">Description</label>
                                        <textarea id="#summernote-desc" class="form-control" id="description" name="description"
                                                  rows="4"></textarea>
                                    </div>
                                    <div class="form-group">
                                        <label for="details">Details</label>
                                        <textarea id="#summernote-details" class="form-control" id="details" name="details" rows="4"></textarea>
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
