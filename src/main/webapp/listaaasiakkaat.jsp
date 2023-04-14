<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="scripts/main2.js"></script>
<link href="scripts/style.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<table id="listaus">
		<thead>
			<tr>
				<th class="item1" colspan="2">Hakusana:</th>
				<th class="item2"><input type="text" id="hakusana"></th>
				<th class="item3"><input type="button" value="Hae"
					id="hakunappi" onclick="haeAsiakkaat()"></th>
			</tr>
			<tr>
				<th class="item4">Etunimi</th>
				<th class="item5">Sukunimi</th>
				<th class="item6">Puhelin</th>
				<th class="item7">Sposti</th>
				<th></th>
			</tr>
		</thead>
		<tbody id="tbody">
		</tbody>
	</table>
	<span id="ilmo"></span>
	<script>
		haeAsiakkaat();
	</script>
</body>
</html>