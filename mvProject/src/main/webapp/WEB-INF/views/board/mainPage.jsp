<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
</head>
<body>
	<div style="width:1200px; margin: 0 auto">
		<div class="container-fluid">
			<div class="row mz-3" style="height: 50px; background-color: lightgrey;">
				<div class="col"></div>
				<div class="col"></div>
				<div class="col"></div>		
				<div class="col">${sessionUserInfo.mb_nick}님 환영합니다</div>	
			</div>
			
			<div class="row mt-5">
				<div class="col-11"></div>
				<div class="col-1" style="align-content: center">
				
					<!-- Button trigger modal -->
					<button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop">
					   글쓰기
					</button>
					
					<!-- Modal -->
					<div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
					  <div class="modal-dialog">
					    <div class="modal-content">
					      <div class="modal-header">
					        <h1 class="modal-title fs-5" id="staticBackdropLabel">게시글 작성</h1>
					        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
					      </div>
					      
					      	<form action="./writeContentProcess" method="post">
					      		<div class="modal-body" style="height: 150%">
							        <div class="row">
							        	<div class="col"><strong>제목</strong></div>
							        	<div class="col"></div>
							        	<div class="col"></div>
							        </div>
							        <div class="row mt-1">
							        	<div class="col">
							        		<div class="form-floating">
											  <textarea class="form-control" name="bd_title" placeholder="Leave a comment here" id="floatingTextarea"></textarea>
											  <label for="floatingTextarea">title</label>
											</div>
							        	</div>
							        </div>
							         <div class="row mt-3">
							        	<div class="col"><strong>내용</strong></div>
							        	<div class="col"></div>
							        	<div class="col"></div>
							        </div>
							        <div class="row mt-1">
							        	<div class="col">
							        		<div class="form-floating">
											  <textarea class="form-control" name="bd_content" placeholder="Leave a comment here" id="floatingTextarea2" style="height: 100px"></textarea>
											  <label for="floatingTextarea2">content</label>
											</div>
							        	</div>
							        </div>
							      </div>
							      <div class="modal-footer">
							        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">취소</button>
							        <button type="submit" class="btn btn-primary">작성</button>
							      </div>
					      	</form>
					      	
					      
					    </div>
					  </div>
					</div>
					
				</div>
			</div>
			<div class="row mt-5">
				<div class="col">
					<table class="table text-center">
						  <thead>
						    <tr>
						      <th scope="col">글</th>
						      <th scope="col">제목</th>
						      <th scope="col">내용</th>
						      <th scope="col">작성자</th>
						      <th scope="col">날짜</th>
						    </tr>
						  </thead>
						  <tbody class="table-group-divider">
							<c:if test="${dataList.size() > 0}">
								<c:forEach begin="0" end="${dataList.size()-1 }" var="i">
									    <tr>
									      <th scope="row"></th>
									      <td>${dataList[i].boardVo.bd_title}</td>
									      <td>${dataList[i].boardVo.bd_content}</td>
									      <td>${dataList[i].memberVo.mb_nick}</td>
									      <td><fmt:formatDate value="${dataList[i].boardVo.bd_writedate}" pattern="yy.MM.dd" /></td>
									    </tr>
								</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
			</div>
			<c:if test="${dataList.size() == 0}">
				<div class="row">
					<div class="col">
						결과가 없습니다.
					</div>
				</div>
			</c:if>
			
			
		</div>
	</div>





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</body>
</html>