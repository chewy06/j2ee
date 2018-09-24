<%@page import="com.gcit.lms.entity.Branch"%>
<%@page import="com.gcit.lms.entity.Book"%>
<%@page import="com.gcit.lms.entity.Borrower"%>
<%@page import="com.gcit.lms.service.AdminService"%>
<%@page import="com.gcit.lms.service.LibrarianService"%>
<%
	AdminService service = new AdminService();
	LibrarianService iservice = new LibrarianService();
	Integer branchId = Integer.parseInt(request.getParameter("branchId"));
	Integer bookId = Integer.parseInt(request.getParameter("bookId"));
	Integer cardNo = Integer.parseInt(request.getParameter("cardNo"));
	Branch branch = service.getBranchByPk(branchId);
	Book book = service.getBookByPk(bookId);
	Borrower borrower = service.getBorrowerByPk(cardNo);
%>
<div>
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal"
			aria-label="Close">
			<span aria-hidden="true">&times;</span>
		</button>
		<h4 class="modal-title">Check out page</h4>
	</div>
	<form action="checkoutClient" method="post">
		<div class="modal-body">
			<p><%=borrower.getName()%>
				checking out book
				<%=book.getTitle()%>
				from library branch
				<%=branch.getBranchName()%></p>

			<input type="hidden" name="branchId" value="<%=branchId%>"> <input
				type="hidden" name="bookId" value="<%=bookId%>"> <input
				type="hidden" name="cardNo" value="<%=cardNo%>">
		</div>
		<div class="modal-footer">
			<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			<button type="submit" class="btn btn-primary">Checkout</button>
		</div>
	</form>
</div>