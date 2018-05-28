package com.ramesh.ood.principles.singleresponsibility.good;

public class UserService implements IUserService {

	private EmailInfo emailInfo;
	private IEmailService emailService;
	public void registerUser(User user) {
		// save user to database
		// send mail to user for verification.
		
		emailInfo = new EmailInfo("some subject", "some body", user.getEmail());
		emailService = new EmailService();
		emailService.sendEmail(emailInfo);
	}
}
