println 'Test Mail Service starts...'
println '---------------------------'

try {
	mail.send(
			from: 'watchyourapp@gmail.com',
			to: 'vteial@gmail.com',
			subject: 'Test Mail',
			textBody: 'Hi, This is test mail. Please ignore it.'
			)
	println 'Test mail successfully sent...'
}
catch(Throwable t) {
	println t.getMessage();
}
println '---------------------------'
println 'Test Mail Service ends...'
