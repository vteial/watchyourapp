println 'Url Fetch service starts...'
println '---------------------------'
try {
	//http://124.217.243.112:8181/harmoney2/housekeeping.html
	URL url = new URL('http://124.217.243.112:8181/harmoney2/housekeeping.html')
	def response = url.head()
	println "Status Code : $response.responseCode"
	response.headers.each{ header -> println "$header.name = $header.value" }
}
catch(Throwable t) {
	//t.printStackTrace(out)
	println t.printStackTrace()
}
println '---------------------------'
println 'Url Fetch service ends...'
