<html>

<head>
<title>PACS 008 Generator</title>
<style type="text/css">
.buttons
{
	overflow:auto;
	text-align: center;
	font-size: 1.0em;
	font-weight: bold;
	line-height: 200%;
	color: #fff;
	background-color: #EFBB07;
	border-radius: 5px;
	border: solid #cccccc 1px;
	box-shadow: 2px 2px 1px #888888;
	clear:right;
	float:center;
	width:125px;
	
}
.buttons1
{
	overflow:auto;
	text-align: center;
	font-size: 1.0em;
	font-weight: bold;
	line-height: 200%;
	color: #fff;
	background-color: #EFBB07;
	border-radius: 5px;
	border: solid #cccccc 1px;
	box-shadow: 2px 2px 1px #888888;
	clear:right;
	float:center;
	width:425px;
	
}
input[type=text] {
	height: 25px;
	position: relative;
	border: 1px solid #cdcdcd;
	border-color: rgba(0, 0, 0, .15);
	background-color: #FBFBFB;
	font-size: 16px;
}
input:focus {
  background-color: #D6EAF8;
}
.label{
	font-size: 14px;
	font-family: Georgia, serif;
	color: #fff;
	font-weight: bold;
	
	
}
.header1{
	font-size: 24px;
	font-family: Georgia, serif;
	color: #fff;
	font-weight: bold;
	font-style: italic;
	
	
}

</style>
</head>

<body background="/images/map1.jpg">
	<font color="red">${errorMessage}</font>
	<form method="post">
		<table>
		<tr>
		<img src="/images/neonit.jpg">
		</tr>
		<tr><td  class="header1"><br>
		Transaction File Download</td>
		</tr>
		</table>
		<br>
		<br>
		<br>
		<table class="label">
		<tr>	
			<td colspan=3 align="center">
		<br>
				<input type="button" value="Populate Random Data" class="buttons1"/>
			</td>
			<td colspan=2 align="center">
		<br>
				<input type="button" value="Download File Directly" class="buttons1"/>
			</td>
			
		</tr>
		
		<tr>
			<td>
				Fr FIId FinInstnId 
			</td>
			<td>
				<input type="text" name="frFIIdFinInstnId" tabindex=1/>
			</td>
			<td>
			</td>
			<td>
				To FIId FinInstnId  
			</td>
			<td>
				<input type="text" name="toFIIdFinInstnId" tabindex=1/>
			</td>
		</tr>
		
		<tr>
			<td>
				InstgAgt FinInstnId 
			</td>
			<td>
				<input type="text" name="instgAgt" tabindex=2/>
			</td>
			<td>
			</td>
			<td>
				InstdAgt FinInstnId 
			</td>
			<td>
				<input type="text" name="instdAgt" tabindex=3/>
			</td>
		</tr>
		
		<tr>
			<td>
				InterBankSttlmtAmount 
			</td>
			<td>
				<input type="text" name="intrBkSttlmAmt" tabindex=4/>
			</td>
		</tr>
		
		<tr>
			<td>
				DbtrAcct ID 
			</td>
			<td>
				<input type="text" name="dbtrAcctId" tabindex=5/>
			</td>
			<td>
			</td>
			<td>
				DbtrAcct Issr 
			</td>
			<td>
				<input type="text" name="dbtrAcctIssr" tabindex=6/>
			</td>
		</tr>
		<tr>
			<td>
				DbtrAgt FinInstnId 
			</td>
			<td>
				<input type="text" name="dbtrAgtFinInstnId" tabindex=7/>
			</td>			
			<td>
			</td>
			<td>
				CdtrAgt FinInstnId 
			</td>
			<td>
				<input type="text" name="cdtrAgtFinInstnId" tabindex=8/>
			</td>
		</tr>
		<tr>
			<td>
				CdtrAcct ID
			</td>
			<td>
				<input type="text" name="cdtrAcctId" tabindex=9/>
			</td>		
			<td>
			</td>
			<td>
				CdtrAcct Issr  
			</td>
			<td>
				<input type="text" name="cdtrAcctIssr" tabindex=10/>
			</td>
		</tr>
			
		<tr>	
			<td colspan=5 align="center">
		<br>
				<input type="submit" value="Download" class="buttons" tabindex=11/>
			</td>
			
		</tr>
		
	</form>
</body>

</html>